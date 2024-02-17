asm semaforo
import ../STDL/CTLlibrary
import ../STDL/StandardLibrary
import ../STDL/LTLlibrary

signature:
	enum domain Color = {ROSSO | GIALLO | VERDE}
	controlled color : Color
	monitored change : Boolean
	
definitions:
	
	rule r_change($c in Boolean) = 
		par
			if color = ROSSO and $c then
				color := VERDE
			endif
			if color = VERDE then
				color := GIALLO
			endif
			if (color = GIALLO) then
				color := ROSSO
			endif
			
		endpar
	
//	LTLSPEC not f(color = ROSSO and ax(color = VERDE))
	//non puo mai passare a verde direttamente da rosso (FALSO) perche se pongo change = true posso passare da rosso a verde
	CTLSPEC not ef(color = ROSSO and ax(color = VERDE))
	//quando è rosso rimarrà sempre rosso a meno che ci sia una richiesta (VERO)
	CTLSPEC aw((color = ROSSO and not change) implies af(color = ROSSO), change)
	//se c'è una richesta allora prima o poi diventa verde (VERO)
	CTLSPEC ag((change and color = ROSSO) implies af(color = VERDE))
	//FALSE perche change può essere true quando color != ROSSO
	CTLSPEC ag((change) implies af(color = VERDE))
	//IN qualsiasi istante, prima o poi diventerà verde (FALSO) perche può andare in loop color = ROSSO e change = false
	CTLSPEC ag(af(color = VERDE)) // AG io qui usere ef
	
	
	//mia proprieta
	//se avviene una richiesta, allora successivamente diventerà VERDE E POI GIALLO
	CTLSPEC ag((change and color = ROSSO) implies ax(color = VERDE and ax(color = GIALLO)))
	//potrebbe non diventare mai rosso (FALSA) perchè nello stato iniziale si comincia con rosso
	CTLSPEC ef(ag(color != ROSSO))
	
	
	main rule r_Main = 
		let ($c = change) in
			r_change[$c]
		endlet

default init s0:
	function color = ROSSO