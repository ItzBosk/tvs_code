
/* Ciclo semaforo: rosso - verde - giallo - rosso
 * Da rosso diventa verde solo se arriva una richiesta.
 * Cambia stato solo se è passato il timer
 */

asm Semaforo

import StandardLibrary 
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains --------------------------

	enum domain Stato = {ROSSO | VERDE | GIALLO}
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled statoSemaforo : Stato
	
	// monitorate
	monitored richiesta : Boolean		// richiedo = true, altrimenti false
	monitored timerPassed : Boolean		// cambia stato solo se timer passato (extra)
	
definitions:
	// -------------------------- Domain definitions --------------------------
	// non serve se non ho dei subset di un dominio

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------
	rule r_verde =
		statoSemaforo := VERDE
	
	rule r_rosso =
		statoSemaforo := ROSSO

	rule r_giallo =
		statoSemaforo := GIALLO

	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------
	
	// -------------------------- CTL --------------------------
	
	// non può mai passare a verde direttamente da rosso
	CTLSPEC ag(statoSemaforo = ROSSO implies ax(statoSemaforo != VERDE))
	// falsa, se riciesta deve succedere
	
	// se rosso resta sempre rosso, a meno che ci sia una riciesta
	CTLSPEC ag(statoSemaforo = ROSSO implies aw(statoSemaforo = ROSSO, richiesta = true))
	// aw() perché la richiesta potrebbe non avvenire mai
	
	// se c'è una richiesta, allora prima o poi diventa verde
	CTLSPEC ag((statoSemaforo = ROSSO and richiesta = true) implies af(statoSemaforo = VERDE))
	// oppure: se giallo non controllo la richiesta, però dopo timer diventa rosso, se poi ho richiesta -> passa a verde (VERA)
	CTLSPEC ag((richiesta = true) implies af(statoSemaforo = VERDE))
	// oppure: se in giallo, poi rosso, poi richiesta -> diventa verde (TRUE)
	CTLSPEC ag((richiesta = true) implies ef(statoSemaforo = VERDE))
	
	// in quasiasi istante, prima o poi potrebbe diventare verde
	CTLSPEC ef(statoSemaforo = VERDE)
	CTLSPEC ag(ef(statoSemaforo = VERDE))
	
	// -------------------------- Main rule--------------------------
	
	main rule r_main =
			// se rosso e richiesta
			if statoSemaforo = ROSSO and richiesta then
					r_verde[]
			else
				// se verde e timer passato
				if statoSemaforo = VERDE and timerPassed then
					r_giallo[]
				else
					// se giallo e timer passato
					if statoSemaforo = GIALLO and timerPassed then
						r_rosso[]
					endif
				endif
			endif

// -------------------------- Initial state --------------------------

default init s0:
	function statoSemaforo = ROSSO