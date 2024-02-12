asm Clock
import StandardLibrary
signature:
domain Hour subsetof Integer
domain Second subsetof Integer
domain Minute subsetof Integer

abstract domain Computer

// costante
static oreDelGiorno : Integer

// funzioni controllate
dynamic controlled hour: Hour
dynamic controlled minute: Minute
dynamic controlled second: Second

dynamic monitored signal: Boolean

// massimo tra due numeri, funzione

static massimo: Prod(Integer,Integer) -> Integer
static lunghezza: String -> Natural

static miocomputer: Computer 

definitions:
 
	domain Second = {0 : 59}
	domain Minute= {0 : 59}
	domain Hour = {0 : 23}


	function oreDelGiorno = 24

	function massimo($a in Integer, $b in Integer) =  $a+1
	
	rule r_inc_min =   minute := minute + 1
	
	rule r_inc_sec =   if signal then 
						if second < 59 then 
							second := second + 1
					   	else
					   		par
					   		second := 0
					   		r_inc_min[] 
					   		endpar
endif
					   endif

	main rule r_main = r_inc_sec[]

// INITIAL STATE
default init s0:
	function second = 0
