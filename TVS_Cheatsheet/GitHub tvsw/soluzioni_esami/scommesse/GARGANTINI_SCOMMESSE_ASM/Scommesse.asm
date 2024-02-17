asm Scommesse

import StandardLibrary
import CTLlibrary

signature:
// le 5 partite
domain Partita subsetof Integer 
// budget da 0 a 50
domain Budget subsetof Integer 
// domain risultato
enum domain Risultato = {UNO | DUE | PARI}

// budget per ogni partita
controlled budget: Partita -> Budget

// scommesse
monitored scommessa: Partita -> Risultato

// risultati veramente accaduti
monitored risultato: Partita -> Risultato

// totale budget 
derived totale: Budget
//
derived abbastanzaSoldi: Boolean

definitions:
domain Partita = {1..2}
domain Budget = {0..50}
function totale = budget(1) + budget(2)
function abbastanzaSoldi = (forall $p in Partita with budget($p) >= 2)

// esiste un cammino in cui il giocatore arriva a 50
// proviamo il contrario per vedere per veder eil contro esempio
//CTLSPEC not ef(totale = 50)
CTLSPEC ef(totale = 50)
// è possibile che sia azzerato il budget
CTLSPEC ef((forall $p in Partita with budget($p) = 0))
// non puoi mai perdere tutto
CTLSPEC ag(not (totale = 0))

main rule r_updateBudget = 
    if totale < 50 and abbastanzaSoldi then 
    forall $p in Partita with true do
        if risultato($p) = scommessa($p) 
        then budget($p):= budget($p) +1
		else if risultato($p) = PARI then 
					budget($p):= budget($p) -1 
			 else  budget($p):= budget($p) -2
			 endif
		endif
	endif

default init s0:
function budget($p in Partita) = 5



