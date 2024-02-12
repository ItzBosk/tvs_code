asm Semaforo

import StandardLibrary
import CTLlibrary

signature:

enum domain ColoreSemaforo = {ROSSO | VERDE | GIALLO}

enum domain LuceSemaforo = { LIGHT1 | LIGHT2}

// controllata: le luci dei dei due semafori
controlled light: LuceSemaforo -> ColoreSemaforo

// monitorata: quale semaforo deve cambiare
monitored changeLight: LuceSemaforo

// data una luce mi restituisce l'altra
static otherLight: LuceSemaforo -> LuceSemaforo

definitions:

function otherLight($l in LuceSemaforo) = 
				if $l = LIGHT1 then LIGHT2 else LIGHT1 endif


// setta a verde
macro rule r_verde = if light(changeLight) = ROSSO and 
            light(otherLight(changeLight)) = ROSSO then light(changeLight):= VERDE endif

// proprietà temporali
// non accade mai che i semafori siano entrambi verdi
CTLSPEC  ag(not (light(LIGHT1) = VERDE and light(LIGHT2) = VERDE))
// oppure equivalente
CTLSPEC  not ef(light(LIGHT1) = VERDE and light(LIGHT2) = VERDE)
// la luce 2 può diventare VERDE sempre (non solo dalla stato iniziale)
CTLSPEC  ag(ef (light(LIGHT2) = VERDE)) 
// se un semaforo è verde allora l'altro è rosso
//CTLSPEC ag((forall $s in LuceSemaforo with 
//      light($s) = VERDE implies light(otherLight($s)) = ROSSO)) 
      
CTLSPEC ag(light(LIGHT1) = VERDE implies light(LIGHT2) = ROSSO) 

// una propreità con EX
// se light è rosso e viene scelto e light2 è rosso, allora nello stato successivo
// dieventa verde  
CTLSPEC ag((light(LIGHT1) = ROSSO and light(LIGHT2) = ROSSO 
           and changeLight = LIGHT1) implies ax(light(LIGHT1) = VERDE))
  
// qualche proprietà falsa per avere un controesempio 
// la luce 1 non può mai essere verde
CTLSPEC not ef(light(LIGHT1) = VERDE)
// sono sempre tutti rossi
CTLSPEC ag(light(LIGHT1) = ROSSO and light(LIGHT2) = ROSSO)



main rule r_changeLight = 
	par
		r_verde[]
         if light(changeLight) = VERDE then light(changeLight):= GIALLO endif
         if light(changeLight) = GIALLO then light(changeLight):= ROSSO endif
	endpar          



default init s0:
function light($l in LuceSemaforo) = ROSSO



