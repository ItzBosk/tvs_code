asm updateinc2

import StandardLibrary

signature:
	domain MyNumber subsetof Integer	// NuSMV non prende domini infiti
	dynamic controlled foo : MyNumber
	dynamic monitored mon2 : Boolean
	dynamic monitored mon1 : Boolean
	
definitions:
	domain MyNumber = {1: 2}
	
	// viola MP2
	main rule r_main =
        par
         	if mon1 then
         		foo := 1
			endif
			if mon2 then
         		foo := 2
			endif
        endpar

default init s0:
	function foo = 1
	
	