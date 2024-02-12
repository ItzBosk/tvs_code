asm ex1
import StandardLibrary
import CTLlibrary

signature:
    enum domain State = {SQ1 | SQ2 | SQ3 | SQ4}
    
    dynamic controlled state: State

    controlled p: Boolean
    controlled q: Boolean

definitions:
    
    //invariant for simulation with AsmetaS
    //invariant over fooA, fooB: fooA != fooB
    
    //property for NuSMV
    //CTLSPEC  ctlSpec_p : ag(fooA != fooB)

    main rule r_Main = 
        par
        	if state = SQ1 then par state:= SQ2 p:= true endpar endif
        	if state = SQ2 then state:= SQ3 endif
        endpar

default init s0:
    function state = SQ1
    function p = true
    function q = false
    
