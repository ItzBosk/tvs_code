asm ag
import StandardLibrary
import CTLlibrary

signature:
    dynamic controlled fooA: Boolean
    dynamic controlled fooB: Boolean

definitions:
    
    //invariant for simulation with AsmetaS
    //invariant over fooA, fooB: fooA != fooB
    
    //property for NuSMV
    CTLSPEC  ctlSpec_p : ag(fooA != fooB)

    main rule r_Main = 
        par
            //fooA := not(fooA)
            fooA := if fooA then false else true endif
            
            //fooB := not(fooB)
            fooB:= let($v = not(fooB)) in$v endlet
            
            x:= (y +3) * (y +3)
            x:= let $y3 = y +3 in $y3 * $y3 endlet
        endpar

default init s0:
    function fooA = true
    function fooB = false
