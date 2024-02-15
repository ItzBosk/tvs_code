package gioco;

public class Gioco {
	
	/*@ spec_public @*/ int[] creditoGiocatori;
	
	//@ public invariant numGiocatori >= 0;
	/*@ spec_public @*/ int numGiocatori;
	
	//@ public invariant numGiocata >= 0;
	/*@ spec_public @*/ int numGiocata;
	
	/*@ spec_public @*/ boolean Gioca;
	
	//@ requires n > 0;
	//@ ensures numGiocatori == n;
	//@ ensures numGiocata == 0;
	//@ ensures (\forall int i; i >= 0 && i < numGiocatori; creditoGiocatori[i] == 3);
	public Gioco(int n) {
		Gioca = true;
		numGiocatori = n;
		numGiocata = 0;
		creditoGiocatori = new int[n];
		
		//@ loop_invariant creditoGiocatori[i] == 3;
		for (int i = 0; i < n; i++) {
			creditoGiocatori[i] = 3;
		}
	}
	
	// ogni elemento verificabile ha già un invariante associato
	public boolean gioca() {
		if (Gioca) {
			updateConto(numGiocata % numGiocatori, (numGiocata % 3) + 1);
			numGiocata++;
		}
		return Gioca;
	}
	
	// check sconfitta di un giocatore e stop al gioco
	void checkPerdita() {
		for (int credito : creditoGiocatori) {
			if (credito == 0)
				Gioca = false;
		}
	}
	
	//@ requires giocatore <= numGiocatori;
	//@ requires (dado >= 1 && dado <= 3);
	//@ ensures (\forall int i; i > 0 && i < numGiocatori; creditoGiocatori[i] >= 0);
	public boolean updateConto(int giocatore, int dado) {
		System.out.println("Turno del giocatore: " + giocatore + ", Valore dado: " + dado);
		switch (dado) {
		case 1:
			// giocatore ha perso il turno
			creditoGiocatori[giocatore] --;
			checkPerdita();
			// giocatore cede credito al giocatore a sx
			if (giocatore == 0) {
				// primo giocatore, cede all'ultimo
				creditoGiocatori[numGiocatori - 1] ++;	
			}
			else {
				creditoGiocatori[giocatore - 1] ++;
			}
			break;
		case 2:
			// patta
			return false;
		case 3:
			// giocatore ha vinto il turno
			creditoGiocatori[giocatore] ++;
			// giocatore prende credito dal giocatore a dx
			if (giocatore == numGiocatori - 1) {
				// ultimo giocatore, prende credito dal primo
				creditoGiocatori[0] --;
			}
			else {
				creditoGiocatori[giocatore + 1] --;
			}
			checkPerdita();
			break;
		}
		
		return true;	// ha gestito un caso di in cui ha modificato il credito dei gicoatori
	}
	
	// print stato del gioco
	void printStatoGioco() {
		System.out.println("Stato gioco: " + String.valueOf(Gioca) + 
				", tot giocate = " + numGiocata + ", credito giocatori: ");
		for (int i = 0; i < numGiocatori; i++) {
			System.out.println("Giocatore " + i + ": " + creditoGiocatori[i]);
		}
		System.out.println("---------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		Gioco g = new Gioco(4);
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
		g.gioca();
		g.printStatoGioco();
	}
}
