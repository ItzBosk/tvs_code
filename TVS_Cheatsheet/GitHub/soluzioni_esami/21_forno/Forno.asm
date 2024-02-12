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
	//Quando è acceso la porta è sempre chiusa.
	CTLSPEC ag(ovenState = ON implies ovenMove = CLOSE)
	//Prima o poi si può accendere in qualsiasi momento in futuro.
	CTLSPEC ef(ovenState = ON and ovenMove = CLOSE)
	//La porta può essere aperta dopo che viene acceso.
	//Questa proprietà non è vera perchè il forno non può essere acceso e avere la porta aperta.
	//posso dire che, se il forno è acceso, posso aprire la porta solo se poi lo spengo
	CTLSPEC ag((ovenState = ON and not(myAction)) implies ex(ovenState = OFF and ovenMove = OPEN))
	//Quando è acceso, la porta rimane chiusa fino quando rimane acceso (usa Until). (non esce)
	LTLSPEC u(ovenState = ON and ovenMove = CLOSE and not(myAction), ovenState = OFF and ovenMove = OPEN)
	main rule r_main = 
			par
			//se il forno è in stanby e voglio cucinare (myAction = true)
			if(ovenState = OFF and ovenMove = CLOSE and myAction) then
				ovenMove := OPEN
			endif
			
			//se il forno è spento ma con la porta aperta e voglio cucinare
			if(ovenState = OFF and ovenMove = OPEN and myAction) then
			par
				ovenState := ON
				ovenMove := CLOSE
			endpar
			endif
			
			//se il forno è chiuso e accesso e ho finito di cucinare
			if(ovenState = ON and ovenMove = CLOSE and not(myAction)) then
			par
				ovenState := OFF
				ovenMove := OPEN
			endpar
			endif
			
			//se il forno è spento ma con la porta aperta e non voglio più cucinare
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