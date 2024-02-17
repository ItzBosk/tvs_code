package gioco_JUNIT;

public class Gioco {
	
	int[] creditoGiocatori;
	int numGiocatori;
	int numGiocata;
	boolean Gioca;
	
	public Gioco(int n) {
		// copro precondizione
		if (n <= 0)
			return;
		
		Gioca = true;
		numGiocatori = n;
		numGiocata = 0;
		creditoGiocatori = new int[n];
		
		for (int i = 0; i < n; i++) {
			creditoGiocatori[i] = 3;
		}
	}
	
	public boolean gioca() {
		if (Gioca) {
			updateConto(numGiocata % numGiocatori, (numGiocata % 3) + 1);
			numGiocata++;
		}
		return Gioca;
	}
	
	void checkPerdita() {
		for (int credito : creditoGiocatori) {
			if (credito == 0)
				Gioca = false;
		}
	}
	
	public boolean updateConto(int giocatore, int dado) {
		// copro precondizioni
		if((giocatore > numGiocatori) || dado < 1 || dado > 3)
			return false;
		
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
		Gioco g = new Gioco(3);
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
