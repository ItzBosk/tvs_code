asm inconsistentUpdates

import ../StandardLibrary
signature:
	domain SubDom subsetof Integer
	dynamic controlled fooG: SubDom
	dynamic monitored mon1: Boolean
	dynamic monitored mon2: Boolean

definitions:
	domain SubDom = {1 : 2}
	
	main  rule r_Main =		 
				par
				  if mon2 then fooG := 1 
				  endif				 
				  if mon1 then fooG := 1 				  
				  else fooG := 2 endif
				endpar
default init s0:
	function fooG = 1
