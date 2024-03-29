
/* il forno può essere: 
 * in stanby (chiuso e spento)
 * con la porta aperta, ma spento
 * oppure acceso, ma la porta deve essere chiusa.
 * Se forno acceso, e la porta viene aperta, il forno si spegne
 */

asm Forno

import StandardLibrary 
import LTLlibrary
import CTLlibrary


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
	
	// -------------------------- LTL --------------------------
	
	// -------------------------- CTL --------------------------
	
	// se forno acceso la porta è sempre chiusa
	CTLSPEC ag(statoForno = ACCESO implies statoPorta = CHIUSA)
	
	// prima o poi si può accendere in qualsiasi momento in futuro
	CTLSPEC ef(statoForno = ACCESO)
	
	// la porta può essere aperta dopo che il forno viene acceso
	CTLSPEC eg(statoForno = ACCESO implies ef(statoPorta = APERTA))
	
	// quando accceso, la porta rimane chiusa fino a quando rimane acceso (usa until)
	CTLSPEC ag(statoForno = ACCESO implies a(statoPorta = CHIUSA, statoForno = ACCESO))
	
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
				// posso aprire solo se nel frattempo non lo sto anche accendendo
				if comandoApertura and not accendi then
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
