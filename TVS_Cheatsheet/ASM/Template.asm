
asm Forno

import StandardLibrary

signature:
	// -------------------------- Domains -------------------------- 
	enum domain Stato = {ACCESO | SPENTO}
	enum domain StatoPorta = {APERTA| CHIUSA}
	
	// -------------------------- Functions --------------------------
	// controllate
	controlled statoForno : Stato
	controlled statoPorta : StatoPorta
	
	// monitorate
	monitored comandoApertura : Boolean		// aperto = true, chiuso = false
	monitored accendi : Boolean
	monitored spegni : Boolean
	
definitions:
	// -------------------------- Domain definitions --------------------------
	// non serve se non ho dei subset di un dominio

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------
	rule r_accendi =
		statoForno := ACCESO
	
	rule r_spegni =
		statoForno := SPENTO

	// -------------------------- Invariants --------------------------

	// -------------------------- Main rule--------------------------
	main rule r_Main =
		par
			// gestine stato forno
			if statoForno = SPENTO and statoPorta = CHIUSA and accendi then
				// posso accendere il forno
				r_accendi[]
			else
				if statoForno = ACCESO and spegni then
				// forno acceso -> porta chiusa, spengo il forno
					r_spegni[]
				endif
			endif
			
			// gestine stato porta
			if statoForno = SPENTO then
				if comandoApertura then
					// posso aprire la porta perché il forno è spento
					statoPorta := APERTA
				else
					// porta già aperta, la chiudo
					statoPorta := CHIUSA
				endif
			else
				// forno acceso, non potrei aprire la porta, se la apro il forno si spegne
				if comandoApertura then
					par
						statoPorta := APERTA
						r_spegni[]
					endpar
				endif
			endif
		endpar

// -------------------------- Initial state --------------------------
default init s0:
	function statoForno = SPENTO
	function statoPorta = CHIUSA
