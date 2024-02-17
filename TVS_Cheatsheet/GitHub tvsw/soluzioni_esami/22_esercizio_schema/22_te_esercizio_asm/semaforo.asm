/* Tema Esame: Schema - Esercizio 5 (logica Asmeta) */

asm semaforo

import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:
	enum domain NumSemaforo = {SEM1, SEM2}
	enum domain ColoreSemaforo = {ROSSO, GIALLO, VERDE}
	
	// sem prende un numero di un semaforo e restituisce
	// il suo colore attuale
	controlled coloreSem : NumSemaforo -> ColoreSemaforo
	
	// comando che dice quale dei due semafori cambiare
	// da rosso -> a verde
	monitored segnale : NumSemaforo
	
	// funzione statica che mi restituisce il colore
	// dell'altro semaforo rispetto a quello passato
	// come parametro
	static coloreAltroSem : NumSemaforo -> ColoreSemaforo
	
	// derivate per CTL/LTL
	derived tuttiVerdi : Boolean
	derived tuttiRossi : Boolean
		
definitions:

	// funzione statica
	function coloreAltroSem($s in NumSemaforo) = 
		if $s=SEM1 then
			coloreSem(SEM2)
		else
			coloreSem(SEM1)
		endif
		
	// funzioni derivata per CTL/LTL
	function tuttiVerdi =
		(forall $s in NumSemaforo with coloreSem($s)=VERDE)
	
	function tuttiRossi =
		(forall $s in NumSemaforo with coloreSem($s)=ROSSO)
		
	macro rule r_verde($s in NumSemaforo) =
		coloreSem($s) := VERDE
		
	rule r_giallo ($s in NumSemaforo) =
		coloreSem($s) := GIALLO
		
	rule r_rosso ($s in NumSemaforo) =
		coloreSem($s) := ROSSO
		 
	rule r_switchColore($s in NumSemaforo) =
		switch(coloreSem($s))
			case VERDE:
				r_giallo[$s]
			case GIALLO:
				r_rosso[$s]
		endswitch
	
	//---------------------------------------------------------
	// PROPRIETA' LTL/CTL:
	
	// 1) non accade mai che i semafori siano entrambi verdi
	// utilizziamo una "derived" per la definizione della regola 
	CTLSPEC ag(not tuttiVerdi)
	LTLSPEC g(not tuttiVerdi)
	
	// 2) il semaforo 2 può diventare sempre verde (non solo allo stato iniziale)
	CTLSPEC ag(ef(coloreSem(SEM2)=VERDE))
	
	// 3) se un semaforo è verde allora l’altro è rosso
	// utilizziamo il forall senza utilizzare una "derived"
	LTLSPEC g(
		( forall $s in NumSemaforo with
			coloreSem($s)=VERDE implies coloreAltroSem($s)=ROSSO )
		      )
		      
	CTLSPEC ag(
		( forall $s in NumSemaforo with
			coloreSem($s)=VERDE implies coloreAltroSem($s)=ROSSO )
		      )	      
	// 4) se entrambi i semafori sono rossi e viene scelto il semaforo 1,
	//    nello stato successivo il semaforo 1 è verde
	CTLSPEC ag( (tuttiRossi and segnale=SEM1) implies ax(coloreSem(SEM1)=VERDE) )
	
	// 5) il semaforo 1 non può mai essere verde
	// mi aspetto che sia FALSA perché sicuramente esiste un percorso
	// in cui il semaforo 1 può diventare verde
	CTLSPEC ag(coloreSem(SEM1)!=VERDE)
	// controesempio fornito:
	/*
		 -> State: 1.1 <-
	    coloreSem(SEM1) = ROSSO
	    segnale = SEM1
	    coloreSem(SEM2) = ROSSO
	    coloreAltroSem(SEM2) = ROSSO
	    coloreAltroSem(SEM1) = ROSSO
	  	-> State: 1.2 <-
	    coloreSem(SEM1) = VERDE
	    coloreAltroSem(SEM2) = VERDE
	 */
	 
	 // PROPRIETA' DEFINITE DA ME NON SCRITTE NELL'ESERCIZIO:
	 // 1') i semafori sono sempre tutti rossi
	 // mi aspetto che sia falsa
	 CTLSPEC ag(tuttiRossi)
	 // controesempio:
	 /*
		-> State: 2.1 <-
	    coloreSem(SEM1) = ROSSO
	    coloreSem(SEM2) = ROSSO
	    segnale = SEM1
	    coloreAltroSem(SEM2) = ROSSO
	    coloreAltroSem(SEM1) = ROSSO
	  	-> State: 2.2 <-
	    coloreSem(SEM1) = VERDE
	    coloreAltroSem(SEM2) = VERDE
      */
	
	//---------------------------------------------------------
	
	main rule r_Main =
	par 
		// passo a verde SOLO se entrambi i semafori sono rossi
		if(coloreSem(segnale)=ROSSO and coloreAltroSem(segnale)=ROSSO) then
			r_verde[segnale]
		endif
		// se il semaforo indicato da "segnale" NON è rosso e viene
		// richiesto di cambiarlo allora cambio il suo colore
		if coloreSem(segnale)!=ROSSO then
			r_switchColore[segnale]			
		endif
	endpar
	
default init s0:
	function coloreSem($s in NumSemaforo) = ROSSO