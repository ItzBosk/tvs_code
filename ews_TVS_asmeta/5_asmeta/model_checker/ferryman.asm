asm ferryman
import StandardLibrary
import CTLlibrary

// un ferryman deve portare sull'altra sponda del fiume una goat, un cabbage e un wolf. 
// Può però trasportarne solo uno alla volta, poiché ci sono dei pericoli:
// 	- wolf mangia goat se ferryman non è presente a controllare
//	- goat mangia cabbage se se ferryman non è presente a controllare
// All'inizio sono tutti sulla sponda LEFT
// Ad ogni passo di simulazione serve decidere chi trasportare a RIGHT insieme al ferryman, 
// oppure attraversare il fiume con nessuno a bordo

signature:

	enum domain Actors = {FERRYMAN, GOAT, CABBAGE, WOLF}
	enum domain Side = {LEFT, RIGHT}
	
	// funzione per sapere dove si trova ogni attore
	controlled position : Actors -> Side	// in base a chi trasporto controllo la sua posizione
	
	dynamic monitored carry : Actors	// ogni volta scelgo chi trasportare
	
	// funzioni derivate, non fanno parte dello stato ma è derivata da esso (tramite una query)
	derived allRight : Boolean
	derived pericolo : Boolean
	
definitions:

	function allRight = (forall $a in Actors with position($a) = RIGHT)
	
	function pericolo = (position(GOAT) = position(WOLF) and position(FERRYMAN) != position(GOAT))
						or (position(GOAT) = position(CABBAGE) and position(FERRYMAN) != position(GOAT))
						
// è possibile portare di là tutti (ignoriamo il pericolo)
	CTLSPEC ef(allRight)	// prima o poi sono tutti a right	
	
//  non c'è mai pericolo?
//  CTLSPEC ag(not pericolo)	// falsa

//	è possibile portare di là tutti senza mai evere pericolo?
//  -> esiste un path in cui non c'è pericolo fino a che sono tutti a right -> uso until
	CTLSPEC e(not pericolo, allRight)		// vera
//	CTLSPEC not e(not pericolo, allRight)	// la nego per avere la traccia dimostrativa

	main rule r_main =
			// posizione della barca (corrisponde al ferryman che c'è sopra)
			let ($p = position(FERRYMAN)) in 	// mi salvo la posizione della barca
				// LEFT -> RIGHT
				if ($p = LEFT) then
					par
						position(FERRYMAN) := RIGHT
						if position(carry) = LEFT then
							position(carry) := RIGHT
						endif 
					endpar
				// RIGHT -> LEFT
				else
					par
						position(FERRYMAN):= LEFT
						if position(carry) = RIGHT then
							position(carry) := LEFT
						endif
					endpar 
				endif
			endlet
			
			// sposto solo se è nella stessa posizione della barca
//			let ($p = position(FERRYMAN)) in 
//				if position(carry) = $p then // LEFT -> RIGHT
//					if $p = LEFT then
//						par
//							position(FERRYMAN) := RIGHT
//							position(carry) := RIGHT 
//					endpar
//				// RIGHT -> LEFT
//					else
//						par
//							position(FERRYMAN):= LEFT
//							position(carry) := LEFT
//						endpar 
//					endif
//				endif
//			endlet
	 
default init state:
    function position($a in Actors) = LEFT	// all'inizio sono tutti a left
    