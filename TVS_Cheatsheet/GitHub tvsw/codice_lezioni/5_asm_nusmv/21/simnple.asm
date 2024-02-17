asm simnple
import StandardLibrary
signature:
// domini
	domain Second subsetof Integer
	domain Minute subsetof Integer
	domain Hour subsetof Integer
	enum domain Colori = { BLACK, YELLOW}
// funzioni
	controlled seconds: Second
	controlled minutes: Minute
	controlled hours: Hour
	

definitions:
	domain Second = {0 : 59}
	domain Minute = {0 : 59}
	domain Hour = {0 : 23}
	
	main rule r_main = 
	par
		if seconds = 2 then seconds := 2 endif // triviale
		seconds := 1
	endpar
	
default init state :
	function seconds = 0	