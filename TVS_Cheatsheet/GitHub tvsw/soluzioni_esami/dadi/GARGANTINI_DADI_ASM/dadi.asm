asm dadi

import StandardLibrary
import CTLlibrary

signature:
	// DOMAINS
	domain Dadi subsetof Integer
	domain Euro subsetof Integer
	enum domain Res = {WINUSER | WINPC | PATTA}
	
	enum domain Giocatore = {USER | PC}
	// FUNCTIONS
	//controlled userEuro : Euro // euro dell'utente
	//controlled pcEuro : Euro // euro del pc
    monitored userChoice: Dadi 
	controlled euro: Giocatore -> Euro
	controlled res: Res
	
	derived finito : Boolean

definitions:
	// DOMAIN DEFINITIONS
	domain Dadi = {1..6}
	domain Euro = {0..6}
	// FUNCTION DEFINITIONS
 	function finito = euro(USER) = 0 or euro(PC) = 0
	// RULE DEFINITIONS
	// INVARIANTS
	//invariant inv_win over winner:  not(winner(CROSS) and winner(NOUGHT))

// propreità temporali
   // qualsiasi utente può avere un saldo tra 0 e 20
   CTLSPEC (forall $u in Giocatore with (forall $i in Euro 
      with ef(euro($u)=$i)))

// il giocatore USER può raggiunger 10
 CTLSPEC ef(euro(USER)=6)
 // nel gioco ci sono sempre 6 euro
 CTLSPEC ag(euro(USER) + euro(PC) =6)
 // esiste un cammino dallo stato iniziale in cui l'importo del PC è sempre > 0
 CTLSPEC eg(euro(PC)>0)
 // falso perchè non vale in tutti gli stati iniziali (se il pc perse o vince alla primo tiro)
 CTLSPEC eg(euro(PC)=3)
 // l'importo fi ogni giocatore è sempre tra 0 e 6
 CTLSPEC ag(0<=euro(PC) and euro(PC)<=6)
 
 
	// MAIN RULE
	main rule r_Main =
		// scegli il dado del PC
		choose $pcDado in Dadi with not finito do
		//par
		//print($pcDado)
		if $pcDado < userChoice then
			par
				euro(USER):= euro(USER) +1
				euro(PC):= euro(PC) -1
				res := 	WINUSER		
			endpar
		else if $pcDado > userChoice then
			par
				euro(USER):= euro(USER) - 1
				euro(PC):= euro(PC) +1	
				res := 	WINPC				
			endpar
			else
			    res := 	PATTA
			endif
		endif
		//endpar



// INITIAL STATE
default init s0:
	function euro($p in Giocatore) = 3
	