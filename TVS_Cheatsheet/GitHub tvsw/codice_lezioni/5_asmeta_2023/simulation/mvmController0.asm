asm mvmController0
//Basic ventilator: only main state

import ../StandardLibrary

signature:
	//*************************************************
	// DOMAINS
	//*************************************************
	enum domain States = {STARTUP | SELFTEST | VENTILATIONOFF | PCV_STATE | PSV_STATE}

	enum domain Modes = {PCV | PSV}

	enum domain ValveStatus = {OPEN | CLOSED}

	//*************************************************
	// FUNCTIONS
	//*************************************************
	dynamic monitored startupEnded: Boolean
	dynamic monitored selfTestPassed: Boolean
	dynamic monitored startVentilation: Boolean
	dynamic monitored stopRequested: Boolean
	dynamic monitored respirationMode: Modes

	
	dynamic controlled state: States



definitions:
	//*************************************************
	// RULE DEFINITIONS
	//*************************************************
	rule r_startup =
		if startupEnded then state := SELFTEST endif
		
	rule r_selftest =
		if selfTestPassed then state := VENTILATIONOFF endif
	
	rule r_PCV =
		state := PCV_STATE
	
	rule r_PSV =
		state := PSV_STATE
		
	rule r_ventilationoff =
		if startVentilation	then
			par
				if respirationMode = PCV	then r_PCV[] endif
				if respirationMode = PSV	then r_PSV[] endif
			endpar
		endif
	
	rule r_runPCV =
		if stopRequested then
			state := VENTILATIONOFF	
		endif
	
	rule r_runPSV =
		if stopRequested then
			state := VENTILATIONOFF	
		endif
		
	//*************************************************
	// Property Verification
	//*************************************************

	//*************************************************
	// MAIN Rule
	//*************************************************
	main rule r_Main =

		par

		//transition from startup to selftest
		if state = STARTUP then
			r_startup[]
		endif

		//transition from selftest to ventilation off
		if state = SELFTEST then
			r_selftest[]
		endif

		//start ventilation, either pcv or psv
		if state = VENTILATIONOFF then
			r_ventilationoff[]
		endif

		//transition from PCV to ventilation off if requested
		if state = PCV_STATE then
			r_runPCV[]
		endif

		//transition from PSV to ventilation off if requested
		if state = PSV_STATE	then
			r_runPSV[]
		endif

	endpar

default init s0:
//controlled functions
	function state = STARTUP