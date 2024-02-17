// a simple example with a tic tac toe game

asm LightArray

import StandardLibrary
import CTLlibrary

signature:
	// DOMAINS
	domain Light subsetof Integer
	enum domain Status = {ON, OFF}
	enum domain Comand = {NONE, TOGGLE, ALLOFF}
	// FUNCTIONS
	controlled light: Light -> Status
	monitored comand: Comand 
	monitored toggle: Light
	derived allOff: Boolean

definitions:
	// DOMAIN DEFINITIONS
	domain Light = {1 : 10}

	// FUNCTION DEFINITIONS

	function allOff =
		(forall $r in Light with light($r) = OFF)

	// RULE DEFINITIONS
	rule r_toggle =
				if light(toggle) = ON then light(toggle) := OFF  
				else light(toggle) := ON
				endif

	rule r_alloff = forall $i in Light do light($i) := OFF
	
	CTLSPEC not ef(allOff)

	// MAIN RULE
	main rule r_Main =
		if comand = ALLOFF then r_alloff[]
		else if comand = TOGGLE then r_toggle[]
		else skip
		endif
		endif

// INITIAL STATE
default init s0:
	function light($l in Light) = ON
