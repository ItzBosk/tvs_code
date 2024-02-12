/** 
 * esempio di una lampada per MBT
*/
asm lampada

import ../StandardLibrary

signature:
	enum domain StatoLampada = {ON, OFF, STANDBY}
	
	controlled lampada: StatoLampada

	monitored button : Boolean
	monitored poweron : Boolean
	monitored poweroff : Boolean

definitions:

	main rule r_Main = 
		par
			if lampada = OFF and poweron then
				lampada := STANDBY
			endif
			if lampada = STANDBY and button then
				lampada := ON
			endif
			if lampada = ON and button then
				lampada := STANDBY
			endif
		endpar
			
			
		
default init s0:
	function lampada = OFF
