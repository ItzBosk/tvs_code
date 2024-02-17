// a simple example with a tic tac toe game

asm oven

import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:
	// DOMAINS
	enum domain Status = {IDLE | HEATING | OPENED | ERROR_O | ERROR_C}
	enum domain Action = {OPEN | START | RESET | CLOSE | DONE}
	// FUNCTIONS
	monitored action : Action
	controlled status: Status
	controlled closed: Boolean
	controlled heat: Boolean
	controlled error: Boolean

definitions:

	// se è aperto allora heat is off
	CTLSPEC  ctlSpec_safe : ag(not closed implies not heat)
	// se cerco di farlo partire che è aperto ho un errore
	CTLSPEC  ctlSpec_error : ag((action = START and not closed) implies ax(error))
	// se ho un errore e lo resetto l'errore va via
	CTLSPEC  ctlSpec_red : ag((action = RESET and error) implies ax(not error))
	//AG EF Heat
	// utilità: da ogni stato posso sempre attivare il mio forno
	CTLSPEC  ctlSpec_utility : ag( ef(heat) )
	
	//AG(Close => AX(¬Start =>  ¬Error))
	// se chiudo in tutti gli stati successivi se non schiacccio start non ho errore
	// questa è falsa perchè se sono in ERROR e apro e/o chiudo rimango in error
	CTLSPEC  ctlSpec_1: ag( closed implies ax(not (action = START) implies not error))
	CTLSPEC  ctlSpec_1eq: ag( closed implies ax(error implies action = START))
	
	LTLSPEC  ltlSpec_2eq: g(heat implies (g(closed) implies g(heat)))
	
	//AG(Heat =>  AX(¬Close =>  Error))
	//AG(Error =>  A(Error U¬Start))


	//AG(A(¬Heat W Start))
	//G(G(Error) => G(Close xor X Close))
	//G(G(Close) => G(Heat))
	
	
	
	// MAIN RULE
	main rule r_Main = 
		par
		if status = IDLE and action = START then par status:= HEATING heat:= true endpar endif
		if status = IDLE and action = OPEN then par status:= OPENED closed := false endpar endif
		if status = HEATING and action = OPEN then 
			par status:= OPENED heat:= false closed:= false endpar endif
		if status = HEATING and action = DONE then 
			par status:= IDLE heat:= false endpar endif
		if status = OPENED and action = START then par status:= ERROR_O error:= true endpar endif
		if status = OPENED and action = CLOSE then par status:= IDLE closed:= true endpar endif
		// reset e aperta: 
		if status = ERROR_O and action = RESET then par status:= OPENED error:= false endpar endif
		if status = ERROR_O and action = CLOSE then par status:= ERROR_C closed:= true endpar endif
		if status = ERROR_C and action = OPEN then par status:= ERROR_O closed:= false endpar endif
		// reset e chiusa
		if status = ERROR_C and action = RESET then par status:= IDLE error:= false endpar endif
		endpar

// INITIAL STATE
default init s0:
	function status = IDLE
	function closed = true
	function heat = false
	function error = false
	
