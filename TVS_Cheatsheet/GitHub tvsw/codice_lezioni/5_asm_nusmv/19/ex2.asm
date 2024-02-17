asm ex2
import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:

    enum domain State = { ST1 | ST2 | ST3 | ST4}

	controlled  state : State	
	controlled  p: Boolean	
	controlled  q: Boolean	
   
definitions:

    CTLSPEC  ctlSpec_1 : ef(p and q)
    //LTLSPEC  ltlSpec_1 : g(p or q)
    CTLSPEC  ctlSpec_2 : eg(p)
    // trovare il percorso che dimostri che eg è vera
    CTLSPEC  ctlSpec_3 : not eg(p)
    
    LTLSPEC  ltlSpec_2 : g(q implies p)
    
    main rule r_Main = 
    par
      if state = ST1 then state := ST2 endif
      if state = ST2 then 
        choose $s in {ST1,ST3,ST4} with true do 
        par
        state := $s 
        if $s = ST3 then q:= true endif
        if $s = ST4 then par q:= false  p:= false endpar endif        
        endpar 
      endif
      if state = ST3 then state := ST3 endif
      if state = ST4 then par
          state := ST3
          p:= true
          q:= true 
          endpar endif
	endpar       

default init s0:
	function state = ST1
    function p = true
    function q = false
