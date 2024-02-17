asm Voti
import StandardLibrary
signature:
	abstract domain Studenti
	domain Voti subsetof Integer
	// funzione che associa ad ogni studente un voto
	
	controlled voto: Studenti -> Voti
	
	static sufficienza : Integer
	static giovanni: Studenti
	static piero: Studenti
	

definitions:
	domain Voti = {18:31}
	
	function sufficienza = 18
	
	rule r_setvotogiovanni = 	
			voto(giovanni) := 26
			
	rule r_setvotogiovanni($f in Integer) = 	
			voto(giovanni) := $f		
			
			
	main rule r_main = 	
		par 
			voto(giovanni) := 26			
			voto(giovanni) := 30
		endpar	
		
		
  default init s0:
  	function voto($s in Studenti) = 0