// esempio per provare ATGT

asm lampada

import StandardLibrary

signature:

	enum domain Stato = {ON, OFF, STANDBY}

	controlled statoLampada : Stato
	
	monitored pushButton : Boolean 
	monitored powerOFF : Boolean 
	monitored powerON : Boolean 
	
definitions:

	main rule r_main =
		if powerOFF then
			statoLampada := OFF
		else 
			par
				if statoLampada = STANDBY and pushButton then 
					statoLampada := ON
				endif
				if statoLampada = ON and pushButton then 
					statoLampada := STANDBY
				endif
				if statoLampada = OFF and powerON then 
					statoLampada := STANDBY
				endif
			endpar
		endif

// INITIAL STATE
default init s0:
	function statoLampada = OFF
