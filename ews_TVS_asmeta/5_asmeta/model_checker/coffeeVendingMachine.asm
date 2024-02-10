asm coffeeVendingMachine

//Una macchinetta automatica dispensa caffe', te' e latte. La macchinetta accetta solo
//monete da 50 centesimi e da 1 euro. Se viene inserita una moneta da 50 centesimi, la
//macchinetta dispensa latte (se disponibile); se viene inserita una moneta da 1 euro,
//invece, la macchinetta decide in modo casuale di dispensare caffe' o te' (se disponibili).
//Se viene dispensata una bevanda, la sua disponibilita' viene decrementata e la moneta
//viene conservata nella macchinetta.
//Nel modello ASM ogni passo di macchina corrisponde all'inserimento di una moneta
//e all'erogazione di una bevanda corrispondente.
//La macchina all'inizio contiene 10 unita' per ogni bevanda; l'atto di erogazione di
//una bevanda corrisponde alla diminuzione di un'unita' della disponibilita' della stessa
//e alla conservazione della moneta (nelle monete conservate, non bisogna distinguere
//tra monete da 50 centesimi ed 1 euro). Se la bevanda non e' disponibile, non viene
//erogata e la moneta non viene conservata.
//La macchina puo' contenere al massimo 25 monete; quando la macchina e' piena di
//monete, non accetta altre monete e, quindi, non eroga pie' alcuna bevanda. All'inizio
//la macchinetta non contiene alcuna moneta.
//L'utente del sistema decide ad ogni passo di simulazione il tipo di moneta da inserire.


import StandardLibrary
import CTLlibrary
import LTLlibrary

signature:
	enum domain CoinType = {HALF | ONE}		// 50cent | 1€ 
	enum domain Product = {COFFEE | TEA | MILK}
	domain QuantityDomain subsetof Integer	
	domain CoinDomain subsetof Integer 	
	controlled available : Product -> QuantityDomain	// disponibilità prodotto
	controlled coins : CoinDomain		// tot monete nella macchinetta
	monitored insertedCoin : CoinType	// 50cent o 1€

definitions:
	domain QuantityDomain = {0 : 10}
	domain CoinDomain = {0 : 25}		// numero monete nella macchinetta
//	domain CoinDomain = {0 : 6000}		// con grandi numeri fa fatica
	
	// quando viene richiesto un prodotto lo decrementa e prende la moneta
	rule r_serveProduct($p in Product) =
		par
			available($p) := available($p) - 1
			coins := coins + 1
		endpar

/* ------------------------------ proprietà temporali ------------------------------ */
 
// 1) se MILK non è disponoibile non lo sarà più in futuro
	LTLSPEC g(available(MILK) = 0 implies g(available(MILK) = 0))
	
//  e COFFEE e TEA?
	// -> più generico (vale anche per MILK), in automatico la spezza e valuta per ogni Product
    LTLSPEC (forall $p in Product with g(available($p) = 0 
    	implies g(available($p) = 0)))

// 2) ci sono sempre almeno k unità di prodotto (MILK) 
// 	sk = 5?
//	LTLSPEC g(available(MILK) >= 5) // FALSA, dipende è random 

    LTLSPEC g(available(MILK) >= 0)
    
//  esiste uno stato in cui il latte e il tè sono terminati, e ci sono ancora 9 caffè
	CTLSPEC ef(available(MILK) = 0
		and available(TEA) = 0
		and available(COFFEE) = 9)	// essendo random anche qua dipende, non vale sempre

//	CTLSPEC not ef(available(MILK) = 0
//			and available(TEA) = 0
//			and available(COFFEE) = 9)	// falsa, cioè vera ma con traccia dimostrativas

	main rule r_Main =
		if(coins < 25) then
			if(insertedCoin = HALF) then
				if(available(MILK) > 0) then
					r_serveProduct[MILK]
				endif
			else
				choose $p in Product with $p != MILK and available($p) > 0 do
					r_serveProduct[$p]
			endif
		endif

default init s0:
	function coins = 0
	function available($p in Product) = 10