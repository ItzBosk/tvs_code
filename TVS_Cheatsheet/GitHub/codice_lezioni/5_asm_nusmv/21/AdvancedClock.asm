asm AdvancedClock
import StandardLibrary
signature:
// domini
	domain Second subsetof Integer
	domain Minute subsetof Integer
	domain Hour subsetof Integer
	enum domain Colori = { BLACK, YELLOW}
// funzioni
	controlled seconds: Second
	controlled minutes: Minute
	controlled hours: Hour
	
	monitored coppia: Prod(Integer,Integer)
		
	// ore e minuti e dice se è mezziogiorno	
	static mezzogiorno: Prod(Hour,Minute) -> Boolean
	
	// mi dice se nello stato corrente l'ora è esatta (min = 0)
	derived oraesatta : Boolean 
	
	static somma2quadrati : Integer -> Integer

definitions:
	domain Second = {0 : 59}
	domain Minute = {0 : 59}
	domain Hour = {0 : 23}
	
	function mezzogiorno($x in Hour,$y in Minute) =  $x = 12 and $y = 0  
	
	function oraesatta = if minutes = 0 and seconds = 0 then true else false endif
		
	function somma2quadrati($x in Integer) = //$x*$x + $x*$x
		let ($q = $x*$x) in $q + $q endlet

	invariant inv_check over seconds : seconds < 10
	
	main rule r_main = 
		//let ($x = seconds +1) in seconds := $x endlet
		choose $x in {1:10} with true do seconds := seconds + $x
	
default init s0:
	function seconds = 0
		