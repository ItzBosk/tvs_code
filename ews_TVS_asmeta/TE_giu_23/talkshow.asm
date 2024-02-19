
asm talkshow

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain Stato = {ASCOLTA, ATTESA, PARLA}
	
	domain TempoParla subsetof Integer
	domain TempoAttesa subsetof Integer
	domain Persone subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled stato : Persone -> Stato
	controlled inAttesa : Persone -> TempoAttesa
	controlled parla : TempoParla
	controlled microfono : Persone -> Boolean
	
	// monitorate
	monitored vuoleParlare: Persone	
	
definitions:
	// -------------------------- Domain definitions --------------------------
	
	domain Persone = {1 : 6} 
	domain TempoParla = {0 : 5}
	domain TempoAttesa = {0 : 7}

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------

	rule r_gestisciPersona($p in Persone) =
		par
			// sta parlando
			if stato($p) = PARLA then
				if parla = 0 then
					par
						stato($p) := ASCOLTA
						microfono($p) := false
					endpar
				else
					parla := parla -1	
				endif
			endif
			// in attesa
			if stato($p) = ATTESA then
				if inAttesa($p) = 0 then
					stato($p) := ASCOLTA
				else
					inAttesa($p) := inAttesa($p) - 1	
				endif
			endif
			// in ascolto e vuole parlare
			if stato($p) = ASCOLTA and vuoleParlare = $p then
				par
					stato($p) := ATTESA
					inAttesa($p) := 7
				endpar
			endif
		endpar
	
	rule r_scegliNextParla =
		if (forall $p in Persone with stato($p) != PARLA) then
			// nessuno parla
			choose $pers in Persone with stato($pers) = ATTESA and inAttesa($pers) != 0 do
				par
					// in attesa e tempo non finito
					stato($pers) := PARLA
					microfono($pers) := true
					parla := 5
				endpar
		endif
		
	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------

	// -------------------------- CTL --------------------------
	
	// ogni persona prima o poi può parlare
	CTLSPEC (forall $p in Persone with ef(stato($p) = PARLA))
	
	// solo una persona alla volta parla
	CTLSPEC ag( (exist $p in Persone with stato($p) = PARLA) 
		implies (forall $pers in Persone with ($pers != $p and stato($pers) != PARLA))
	)
	
	// solo la persona che parla ha il microfono attivato
	CTLSPEC ag( (exist $p in Persone with microfono($p) = true) 
		implies (forall $pers in Persone with ($pers != $p and microfono($pers) = false) )
	)
	
	// inventate false
	// se una persone parla allora ha il microfono spento
	CTLSPEC ag( (exist $p in Persone with stato($p) = PARLA) 
		implies (microfono($p) = false)
	)
	
	// se una persona parla allora il tempo da cui parla è > 7
	CTLSPEC ag( (exist $p in Persone with stato($p) = PARLA) 
		implies parla > 7
	)
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		par
			r_gestisciPersona[1]
			r_gestisciPersona[2]
			r_gestisciPersona[3]
			r_gestisciPersona[4]
			r_gestisciPersona[5]
			r_gestisciPersona[6]
			
			r_scegliNextParla[]
		endpar

// -------------------------- Initial state --------------------------
default init s0:
	function stato($p in Persone) = ASCOLTA
	function microfono($a in Persone) = false
