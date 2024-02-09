asm parallel
import StandardLibrary

signature:

	controlled x: Integer
	controlled y: Integer
	
definitions:

	main rule r_main = 
		// se non fossero in parallelo avrebbero valori diversi tra loro in ogni stato
		par x := y + 1
			choose $r in {0:5} with $r < 4 do y := y + $r	// random
		endpar

default init s0:
	function x = 0
	function y = 0
		