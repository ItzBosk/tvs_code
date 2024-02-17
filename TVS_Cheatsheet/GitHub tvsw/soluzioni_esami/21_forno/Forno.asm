asm Forno

import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:
	enum domain State = {ON | OFF}
	enum domain Move = {OPEN | CLOSE}
	
	controlled ovenState: State
	controlled ovenMove: Move
	
	monitored myAction: Boolean

definitions:
	//Quando � acceso la porta � sempre chiusa.
	CTLSPEC ag(ovenState = ON implies ovenMove = CLOSE)
	//Prima o poi si pu� accendere in qualsiasi momento in futuro.
	CTLSPEC ef(ovenState = ON and ovenMove = CLOSE)
	//La porta pu� essere aperta dopo che viene acceso.
	//Questa propriet� non � vera perch� il forno non pu� essere acceso e avere la porta aperta.
	//posso dire che, se il forno � acceso, posso aprire la porta solo se poi lo spengo
	CTLSPEC ag((ovenState = ON and not(myAction)) implies ex(ovenState = OFF and ovenMove = OPEN))
	//Quando � acceso, la porta rimane chiusa fino quando rimane acceso (usa Until). (non esce)
	LTLSPEC u(ovenState = ON and ovenMove = CLOSE and not(myAction), ovenState = OFF and ovenMove = OPEN)
	main rule r_main = 
			par
			//se il forno � in stanby e voglio cucinare (myAction = true)
			if(ovenState = OFF and ovenMove = CLOSE and myAction) then
				ovenMove := OPEN
			endif
			
			//se il forno � spento ma con la porta aperta e voglio cucinare
			if(ovenState = OFF and ovenMove = OPEN and myAction) then
			par
				ovenState := ON
				ovenMove := CLOSE
			endpar
			endif
			
			//se il forno � chiuso e accesso e ho finito di cucinare
			if(ovenState = ON and ovenMove = CLOSE and not(myAction)) then
			par
				ovenState := OFF
				ovenMove := OPEN
			endpar
			endif
			
			//se il forno � spento ma con la porta aperta e non voglio pi� cucinare
			if(ovenState = OFF and ovenMove = OPEN and not(myAction)) then
			par
				ovenState := OFF
				ovenMove := CLOSE
			endpar
			endif
			
			endpar
		

default init s0:
	function ovenState = OFF
	function ovenMove = CLOSE