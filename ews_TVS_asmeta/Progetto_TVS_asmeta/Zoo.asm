
asm Zoo

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 
	
	enum domain Animale = {ZEBRA, LEONE, ELEFANTE}
	enum domain Stato = {MALATO, SANO, AFFAMATO}
	
	domain Time subsetof Integer
	domain TotMedicine subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled statoAnimale: Animale -> Stato
	controlled statoMedicine: TotMedicine
	controlled time: Time
	
	// monitorate
	monitored malato: Boolean			// animale malato
	monitored animaleMalato: Animale		// scegli quale animale è malato
	
	// static
	static maxMedicine: TotMedicine
	
definitions:
	// -------------------------- Domain definitions --------------------------
	
	domain Time = {0 : 3}
	domain TotMedicine = {0 : 3}
	
	// -------------------------- Function definitions --------------------------
	
	function maxMedicine = 3

	// -------------------------- Rule definitions --------------------------
	
	// rifornisci le medicine
	rule r_refil = 
		if statoMedicine = 1 then
			// refil prima di restare senza
			statoMedicine := maxMedicine
		endif
	
	rule r_manageAnimals =
		if time = 0 then
			// zebra ha fame
			par
				if statoAnimale(ZEBRA) != MALATO then
					// se zebra non malata da del cibo e l'animale torna sano
					statoAnimale(ZEBRA) := SANO
				endif
				if statoAnimale(LEONE) != MALATO then
					// se non malato, leone avrà fame
					statoAnimale(LEONE) := AFFAMATO
				endif
			endpar
		else
			if time = 1 then
				// leone ha fame
				par
					if statoAnimale(LEONE) != MALATO then
						// se leone non malato da del cibo e l'animale torna sano
						statoAnimale(LEONE) := SANO
					endif
					if statoAnimale(ELEFANTE) != MALATO then
						// se non malato elefante avrà fane
						statoAnimale(ELEFANTE) := AFFAMATO
					endif
				endpar
			else
				if time = 2 then
				// elefante ha fame
					if statoAnimale(ELEFANTE) != MALATO then
						// se elefante non malato da del cibo e l'animale torna sano
						statoAnimale(ELEFANTE) := SANO
					endif
				else
					if time = 3 then
						if statoAnimale(ZEBRA) != MALATO then
						// se non malata, zebra avrà fane
						statoAnimale(ZEBRA) := AFFAMATO
					endif
					endif
				endif
			endif
		endif
	
	// informa animale malato
	rule r_medicine($a in Animale) = 
		if statoMedicine != 0 then
			// se ho medicine
			par
				statoAnimale($a) := MALATO
				statoMedicine := statoMedicine - 1	// diminuisco le medicine
			endpar
		endif
	
	// cura animale malato
	rule r_cura = 
		forall $a in Animale with statoAnimale($a) = MALATO
			do statoAnimale($a) := SANO

	// -------------------------- Invariants --------------------------
	
//	// al massimo lo zoo ha posto per 3 medicine -> true
//	invariant inv_medicine over TotMedicine: statoMedicine <= maxMedicine
//	
//	// -------------------------- LTL --------------------------
//	
//	// lo zoo non resta mai senza medicine (safety) -> true
//	LTLSPEC g(statoMedicine > 0)
//	// opposta, lo zoo può restare senza medicine -> false
//	LTLSPEC g(statoMedicine < 0)
//	
//	// si avanza a intervalli di tempo di 3 (liveness) -> true
//	LTLSPEC g(time >= 0 and time < 4)
//
//	// -------------------------- CTL --------------------------
//	
//	// prima o poi un animale può avere fame in futuro -> true
//	CTLSPEC ef( (exist $a in Animale with statoAnimale($a) = AFFAMATO) )
//	
//	// se un animale si ammala esiste uno stato futuro in cui è tornato sano -> true
//	CTLSPEC eg( (exist $a in Animale with statoAnimale($a) = MALATO)
//		implies ef(statoAnimale($a) = SANO) )
//	
//	// se un animale ha fame esiste uno stato futuro in cui è tornato sano, cioè sfamato -> true
//	CTLSPEC eg( (exist $a in Animale with statoAnimale($a) = AFFAMATO)
//		implies ef(statoAnimale($a) = MALATO) )
//	
//	// quando un animale è malato, resta tale fino a quando non viene curato (until) -> true
//	CTLSPEC ag( (exist $a in Animale with statoAnimale($a) = MALATO) 
//		implies a(statoAnimale($a) = MALATO, 
//			statoAnimale($a) = SANO or statoAnimale($a) = AFFAMATO) )
//			
//	// se nessuno si ammala le medicine restano al massimo (weak until) -> true
//	CTLSPEC ag( statoMedicine = maxMedicine implies aw(statoMedicine = maxMedicine, malato) )
//	
//	// se affamato, in uno stato successivo deve essere saziato -> true
//	CTLSPEC ag( (exist $a in Animale with statoAnimale($a) = AFFAMATO) 
//		implies ef(statoAnimale($a) != AFFAMATO) )
//	
//	// se malato e medicine al max, nello stato dopo le medicine sono ancora al max -> false (max - 1)
//	CTLSPEC ag( (exist $a in Animale with statoAnimale($a) = MALATO 
//		and statoMedicine = maxMedicine)
//		implies ax(statoMedicine = maxMedicine) )
//	
//	// se medicine = 1 esiste stato futuro in cui sono state ripristinate -> true
//	CTLSPEC ag( statoMedicine = 1 implies ax(statoMedicine = maxMedicine) )	
//	
//	// vale sempre che il tempo resta nel range 0-3 -> true
//	CTLSPEC af(time > 0 and time < 4)
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		par
			r_refil[]	// check se ci sono medicine
			if time = 3 then
				par
					r_cura[]
					r_manageAnimals[]
					time := 0			// riparte il ciclo
				endpar
			else
				par
					// gestisci animali
					if malato then
						// scegli animale malato
						r_medicine[animaleMalato]
					else
						// curo e controllo se qualcuno ha fame
						par
							r_cura[]
							r_manageAnimals[]
						endpar
					endif
					time := time + 1
				endpar
			endif
		endpar

// -------------------------- Initial state --------------------------
default init s0:
	function statoAnimale($a in Animale) = AFFAMATO
	function statoMedicine = maxMedicine
	function time = 3	// il ciclo riparte
