asm ferryman
import StandardLibrary
import CTLlibrary

signature:
	enum domain Side = {LEFT, RIGHT}
	enum domain Actor = {FERRYMAN, GOAT, CABBAGE, WOLF}

    // NO, meglio una funzione
    // controlled posGoat : Side
    // controlled posCabbage : Side
    // controlled posWolf : Side
    controlled pos: Actor ->Side
    
    // quello che lui porta (decisa dall'ambiente)
    monitored m_carry: Actor
    
    // non fa parte dello stato ma è utile 
	derived allRight : Boolean
	derived pericolo : Boolean
    
definitions:

	function allRight = (forall $a in Actor with pos($a) = RIGHT)
	function pericolo =
		(pos(GOAT) = pos(WOLF) and pos(WOLF) != pos(FERRYMAN)) or
	    (pos(GOAT) = pos(CABBAGE) and pos(GOAT) != pos(FERRYMAN))
	
	//invariant inv_pericolo over pos: not pericolo
	
	// esiste uno stato futuro in cui tutti e tre gli attori
	// sono sulla sponda destra del fiume
	CTLSPEC ef(pos(GOAT) = RIGHT and pos(WOLF) = RIGHT 
				and pos(FERRYMAN) = RIGHT and pos(CABBAGE) = RIGHT)	
	
	// equivalente ma più conpatto
    CTLSPEC ef((forall $a in Actor with pos($a) = RIGHT))
    // equivalente ma più conpatto
	CTLSPEC ef(allRight)
	
	// safety
	// non accade mai un pericolo
	CTLSPEC ag(not pericolo)
	
	// il lupo sta sempre con il cavolo
	CTLSPEC ag(pos(WOLF) = pos(CABBAGE))
	
	// il ferryman se è a sinistra nello stato successivo va a destra
	CTLSPEC ag(pos(FERRYMAN) = LEFT implies ax(pos(FERRYMAN) = RIGHT))
	
	// non è possibile portare tutti a destra senza mai pericolo
	CTLSPEC not e(not pericolo, allRight)
	

    main rule r_main =
    	par
    	// sposta in farryman
    		if pos(FERRYMAN) = LEFT then pos(FERRYMAN) := RIGHT
    		else pos(FERRYMAN) := LEFT
    		endif
		// sposta il carry
			if pos(m_carry) = pos(FERRYMAN) then
    			if pos(m_carry) = LEFT then pos(m_carry) := RIGHT
    			else pos(m_carry) := LEFT
    			endif
    		else skip endif
    	endpar
		

default init s0:
// inzialmente tutti a sinistra
	function pos($a in Actor) = // LEFT oppure 
								if $a = FERRYMAN then LEFT 
								else LEFT endif
