
asm ArrayLuci

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain Stato = {ACCESO, SPENTO}
	enum domain Comando = {NONE, TOGGLE, ALLOFF}
	
	domain Luci subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled statoLuce : Luci -> Stato
	
	// monitorate
	monitored toggle: Luci
	monitored comando: Comando
	
	derived allOff: Boolean
	
definitions:
	// -------------------------- Domain definitions --------------------------
	
	domain Luci = {0 : 9}

	// -------------------------- Function definitions --------------------------
	
	function allOff =
		(forall $r in Luci with statoLuce($r) = SPENTO)

	// -------------------------- Rule definitions --------------------------
	
	// cambia stato luce
	rule r_toggle =
		if statoLuce(toggle) = ACCESO then
			statoLuce(toggle) := SPENTO
		else
			statoLuce(toggle) := ACCESO
		endif
	
	rule r_allOff = 
		forall $i in Luci do statoLuce($i) := SPENTO

	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------

	// -------------------------- CTL --------------------------
	
	// è sempre possibile avere tutte le lampadine spente 
	CTLSPEC ag( (forall $r in Luci with ag(statoLuce($r) = SPENTO)) )	// false a meno di essere allo start
	
	// se tutte spente, finché non toggle, restano tutte spente
	CTLSPEC ag((forall $r in Luci with ag(statoLuce($r) = SPENTO) and comando != TOGGLE) 
		implies ag(statoLuce($r) = SPENTO))
	
	// se toggle una luce, nello satto successivo questo cambia
	CTLSPEC ag((forall $r in Luci with ag(statoLuce($r) = SPENTO) and comando = TOGGLE) 
		implies ex(statoLuce($r) = ACCESO))
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		if comando = ALLOFF then
			r_allOff[]
		else
			if comando = TOGGLE then
				r_toggle[]
			endif
		endif

// -------------------------- Initial state --------------------------
default init s0:
	function statoLuce($l in Luci) = ACCESO
