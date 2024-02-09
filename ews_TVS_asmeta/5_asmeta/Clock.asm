asm Clock
import StandardLibrary

signature:
	//////////////////////////	domini 	//////////////////////////
	domain Hour subsetof Integer
	domain Second subsetof Integer
	domain Minute subsetof Integer
	
	abstract domain Computer
	
	//////////////////////////	costanti	////////////////////////// 
	
	// costante
	static oreDelGiorno : Integer
	
	////////////////////////// funzioni	//////////////////////////
	
	// funzioni controllate
	dynamic controlled hour : Hour
	dynamic controlled minute : Minute
	dynamic controlled second : Second
	
	// monitorata e cambia in base all'ambiente della asm
	dynamic monitored signal : Boolean
	
	// funzione: massimo tra due numeri
	static massimo : Prod(Integer, Integer) -> Integer
	
	static lunghezza : String -> Natural
	
	static miocomputer : Computer


definitions:
	 
	 //////////////////////////	domini	//////////////////////////
	domain Second = {0 : 59}
	domain Minute= {0 : 59}
	domain Hour = {0 : 23}

	//////////////////////////	funzioni	//////////////////////////
	function oreDelGiorno = 24

	function massimo($a in Integer, $b in Integer) = $a + 1
	
	//////////////////////////	regole cambio di stato	////////////////////////// 
	
	// incremento minuti
	rule r_inc_min = minute := minute + 1
	
	// incremento secondi
	rule r_inc_sec = 
		if signal then
			if second < 59 then
				second := second + 1
			else
				// resetto i secondi e aumento i minuti
				par
					second := 0
					r_inc_min[]		// richiama un’altra rule
				endpar
			endif
		endif
	
	// regole che il simulatore deve chiamare
	main rule r_main = r_inc_sec[]


// INITIAL STATE (come fosse il costruttore della ASM)
default init s0:
	function second = 0
