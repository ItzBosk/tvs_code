
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
	monitored chooseMalato: Animale		// scegli quale animale è malato
	
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
				statoAnimale(LEONE) := AFFAMATO		// leone avrà fane
			endpar
		else
			if time = 1 then
				// leone ha fame
				par
					if statoAnimale(LEONE) != MALATO then
						// se leone non malato da del cibo e l'animale torna sano
						statoAnimale(LEONE) := SANO
					endif
					statoAnimale(ELEFANTE) := AFFAMATO		// elefante avrà fane
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
						statoAnimale(ZEBRA) := AFFAMATO			// zebra avrà fane
					endif
				endif
			endif
		endif
	
//		if time = 3 then
//			statoAnimale(ZEBRA) := AFFAMATO			// zebra avrà fane
//		else
//			if time = 0 then
//				// zebra ha fame
//				par
//					if statoAnimale(ZEBRA) != MALATO then
//						// se zebra non malata da del cibo e l'animale torna sano
//						statoAnimale(ZEBRA) := SANO
//					endif
//					statoAnimale(LEONE) := AFFAMATO		// leone avrà fane
//				endpar
//			else
//				if time = 1 then
//					// leone ha fame
//					par
//						if statoAnimale(LEONE) != MALATO then
//							// se leone non malato da del cibo e l'animale torna sano
//							statoAnimale(LEONE) := SANO
//						endif
//						statoAnimale(ELEFANTE) := AFFAMATO		// elefante avrà fane
//					endpar
//				else
//					if time = 2 then
//					// elefante ha fame
//						if statoAnimale(ELEFANTE) != MALATO then
//							// se elefante non malato da del cibo e l'animale torna sano
//							statoAnimale(ELEFANTE) := SANO
//						endif
//				endif
//			endif
//		endif
	
	// informa animale malato
	rule r_medicine($a in Animale) = 
		if statoMedicine != 0 then
			// se ho medicine
			par
				statoMedicine := statoMedicine - 1	// diminuisco le medicine
				statoAnimale($a) := MALATO
			endpar
		endif
	
	// cura animale malato
	rule r_cura = 
		if (exist $a in Animale with statoAnimale($a) = MALATO) then
			statoAnimale($a) := SANO
		endif

	// -------------------------- Invariants --------------------------
	
	// al massimo lo zoo ha posto per 3 medicine -> true
//	invariant inv_medicine over TotMedicine: statoMedicine <= maxMedicine
	
	// -------------------------- LTL --------------------------
	
//	// lo zoo non resta mai senza medicine (safety) -> true
//	LTLSPEC g(statoMedicine > 0)
//	// opposta, lo zoo può restare senza medicine -> false
//	LTLSPEC g(statoMedicine < 0)
//	
//	// si avanza a intervalli di tempo di 3 (liveness)
//	LTLSPEC g(time >= 0 and time < 4)

	// -------------------------- CTL --------------------------
	
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
//	// se nessuno si ammalla le medicine restano al massimo (weak until) -> true
//	CTLSPEC ag( statoMedicine = 3 implies aw(statoMedicine = 3, 
//		(exist $a in Animale with statoAnimale($a) != MALATO)) )
//	
//	// se affamato, nello stato dopo deve essere stato saziato -> true
//	CTLSPEC ag( (exist $a in Animale with statoAnimale($a) = AFFAMATO) 
//		implies ax(statoAnimale($a) != AFFAMATO) )
	
	// se malato e medine al max, nello stato dopo le medicine sono al max -> false (max - 1)
//	CTLSPEC ag( (exist $a in Animale with statoAnimale($a) = MALATO 
//		and statoMedicine = maxMedicine)
//		implies ax(statoMedicine = maxMedicine) )
	
//	// se medicine = 1 esiste stato futuro in cui sono state ripristinate -> true
//	CTLSPEC ag( statoMedicine = 1 implies ax(statoMedicine = maxMedicine) )	
//	
//	// vale semmpre che il tempo resta in questo range -> true
//	CTLSPEC af(time > 0 and time < 4)
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
		par
			r_refil[]	// check se ci sono medicine
			if time = 3 then
				par
					r_manageAnimals[]
					time := 0			// riparte il ciclo
				endpar
			else
				par
					time := time + 1
					// gestisci animali
					if malato then
						// scegli animale malato
						r_medicine[chooseMalato]
					else
						// curo e controllo se qualcuno ha fame
						par
							r_cura[]
							r_manageAnimals[]
						endpar
					endif
				endpar
			endif
		endpar

// -------------------------- Initial state --------------------------
default init s0:
	function statoAnimale($a in Animale) = SANO
	function statoMedicine = maxMedicine
	function time = 3	// il ciclo riparte
