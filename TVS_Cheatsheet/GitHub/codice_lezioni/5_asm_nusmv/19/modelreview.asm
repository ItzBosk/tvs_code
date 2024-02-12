asm modelreview
import StandardLibrary
import CTLlibrary

signature:
	
	domain Values subsetof Integer

	controlled k : Values
	controlled w : Values
	monitored m: Values

definitions:

	domain Values = {18 : 22}

	//rule r_1 = if m >= 20 then k:= 6 else k:=k endif
	//rule r_2 = if m <= 20 then k:= 5 else k:=k endif
	//rule r_1 = if k = 40
	
	//rule r_2 = k:= 30
	
	main rule r_Main =
	//par 
	 if k < 20 and w = 18 then k:= k +1 endif
	 //if k = 19 then k:= 19 endif
	//endpar
// INITIAL STATE
default init s0:
   function k = 18
   function w = 18