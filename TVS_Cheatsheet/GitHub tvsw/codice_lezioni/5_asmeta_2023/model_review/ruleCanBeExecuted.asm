asm ruleCanBeExecuted

import ../StandardLibrary
signature:
	domain SubDom subsetof Integer
	dynamic controlled fooG: SubDom
	dynamic monitored mon: Boolean

definitions:
	domain SubDom = {1 : 2}
	
	main  rule r_Main =		 
				  if mon then 
				   		if not mon then fooG := 1 endif
				  endif				  

default init s0:
	function fooG = 1
