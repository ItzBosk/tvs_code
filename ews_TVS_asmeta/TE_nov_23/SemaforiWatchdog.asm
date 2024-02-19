
asm SemaforiWatchdog

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain Stato = {VERDE, ROSSO, LAMPEGGIA}
	
	domain Time subsetof Integer
	domain Prob subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	
	controlled statoMacchine: Stato
	controlled statoPedoni: Stato
	controlled timerPedoni: Time
	controlled timerMacchine: Time
	
	// monitorate
	monitored pulsante: Boolean
//	monitored guasto : Boolean
	
definitions:
	// -------------------------- Domain definitions --------------------------
	
	domain Time = {0 : 3}
	domain Prob = {0 : 1}

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------

	rule r_rosso = 
		if statoMacchine = VERDE then
			statoMacchine := ROSSO
		else
			if statoPedoni = VERDE then
				statoPedoni := ROSSO
			endif
		endif
		
		
	rule r_verde = 
		if timerMacchine = 3 then
			// verde per le macchine
			par
				statoMacchine := VERDE
				timerMacchine := 0
			endpar
		else
			if timerPedoni = 3 then
				// verde per i pedoni
				par
					statoPedoni := VERDE
					timerPedoni := 0
				endpar
			endif
		endif
	
	// guasto si o no	
	rule r_guasto = 
		par
			statoMacchine := LAMPEGGIA
			statoPedoni := LAMPEGGIA
		endpar
	

	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------

	// -------------------------- CTL --------------------------

	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		par
			 if pulsante then
			 	par
				 	r_rosso[]			// semaforo auto rosso
				 	timerPedoni := 1	// inizio attesa pedoni
			 	endpar
		 	else
		 		if statoPedoni = VERDE then
			 		par
			 			r_rosso[]			// semaforo pedoni rosso
					 	timerPedoni := 1	// inizio attesa macchine
			 		endpar
		 		endif
			 endif
			 
			 if timerPedoni > 0 then
			 	if timerPedoni = 3 then
			 		r_verde[]		// verde per i pedoni
		 		else
		 			timerPedoni := timerPedoni + 1	// continua attesa pedoni
			 	endif
			 endif
			 
			 if timerMacchine > 0 then
			 	if timerMacchine = 3 then
			 		r_verde[]		// verde per le macchine
		 		else
		 			timerMacchine := timerMacchine + 1	// continua attesa macchine
			 	endif
			 endif
			 
			 // modello guasto
//			 if guasto then
//			 	r_guasto[]
//			 endif
		 endpar
		

// -------------------------- Initial state --------------------------
default init s0:
	function statoMacchine = VERDE
	function statoPedoni = ROSSO
	function timerPedoni = 0
	function timerMacchine = 0
