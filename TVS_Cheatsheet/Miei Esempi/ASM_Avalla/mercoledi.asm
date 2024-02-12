asm mercoledi

import StandardLibrary
import LTLlibrary
import CTLlibrary

signature:

enum domain DStatoSemaforo = {VERDE,ROSSO,LAMPEGGIO}
enum domain DSemaforo = {AUTO,PEDONE}
enum domain D5050 = {GUASTO,NOGUASTO}
domain DSecondi subsetof Integer

controlled statoSemaforo: DSemaforo -> DStatoSemaforo 
controlled timer: DSemaforo -> DSecondi
controlled conta: DSemaforo -> Boolean
monitored pulsante: Boolean


derived isSemaforiGuasti: Boolean

definitions:
	
	domain DSecondi = {0:3}
	
	function isSemaforiGuasti = (forall $s in DSemaforo with statoSemaforo($s) != LAMPEGGIO )

rule r_rottura =
		par
			statoSemaforo(PEDONE) := LAMPEGGIO
			statoSemaforo(AUTO) := LAMPEGGIO
			conta(PEDONE) := false
			conta(AUTO) := false
			timer(PEDONE) := 0
			timer(AUTO) := 0
		endpar
		
main rule r_main = 
	par
		if conta(PEDONE) and timer(PEDONE) < 3 then
			timer(PEDONE):= timer(PEDONE) + 1
		endif
		
		if conta(AUTO)  and timer(AUTO) < 3 then
			timer(AUTO):= timer(AUTO) + 1
		endif
	
		if pulsante and statoSemaforo(PEDONE) = ROSSO and statoSemaforo(AUTO) = VERDE then 
			par
				statoSemaforo(AUTO) := ROSSO
				timer(AUTO) := 0
				timer(PEDONE) := 0
				conta(AUTO) := false
				conta(PEDONE) := true
			endpar
		endif
		
		if conta(PEDONE) and timer(PEDONE) = 3 then
			choose $p in D5050 with true do
				if $p = NOGUASTO then
					par
						statoSemaforo(PEDONE) := VERDE
						statoSemaforo(AUTO) := ROSSO
						conta(PEDONE) := false
						timer(PEDONE) := 0
						conta(AUTO) := true
						timer(AUTO) := 0
					endpar
				else
					par
						statoSemaforo(PEDONE) := LAMPEGGIO
						statoSemaforo(AUTO) := LAMPEGGIO
						conta(PEDONE) := false
						conta(AUTO) := false
						timer(PEDONE) := 0
						timer(AUTO) := 0
					endpar
				endif
		endif
		
		if conta(AUTO) and timer(AUTO) = 3 then
			choose $f in D5050 with true do
				if $f = NOGUASTO then
				par
					statoSemaforo(PEDONE) := ROSSO
					statoSemaforo(AUTO) := VERDE
					conta(AUTO) := false
					conta(PEDONE) := false
					timer(AUTO) := 0
					timer(PEDONE) := 0
				endpar
			else
				par
					statoSemaforo(PEDONE) := LAMPEGGIO
					statoSemaforo(AUTO) := LAMPEGGIO
					conta(PEDONE) := false
					conta(AUTO) := false
					timer(PEDONE) := 0
					timer(AUTO) := 0
				endpar
			endif
		endif
		
		if statoSemaforo(AUTO) = ROSSO and statoSemaforo(PEDONE) = ROSSO and conta(AUTO) = false and conta(PEDONE) = false then
			statoSemaforo(AUTO) := VERDE
		endif
		
	endpar
	
	
	
default init s0:
	 function statoSemaforo($s in DSemaforo) = ROSSO
	 function conta($s in DSemaforo) = false
	 function timer($s in DSemaforo) = 0
	