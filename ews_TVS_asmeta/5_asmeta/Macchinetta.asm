asm Macchinetta

import StandardLibrary

signature:
	
	enum domain Bevanda = {COFFEE, MILK, TEA}
	enum domain Moneta = {FIFTY_CENTS, ONE_EURO}
	domain CoinDomain subsetof Integer
	
	controlled available : Bevanda -> Integer	// unità disponibili per bevanda
	controlled erogato : Bevanda
	controlled coins: CoinDomain
	monitored coin : Moneta

definitions:
	
	domain CoinDomain = {0 : 25}	// max 25 monete

	main rule r_main = 
		// se 50cent eroga latte
		if coin = FIFTY_CENTS then
			// se latte disponibile
			if coins < 25 and available(MILK) > 0 then 
				par
					// allo stesso tempo eroga il latte e diminuisce la quantità disponibile
					erogato := MILK
					available(MILK) := available(MILK) - 1
					coins := coins + 1
				endpar
			else
				erogato := undef	// imposta a null
			endif
		else // se riceve 1 euro
			if coins < 25 then
				choose $b in Bevanda with $b != MILK do		// sceglie random ma non milk
					// se variabile locale bevanda disponibile
					if available($b) > 0 then
						par
							// allo stesso tempo eroga la bevanda e diminuisce la quantità disponibile
							erogato := $b
							available($b):= available($b) - 1
						endpar
					else
						erogato := undef	// imposta a null
					endif
			else
				erogato := undef	// imposta a null
			endif
		endif


default init s0:
	function available($b in Bevanda) = 10	// unità disponibili per ogni bevanda all'inizio
