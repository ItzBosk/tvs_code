// 
// esmae GIUGNO 23 
//
asm silos

import StandardLibrary
import CTLlibrary
import LTLlibrary


signature:
	// DOMAINS
	domain Grano subsetof Integer
	domain GranoGru subsetof Integer
	domain Cilindro subsetof Integer
	enum domain ActiveMachine = {GRU | NASTRO}
	// FUNCTIONS
	// quanto grano c'� in un cilindro?
	controlled grano: Cilindro -> Grano
	// quale delle due macchine � attiva?
	monitored machine: ActiveMachine
	// quanto grano rilascia la gru? 
	monitored granoGru: GranoGru
	// in che cilindro? 
	monitored cilindroGru: Cilindro
	
	derived tuttiMin10: Boolean

definitions:
	// DOMAIN DEFINITIONS
	domain Grano = {0 : 12}
	domain GranoGru = {1 : 5}
	domain Cilindro = {1 : 3}

	function tuttiMin10 = (forall $c in Cilindro with ( grano($c) <= 10))

	// RULE DEFINITIONS
	// quando uso il nastro
	rule r_UsaNastro =
		forall $c in Cilindro with true do
			if grano($c) <= 2 then grano($c):= 0 
			else grano($c):= grano($c) - 2
			endif

	rule r_UsaGru = 
			if grano(cilindroGru) + granoGru <= 10 then grano(cilindroGru) := grano(cilindroGru) + granoGru 
			endif
//
	// INVARIANTS
	//invariant inv_win over winner:  not(winner(CROSS) and winner(NOUGHT))
	
	// sono sempre tutti minori di 10 
	CTLSPEC ag(tuttiMin10)
	
	CTLSPEC ag(machine = NASTRO implies (forall $c in Cilindro with ax(grano($c) <= 8)))


	CTLSPEC ag(machine = NASTRO implies ax((grano(1) <= 8)))

	// MAIN RULE
	main rule r_Main = 
		if machine = GRU then r_UsaGru[]
		else r_UsaNastro[]
		endif

// INITIAL STATE
default init s0:
	function grano($c in Cilindro) =  1