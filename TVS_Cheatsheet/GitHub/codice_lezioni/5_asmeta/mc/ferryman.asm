asm ferryman
import StandardLibrary
import CTLlibrary

signature:

	enum domain Actors = {FERRYMAN, GOAT, CABBAGE, WOLF}
	enum domain Side = {LEFT, RIGHT}
	
	controlled position: Actors -> Side
	dynamic monitored carry: Actors
	
	// non fa parte dello stato ma è utile 
	derived allRight : Boolean
	derived pericolo : Boolean
	
definitions:	
	function allRight = (forall $a in Actors with position($a) = RIGHT)
	
	function pericolo = (position(GOAT) = position(WOLF) and position(FERRYMAN) != position(GOAT)) or
						(position(GOAT) = position(CABBAGE) and position(FERRYMAN) != position(GOAT))
// prima proprietà 
// è possibile portare di là tutti (ignoriamo il pericolo)
	CTLSPEC ef(allRight)
	
//  non c'è mai pericolo
//    CTLSPEC  ag(not pericolo)	--> FALSA

// è possibile portare di là tutti senza mai evere pericolo
//  utiliziamo until
//	CTLSPEC  not e(not pericolo, allRight)

	main rule r_main = 
	// posizione della barca
			let ($p = position(FERRYMAN)) in 
				// LEFT -> RIGHT
				if $p = LEFT then par
					position(FERRYMAN) := RIGHT
					if position(carry) = LEFT then  position(carry) := RIGHT endif 
					endpar
				// RIGHT -> LEFT
				else par
					position(FERRYMAN):= LEFT
					if position(carry) = RIGHT then  position(carry) := LEFT endif
					endpar 
				endif
			endlet
//
//			let ($p = position(FERRYMAN)) in 
//				if position(carry) = $p then // LEFT -> RIGHT
//				if $p = LEFT then par
//					position(FERRYMAN) := RIGHT
//					position(carry) := RIGHT 
//					endpar
//				// RIGHT -> LEFT
//				else par
//					position(FERRYMAN):= LEFT
//					position(carry) := LEFT
//					endpar 
//				endif
//				endif
//			endlet
//
	 
default init state:
    function position($a in Actors) = LEFT
    