
asm Semaforo

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain Semaforo = {SA, SB}
	enum domain Colore = {VERDE, GIALLO, ROSSO}
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled coloreSemaforo : Semaforo -> Colore
	
	// monitorate
	monitored comando : Semaforo
	
definitions:

	// -------------------------- Rule definitions --------------------------

//	rule r_accendi =
//		statoForno := ACCESO

	// diventa giallo
	rule r_giallo($s in Semaforo) =
		coloreSemaforo($s) := GIALLO
	
	// diventa verde
	rule r_verde($s in Semaforo) =
		coloreSemaforo($s) := VERDE
		
	// diventa rosso
	rule r_rosso($s in Semaforo) =
		coloreSemaforo($s) := ROSSO

	// -------------------------- CTL --------------------------
	
	// non accade mai che i semafori siano entrambi verdi -> false
	CTLSPEC ag(coloreSemaforo(SA) = VERDE and coloreSemaforo(SB) = VERDE)
	
	// il semaforo 2 può diventare sempre verde (non solo allo stato iniziale) -> true
	CTLSPEC ef(coloreSemaforo(SB) = VERDE)
	
	// se un semaforo è verde allora l’altro è rosso -> true
	CTLSPEC ag((coloreSemaforo(SA) = VERDE implies coloreSemaforo(SB) = ROSSO) and
		(coloreSemaforo(SB) = VERDE implies coloreSemaforo(SA) = ROSSO))
	
	//  se entrambi i semafori sono rossi e viene scelto il semaforo 1, 
	// nello stato successivo il semaforo 1 è verde -> true
	CTLSPEC ag((forall $s in Semaforo with ag(coloreSemaforo($s) = ROSSO) and comando = SA) 
		implies ax(coloreSemaforo(SA) = VERDE))
		
	// il semaforo 1 non può mai essere verde - false
	CTLSPEC ag(coloreSemaforo(SA) != VERDE)
	
	// se SA giallo allora SA sarà sempre rosso in futuro -> falsa
	CTLSPEC ag(coloreSemaforo(SA) = GIALLO implies coloreSemaforo(SB) = VERDE)
	
	// non esiste mai un percorso in cui il SA diventa verde
	CTLSPEC ag(not ef(coloreSemaforo(SA) = VERDE))
	
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		par
			// entrambi rossi
			if coloreSemaforo(SA) = ROSSO and coloreSemaforo(SB) = ROSSO then
				if comando = SA then
					// comando su SA
					r_verde[SA]
				else
					// comando su SB
					if comando = SB then
						r_verde[SB]
					endif
				endif
			endif
			
			// SA verde, comando su SB
			if coloreSemaforo(SA) = VERDE and coloreSemaforo(SB) = ROSSO then
				if comando = SB then
					r_giallo[SA]
				endif
			endif
			
			// SA giallo, comando su SB
			if coloreSemaforo(SA) = GIALLO and coloreSemaforo(SB) = ROSSO then
				if comando = SB then
					r_rosso[SA]
				endif
			endif
			
			// SB verde, comando su SA
			if coloreSemaforo(SB) = VERDE and coloreSemaforo(SA) = ROSSO then
				if comando = SA then
					r_giallo[SB]
				endif
			endif
			
			// SB giallo, comando su SA
			if coloreSemaforo(SB) = GIALLO and coloreSemaforo(SA) = ROSSO then
				if comando = SA then
					r_rosso[SB]
				endif
			endif
		endpar

// -------------------------- Initial state --------------------------
default init s0:
	function coloreSemaforo($s in Semaforo) = ROSSO
