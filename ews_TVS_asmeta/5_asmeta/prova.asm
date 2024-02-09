asm prova

import StandardLibrary

signature:
	// stato della mia macchina
	
	// domini
	abstract domain Persona
	
	enum domain Light = {ON, OFF}
	
	// domini strutturati
	domain Age subsetof Integer
	domain MyDomain subsetof Seq(Integer)	// lista di interi subset di Integer
	domain CoppiaIntString subsetof Prod(Integer, String)
	
	abstract domain Studente
	abstract domain Corso
	
	// funzioni
	
	controlled voto: Prod(Studente, Corso) -> Natural
	
	// funzioni statiche
	static maxG: Prod(Integer, Integer) -> Integer
	static doppioQuadrato: Integer -> Integer
		
definitions:

	domain Age = {0 : 300} 
	
	function maxG($x in Integer, $y in Integer) = 
		if $x > $y then
			$x 
		else 
			$y 
		endif
	
	// 2 * (input^2)
	function doppioQuadrato($x in Integer) = 	// $x *$x + $x *$x 
		let ($q = $x * $x) in $q + $q endlet


	