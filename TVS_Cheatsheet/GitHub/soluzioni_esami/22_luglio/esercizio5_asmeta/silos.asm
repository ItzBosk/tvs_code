// 
asm silos

import StandardLibrary
import CTLlibrary

signature:
	// DOMAINS
	// id dei cilindri
	domain Cilindri subsetof Integer
	// quantità di grano per cilindro
	domain QuantitaGrano subsetof Integer
	domain Granoversato subsetof Integer
	
	enum domain ActiveMachine = {GRU | NASTRO}	
	// FUNCTIONS
	// costante
	static maxGrano : QuantitaGrano
	
	// quantita di grano per ogni silos
	controlled quantitaGrano: Cilindri -> QuantitaGrano
	
	// quale macchina è attivata nel passo corrente	
	// o GRU o NASTRO
	monitored action: ActiveMachine
	// silos scelta dall'operatore da riempiere
	monitored riempiSilos: Cilindri
	
	// sono tutti pieni
	derived tuttiPieni: Boolean
	
	

definitions:
	// DOMAIN DEFINITIONS
	domain Cilindri = {1 : 3}
	domain QuantitaGrano = {0: 12}
	domain Granoversato = {1: 5}

	// FUNCTION DEFINITIONS
	function maxGrano = 10

	function tuttiPieni = 
	 (forall $c in Cilindri with quantitaGrano($c) = maxGrano)

	// RULE DEFINITIONS
	// attiva la gru
	rule r_attivaGRU =
		// questo non va bene per nusmv perchè non capisce che è limitato
	    //choose $granoDaVersare in {1:5} with true do
	    choose $granoDaVersare in Granoversato with true do
	    if quantitaGrano(riempiSilos) + $granoDaVersare <= maxGrano then
	      quantitaGrano(riempiSilos):= quantitaGrano(riempiSilos) + $granoDaVersare
        else
          quantitaGrano(riempiSilos):= maxGrano
        endif
        
    // attiva invece il nastro
	rule r_attivaNASTRO =
		forall $c in Cilindri with true do
		if quantitaGrano($c) >= 2 then 
	      quantitaGrano($c):= quantitaGrano($c) - 2
		else  
	      quantitaGrano($c):= 0
		endif
		 	
	// INVARIANTS
	// P1: tutti i cilindri non hanno più di 10 
	CTLSPEC ag(quantitaGrano(1) <= maxGrano and 
				quantitaGrano(2) <= maxGrano and
				quantitaGrano(3) <= maxGrano) 
	
    //CTLSPEC ag(forall $c in Cilindri with quantitaGrano($c) <= maxGrano) 
	
	
	// altre proprietà.
	// E' possibile avere tutti i cilindri pieni
	CTLSPEC ef(tuttiPieni)
	
	
	// propreità falsa: non posso riempire il silos
	CTLSPEC ag(not tuttiPieni)
	
	// MAIN RULE
	main rule r_Main =
		if action = GRU then
				r_attivaGRU[]
		else
				r_attivaNASTRO[]
		endif

// INITIAL STATE
default init s0:
	function quantitaGrano($s in Cilindri) = 1
