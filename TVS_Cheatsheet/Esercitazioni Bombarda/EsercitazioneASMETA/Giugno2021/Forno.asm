// a simple example with a tic tac toe game

asm Forno

import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:
	// DOMAINS
	enum domain StatoPorta = {APERTA | CHIUSA}
	enum domain Stato = {ACCESO | SPENTO}
	
	// FUNCTIONS
	controlled statoForno : Stato
	controlled statoPorta : StatoPorta
	monitored comandoApertura : Boolean
	monitored accendi : Boolean
	monitored spegni : Boolean

definitions:

	// RULE DEFINITIONS
	rule r_accendi =
		statoForno := ACCESO

	rule r_spegni =
		statoForno := SPENTO
		
	// PROPERTIES
	// Quando è acceso la porta è sempre chiusa
	CTLSPEC ag(statoForno = ACCESO implies statoPorta = CHIUSA)
	// Prima o poi si può accendere in qualsiasi momento in futuro.
	CTLSPEC ag(ef(statoForno = ACCESO))
	// La porta può essere aperta dopo che viene acceso.
	CTLSPEC eg(statoForno = ACCESO implies ef(statoPorta = APERTA))
	// Quando è acceso, la porta rimane chiusa fino quando rimane 
	// acceso (usa Until)
	CTLSPEC ag(statoForno = ACCESO implies a(statoPorta = CHIUSA, statoForno = ACCESO))
		
	// MAIN RULE
	main rule r_Main =
		par
			if statoForno = SPENTO and statoPorta = CHIUSA and accendi then
				// Accendo il forno. Posso farlo perchè è 
				// spento e con porta chiusa
				r_accendi[]
			else
				// Spengo il forno quando è acceso e ricevo il
				// comando di spegnimento
				if statoForno = ACCESO and spegni then
					r_spegni[]
				endif
			endif
			
			if statoForno = SPENTO then
				if comandoApertura and not accendi then
					// Voglio aprire la porta e posso farlo
					// perchè il forno è spento
					statoPorta := APERTA
				else
					// Posso chiudere la porta
					statoPorta := CHIUSA
				endif
			else
				if comandoApertura then
					// Il forno è acceso, ricevo il comando
					// di apertura -> Apro la porta e spengo il 
					// forno
					par
						statoPorta := APERTA
						r_spegni[]
					endpar
				endif
			endif
		endpar

// INITIAL STATE
default init s0:
	function statoPorta = CHIUSA
	function statoForno = SPENTO
