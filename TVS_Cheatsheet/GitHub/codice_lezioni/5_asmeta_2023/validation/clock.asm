// a simple clock

asm clock

import ../StandardLibrary

signature:
	// DOMAINS
	domain Minutes subsetof Integer
	domain Seconds subsetof Integer
	domain Hours subsetof Integer

	controlled seconds: Seconds
	controlled minutes: Minutes
	controlled hours: Hours


definitions:
	// DOMAIN DEFINITIONS
	domain Minutes = {0 : 59}
	domain Seconds = {0 : 59}
	domain Hours = {0 : 23}

//	// FUNCTION DEFINITIONS
//	function winner($s in Sign) =
//		(exist $r in Coord with (forall $c in Coord with board($r, $c) = $s)) or
//		(exist $c2 in Coord with (forall $r2 in Coord with board($r2, $c2) = $s)) or
//		(forall $d in Coord with board($d, $d) = $s) or
//		(forall $d1 in Coord with board($d1, 4 - $d1) = $s)
//
//	function endOfGame =
//		(exist $s in Sign with winner($s)) or
//		(forall $r in Coord, $c in Coord with isDef(board($r, $c)))
//
//	// RULE DEFINITIONS
//	rule r_moveUser =
//		let ($r = userChoiceR, $c = userChoiceC) in
//			if(isUndef(board($r, $c))) then
//				par
//					board($r, $c) := CROSS
//					status := TURN_PC
//				endpar
//			endif
//		endlet
//
//	rule r_movePC =
//		choose $r in Coord, $c in Coord with isUndef(board($r, $c)) do
//			par
//				board($r, $c) :=  NOUGHT
//				status := TURN_USER
//			endpar
//
//	// INVARIANTS
//	invariant inv_win over winner:  not(winner(CROSS) and winner(NOUGHT))
//

	// MAIN RULE
	main rule r_Main =
		//par
		if seconds < 59 then seconds :=  seconds + 1
		else par
				seconds := 0 
				minutes:=minutes +1
			endpar
				
		endif
		//endpar

// INITIAL STATE
default init s0:
	function seconds = 0
	function hours = 0
    function minutes = 0
	