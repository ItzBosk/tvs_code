
asm Telecamere

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain Stato = {ACCESA, SPENTA}
	enum domain Comando = {ACCENDI, SPEGNI}
	
	domain Telecamera subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled statoTelecamera : Telecamera -> Stato
	
	// monitorate
	monitored toggle: Telecamera
	monitored comando: Comando
	
definitions:
	// -------------------------- Domain definitions --------------------------
	
	domain Telecamera = {0 : 2}

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------

	rule r_spegni =
		if statoTelecamera(toggle) = ACCESA then
			if (exist $t in Telecamera with statoTelecamera($t) = ACCESA and $t != toggle) then
				// se resta un'eltra telecamera accesa
				statoTelecamera(toggle) := SPENTA
			endif
		endif
		
	rule r_accendi =
		if statoTelecamera(toggle) = SPENTA then
			statoTelecamera(toggle) := ACCESA
		endif
	
	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------

	// -------------------------- CTL --------------------------

	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		if comando = SPEGNI then
			r_spegni[]
		else
			if comando = ACCENDI then
				r_accendi[]
			endif
		endif

// -------------------------- Initial state --------------------------
default init s0:
	function statoTelecamera($t in Telecamera) = ACCESA
