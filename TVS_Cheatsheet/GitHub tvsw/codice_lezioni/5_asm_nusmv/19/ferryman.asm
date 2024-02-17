// ferryman

asm ferryman

import StandardLibrary
import CTLlibrary

signature:
    enum domain Actors = {FERRYMAN | GOAT | CABBAGE | WOLF}
    enum domain Side = {LEFT | RIGHT}
    // controllata
    controlled position: Actors -> Side
    // derivata
    // se c'è uno stato di pericolo
    derived pericolo: Boolean
    
definitions:
	function pericolo = (position(WOLF) = position(GOAT) and position(GOAT) !=  position(FERRYMAN))
						or (position(CABBAGE) = position(GOAT) and position(GOAT) !=  position(FERRYMAN))


	// il ferryman cambia la posizione ad un attore qualsiasi
	rule r_moveActor =
	// seleziona un attore e lo porta con se
	  choose $a in Actors with position($a) = position(FERRYMAN) do
		if position(FERRYMAN) = LEFT then position($a) := RIGHT
		else position($a) := LEFT
		endif
	// una proprietà che dovrebbe essere falsa e di cui voglio un controeesempio
	// non sono mai tutti a destra
	//CTLSPEC not ef((forall $p in Actors with position($p) = RIGHT)) 
	
	//CTLSPEC ef(pericolo)
	//CTLSPEC not ef(pericolo)
	
	// trovare un caso in cui sono tutti a destra senza che sia mai accaduto il pericolo
	CTLSPEC not e(not pericolo, (forall $p in Actors with position($p) = RIGHT))
	
	
	// MAIN RULE
	main rule r_Main =
	// cambia side
	par
		if position(FERRYMAN) = LEFT then position(FERRYMAN) := RIGHT
		else position(FERRYMAN) := LEFT
		endif
		r_moveActor[]
	endpar

// INITIAL STATE
default init s0:
     function position($a in Actors) = LEFT
     
	//function status = TURN_USER

	// DOMAINS
/*	domain Coord subsetof Integer
	enum domain Sign = {CROSS | NOUGHT}
	enum domain Status = {TURN_USER | TURN_PC}
	// FUNCTIONS
	controlled board: Prod(Coord, Coord) -> Sign
	controlled status: Status
	monitored userChoiceR: Coord //row chosen by the user
	monitored userChoiceC: Coord //column chosen by the user
	derived winner: Sign -> Boolean
	derived endOfGame: Boolean*/

/*	// DOMAIN DEFINITIONS
	domain Coord = {1..3}

	// FUNCTION DEFINITIONS
	function winner($s in Sign) =
		(exist $r in Coord with (forall $c in Coord with board($r, $c) = $s)) or
		(exist $c2 in Coord with (forall $r2 in Coord with board($r2, $c2) = $s)) or
		(forall $d in Coord with board($d, $d) = $s) or
		(forall $d1 in Coord with board($d1, 4 - $d1) = $s)

	function endOfGame =
		(exist $s in Sign with winner($s)) or
		(forall $r in Coord, $c in Coord with isDef(board($r, $c)))

	// RULE DEFINITIONS
	rule r_moveUser =
		let ($r = userChoiceR, $c = userChoiceC) in
			if(isUndef(board($r, $c))) then
				par
					board($r, $c) := CROSS
					status := TURN_PC
				endpar
			endif
		endlet

	rule r_movePC =
		choose $r in Coord, $c in Coord with isUndef(board($r, $c)) do
			par
				board($r, $c) :=  NOUGHT
				status := TURN_USER
			endpar

	// INVARIANTS
	invariant inv_win over winner:  not(winner(CROSS) and winner(NOUGHT))
*/
	