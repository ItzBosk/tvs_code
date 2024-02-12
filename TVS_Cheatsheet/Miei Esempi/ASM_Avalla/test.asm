asm test

import StandardLibrary
import LTLlibrary
import CTLlibrary

signature:

enum domain Pizza = {TONNO, CIPOLLE, QUATTROFORM}
enum domain Soldi = {CINQUE, DIECI, CINQUANTA}
domain Quantita subsetof Integer

controlled disponibile: Pizza -> Quantita
controlled erogato: Pizza
monitored soldo: Soldi

derived isTonnodisponibile: Boolean
static maxSoldi: Soldi

definitions:
	
	domain Quantita = {0:10}
	
	function maxSoldi = CINQUANTA
	function isTonnodisponibile = (forall $p in Pizza with $p = TONNO and disponibile($p) > 0 )
	
//	LTLSPEC g(disponibile(TONNO) = 0 implies g(disponibile(TONNO) = 0))
//  LTLSPEC g(disponibile(CIPOLLE) >= 7)
  LTLSPEC (forall $p in Pizza with g(disponibile($p)>=0))

//	CTLSPEC not ef(disponibile(QUATTROFORM) = 0)
//	CTLSPEC a(disponibile(TONNO) >0 , disponibile(TONNO) = 0)
//	CTLSPEC ag(disponibile(CIPOLLE) >= 0)
    
	
//	invariant inv_soldoValido over soldo: soldo = CINQUE or soldo = DIECI or soldo = CINQUANTA 

//rule r_coninput($p in Pizza) = .... 
//poi vanno chiamate con r_coninput[...] oppure [] se non  li ha
main rule r_main = 
	if soldo = CINQUE then 
		if disponibile(TONNO) > 0 then par
			erogato := TONNO
			disponibile(TONNO) := disponibile(TONNO) -1
		endpar
		endif
	else 
		if soldo = DIECI then 
				if disponibile(CIPOLLE) > 0 then par
					erogato := CIPOLLE
					disponibile(CIPOLLE) := disponibile(CIPOLLE) -1
					endpar
				endif
		else
			choose $p in Pizza with $p != TONNO do
				if disponibile($p) >0 then par
					erogato := $p
					disponibile($p) := disponibile($p) -1
					endpar
				endif
		endif
	endif

//nel caso in cui io debba gestire due cose insieme (tipo stato forno e porta del forno)
//devo fare main rule: par {if else endif} {if else endif} endpar
//cosi da "separare" i due if 

default init s0:
	function disponibile($f in Pizza) = 10
	
/* NON PUO MAI PASSARE A VERDE DIRETTAMENTE DA ROSSO
 * DA ROSSO NON PUOI PASSARE A VERDE DIRETTAMENTE
 * CTLSPEC ag(semaforo=ROSSO implies ax(semaforo != VERDE))
 * 
 * QUANDO E' ROSSO RIMARRA SEMPRE ROSSO A MENO CHE CI SIA UNA RICHIESTA
 * CTLSPEC ag(semaforo=ROSSO implies aw(semaforo = ROSSO,richiesta)
 * /////e' un weak-until perche potrebbe anche non arrivare mai la richiesta
 * /////l' until invece prima o poi deve essere "verificato"
 * 
 * SE C'E' UNA RICHIESTA ALLORA PRIMA O POI DIVENTA VERDE
 * CTLSPEC ag((richiesta and semaforo=ROSSO) implies af(semaforo=GREEN))
 * /////e' af e non ef perche il cambio e' certo, anche se non so quando lo fara
 * ///// potrebbe essere ef se non fosse certo che prima o poi diventera verde
 * 
 * IN QUALSIASI ISTANTE PRIMA O POI POTREBBE DIVENTARE VERDE
 * CTLSPEC ag(ef(semaforo=VERDE))
 * ///// oppure anche solo ef(...), ma nel secondo caso potrei 
 * ///// catturare un solo VERDE, mentre con ag dico che sempre potrei finire in un
 * ///// verde
 *
 * LA PORTA RIMANE CHIUSA FINO A QUANDO RIMANE ACCESO
 * CTLSPEC a(porta=chiusa,stato=acceso)
 */