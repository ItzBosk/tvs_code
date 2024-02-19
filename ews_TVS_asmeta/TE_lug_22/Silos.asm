
asm Silos

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain ActiveMachine = {GRU | NASTRO}
	
	domain Grano subsetof Integer
	domain GranoGru subsetof Integer
	domain Cilindro subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled grano: Cilindro -> Grano	// quanto grano in un cilindro
	
	// monitorate
	monitored machine: ActiveMachine	// quale macchina è attiva
	monitored granoGru: GranoGru		// quanto grano rilascia la gru
	monitored cilindroGru: Cilindro		// in quale cilindro
	
definitions:
	// -------------------------- Domain definitions --------------------------
	
	domain Grano = {0 : 12}
	domain GranoGru = {1 : 5}
	domain Cilindro = {1 : 3}

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------

	rule r_usaGru =
		if (grano(cilindroGru) + granoGru) <= 10 then
			grano(cilindroGru) := grano(cilindroGru) + granoGru
		endif

	rule r_usaNastro($c in Cilindro) =
		if grano($c) <= 1 then
			grano($c) := 0
		else
			grano($c) := grano($c) - 2
		endif

	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------

	// -------------------------- CTL --------------------------
	
	// Tutti i cilindri non hanno mai più di 10 quintali di grano 
	CTLSPEC (forall $c in Cilindro with ag(grano($c) <= 10))
	
	// Se nastro attivo, nello stato successivo tutti i cilindri avranno max 8 quintali
	CTLSPEC ag( machine = NASTRO
		implies (forall $c in Cilindro with ax(grano($c) <= 8)) )
	
	// Se primo cilindro vuoto, finché non si attiva la gru, esso rimane vuoto (usa weak until)
	CTLSPEC ag( grano(1) = 0 implies aw(grano(1) = 0, machine = GRU) )
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		if machine = GRU then
			r_usaGru[]
		else
			par
				r_usaNastro[1]
				r_usaNastro[2]
				r_usaNastro[3]
			endpar
		endif

// -------------------------- Initial state --------------------------
default init s0:
	function grano($c in Cilindro) =  1
	