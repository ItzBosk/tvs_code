// esempio per provare ATGT
asm lampada

import StandardLibrary

signature:

	enum domain LampStatus = {ON, OFF, STANDBY}

	monitored pushbutton : Boolean 
	monitored poweroff : Boolean 
	monitored poweron : Boolean 
	
	controlled lampStatus: LampStatus

definitions:

	main rule r_Main =
		if poweroff then lampStatus := OFF
		else 
		par
			if  lampStatus = STANDBY and pushbutton then 
						lampStatus := ON endif
			if  lampStatus = ON and pushbutton then 
						lampStatus := STANDBY endif
			if  lampStatus = OFF and poweron then 
						lampStatus := STANDBY endif
		endpar
		endif

// INITIAL STATE
default init s0:
	function lampStatus = OFF
