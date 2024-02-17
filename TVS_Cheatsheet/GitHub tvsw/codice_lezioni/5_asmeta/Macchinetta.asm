asm Macchinetta

import StandardLibrary

signature:

enum domain Bevanda = {COFFEE, MILK, TEA}
enum domain Moneta = {FIFTY_CENTS, ONE_EURO}

controlled available: Bevanda -> Integer
controlled erogato: Bevanda
monitored coin : Moneta

definitions:

main rule r_main = 
	if coin = FIFTY_CENTS then 
		if available(MILK)> 0 then par
				erogato := MILK
				available(MILK):= available(MILK)-1
				endpar
		else
				erogato := undef
		endif
	else // ho inserito un euro
		choose $b in Bevanda with $b != MILK do
			if available($b)> 0 then par
				erogato := $b
				available($b):= available($b)-1
				endpar
			else
				erogato := undef
			endif
	endif


default init s0:
function available($b in Bevanda) = 10
