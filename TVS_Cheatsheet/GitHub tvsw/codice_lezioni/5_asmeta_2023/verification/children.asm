asm children 

import ../StandardLibrary
import ../CTLlibrary

signature:
	domain Children subsetof Agent
	domain NumOfSweet subsetof Integer
	controlled sweetOwned: Children -> NumOfSweet

	derived leftNeighbour: Children -> Children
	derived rightNeighbour: Children -> Children
	
	static chil1: Children
	static chil2: Children
	static chil3: Children
	static chil4: Children
	static chil5: Children
	static chil6: Children

definitions:
	domain NumOfSweet = {0 : 4}

	function leftNeighbour($p in Children) =
		switch($p)
			case chil1: chil2
			case chil2: chil3
			case chil3: chil4
			case chil4: chil5
			case chil5: chil6
			case chil6: chil1
		endswitch

	function rightNeighbour($p in Children) =
		switch($p)
			case chil1: chil6
			case chil2: chil1
			case chil3: chil2
			case chil4: chil3
			case chil5: chil4
			case chil6: chil5
		endswitch

	rule r_sweetRule =
		if(sweetOwned(self) > 0) then
			sweetOwned(self) := sweetOwned(self) - 1
		else
			let($right=rightNeighbour(self)) in
				if(sweetOwned($right) > 0) then
					par
						sweetOwned($right) := sweetOwned($right) - 1
						sweetOwned(self) := sweetOwned(self) + 1
					endpar
				else
					let($left=leftNeighbour(self)) in
						if(sweetOwned($left) > 0) then
							par
								sweetOwned($left) := sweetOwned($left) - 1
								sweetOwned($right) := sweetOwned($right) + 1
							endpar
						endif
					endlet
				endif
			endlet
		endif

	//nel sistema ci sono sempre al massimo 24 caramelle
	CTLSPEC ag(sweetOwned(chil1) + sweetOwned(chil2) + sweetOwned(chil3) +
				sweetOwned(chil4) + sweetOwned(chil5) + sweetOwned(chil6) <= 24)

	//ogni bambino non ha mai piu' di 4 caramelle
	CTLSPEC (forall $p in Children with ag(sweetOwned($p) <= 4))

	//prima o poi nel sistema non ci sono piu' caramelle.
	CTLSPEC ef(sweetOwned(chil1) + sweetOwned(chil2) + sweetOwned(chil3) +
				sweetOwned(chil4) + sweetOwned(chil5) + sweetOwned(chil6) = 0)
	//se un bambino termina le caramelle ed uno dei suoi vicini ne ha, 
	//nello stato successivo il bambino potrebbe ancora avere caramelle
	CTLSPEC ef( (sweetOwned(chil1)=0 and (sweetOwned(chil6)>0 or sweetOwned(chil2)>0)) and ex(sweetOwned(chil1)>0)  )
	//in una forma meno forte
 	CTLSPEC ef( sweetOwned(chil1)=0 and ex(sweetOwned(chil1)>0)  )
 
	main rule r_Main =
		choose $p in Children with true do
			program($p)

default init s0:
	function sweetOwned($p in Children) = 4

	agent Children:
		r_sweetRule[]