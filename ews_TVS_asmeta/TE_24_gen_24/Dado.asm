
asm Dado

import StandardLibrary
import LTLlibrary
import CTLlibrary


signature:
	// -------------------------- Domains -------------------------- 

	enum domain DomGiocatore = {GUNO, GDUE, GTRE, GQUATTRO}
	enum domain DomEsito = {VINCE, PERDE, PATTA}

	domain DomFacciaDado subsetof Integer
	domain DomCredito subsetof Integer
	
	// -------------------------- Functions --------------------------

	// controllate
	controlled turno : DomGiocatore
	controlled credito : DomGiocatore -> DomCredito
	controlled gioca: Boolean	// gioco inizia e continua, false se qualcuno vince/perde
	
	// monitorate
	monitored dado : DomFacciaDado
	
definitions:
	// -------------------------- Domain definitions --------------------------
	domain DomFacciaDado = {1 : 3}
	domain DomCredito = {0 : 12}

	// -------------------------- Function definitions --------------------------
	// solo funzioni derivate

	// -------------------------- Rule definitions --------------------------
	
	// g1 perde e deve cedere il credito a sx
	rule r_cedi($g1 in DomGiocatore, $g2 in DomGiocatore) =
		par
			credito($g1) := credito($g1) - 1
			credito($g2) := credito($g2) + 1
		endpar
	
	// g1 vince e ruba il credito a dx
	rule r_ruba($g1 in DomGiocatore, $g2 in DomGiocatore) =
		par
			credito($g1) := credito($g1) + 1
			credito($g2) := credito($g2) - 1
		endpar
	
	// passaggio di turno
	rule r_passa =
		par
			if turno = GUNO then
				turno := GDUE
			endif
			if turno = GDUE then
				turno := GTRE
			endif
			if turno = GTRE then
				turno := GQUATTRO
			endif
			if turno = GQUATTRO then
				turno := GUNO
			endif
		endpar
		
	// -------------------------- Invariants --------------------------
	
	// -------------------------- LTL --------------------------
	
	// -------------------------- CTL --------------------------
	
	// il massimo che qualsiasi giocatore puo avere è 12 euro
	CTLSPEC (forall $g in DomGiocatore with ag(credito($g) < 13))
	
	// esiste un percorso in cui il primo giocatore perde
	CTLSPEC ef(gioca = false and credito(GUNO) = 0)
	
	// il gioco può continuare all'infinito
	CTLSPEC eg(gioca = true)
	
	// fino a che nessun giocatore ha credito nullo il gioco continua
	CTLSPEC ag((forall $g in DomGiocatore with credito($g) > 0) implies gioca = true)
	
	// *********** inventate ************
	
	// esiste un percorso in cui il secondo giocatore vince
	CTLSPEC ef(credito(GDUE) > 0 and (exist $g in DomGiocatore with credito($g) = 0))
	
	//FALSA: il giocatore due non può avere 5 monete
	CTLSPEC ag(credito(GDUE) != 5)
	
	//un giocatore con credito a zero implica la fine del gioco (non giocare altri round)
	CTLSPEC ag(((credito(GUNO) = 0) or (credito(GDUE) = 0) or (credito(GTRE) = 0) or (credito(GQUATTRO) = 0)) 
			implies ax(not gioca)
	)
	
	// -------------------------- Main rule--------------------------

	main rule r_main =
	// se gioco attivo
		if gioca then
			// se qualche giocatore ho credito nullo
			if credito(GUNO) = 0 or credito(GDUE) = 0 or credito(GTRE) = 0 or credito(GQUATTRO) = 0 then
				gioca := false
			else
				par
					// perde, cede denaro
					if dado = 1 then
						par
							// se GUNO perde cede a GQUATTRO
							if turno = GUNO then
								r_cedi[GUNO, GQUATTRO]
							endif
							// se GDUE perde cede a GUNO
							if turno = GDUE then
								r_cedi[GDUE, GUNO]
							endif
							// se GTRE perde cede a GDUE
							if turno = GTRE then
								r_cedi[GTRE, GDUE]
							endif
							// se GQUATTRO perde cede a GTRE
							if turno = GQUATTRO then
								r_cedi[GQUATTRO, GTRE]
							endif
						endpar
					endif
					
					// patta
	//				if dado = 2 then
	//					// nulla
	//				endif
					
					// vince, prende denaro
					if dado = 3 then
						par
							// se GUNO vince ruba a GDUE
							if turno = GUNO then
								r_ruba[GUNO, GDUE]
							endif
							// se GDUE vince ruba a GUNOGTRE
							if turno = GDUE then
								r_ruba[GDUE, GTRE]
							endif
							// se GTRE vince ruba a GQUATTRO
							if turno = GTRE then
								r_ruba[GTRE, GQUATTRO]
							endif
							// se GQUATTRO vince ruba a GUNO
							if turno = GQUATTRO then
								r_ruba[GQUATTRO, GUNO]
							endif
						endpar
					endif
				
				// passa ad ogni turno
				r_passa[]
				endpar
			endif
		endif
			
		
// -------------------------- Initial state --------------------------
default init s0:
	function gioca = true
	function credito($g in DomGiocatore) = 3
	function turno = GUNO
