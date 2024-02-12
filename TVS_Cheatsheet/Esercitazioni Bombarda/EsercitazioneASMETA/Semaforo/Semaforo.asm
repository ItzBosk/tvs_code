asm Semaforo

import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:
	// DOMAINS
	enum domain Stato = {VERDE | GIALLO | ROSSO}
	
	// FUNCTIONS
	controlled statoSemaforo: Stato
	monitored richiestaPassaggio: Boolean
	monitored timerPassed: Boolean

definitions:
	// DOMAIN DEFINITIONS

	// FUNCTION DEFINITIONS

	// RULE DEFINITIONS
	
	// INVARIANTS
	
	// PROPERTIES
	//
	CTLSPEC ag(statoSemaforo = ROSSO implies ax(statoSemaforo != VERDE))
	CTLSPEC ag(statoSemaforo = VERDE implies ax(statoSemaforo != ROSSO))
	CTLSPEC ag(statoSemaforo = ROSSO implies aw(statoSemaforo = ROSSO, richiestaPassaggio))
	
	// TRUE
	CTLSPEC ag((richiestaPassaggio and statoSemaforo = ROSSO) implies af(statoSemaforo = VERDE))
	// FALSA: se sono in giallo, non controllo la richiesta passaggio quindi non passo a verde
	CTLSPEC ag((richiestaPassaggio) implies af(statoSemaforo = VERDE))
	// VERA: se sono in giallo, poi vado in rosso e ricevo una nuova richiesta allora il cammino esiste
	CTLSPEC ag((richiestaPassaggio) implies ef(statoSemaforo = VERDE))
	
	// Più forte la prima
	CTLSPEC ag(ef (statoSemaforo = VERDE))
	CTLSPEC ef (statoSemaforo = VERDE)
	
	// MAIN RULE
	main rule r_Main =
		// Se la luce è ROSSA e arriva la richiesta dell'utente
		if statoSemaforo = ROSSO and richiestaPassaggio then
			statoSemaforo := VERDE
		else
			// Se la luce è VERDE ed il tempo è passato
			if statoSemaforo = VERDE and timerPassed then
				statoSemaforo := GIALLO
			else
				// Se la luce è GIALLA ed il tempo è passato
				if statoSemaforo = GIALLO and timerPassed then
					statoSemaforo := ROSSO
				endif
			endif
		endif
		
// INITIAL STATE
default init s0:
	function statoSemaforo = ROSSO
