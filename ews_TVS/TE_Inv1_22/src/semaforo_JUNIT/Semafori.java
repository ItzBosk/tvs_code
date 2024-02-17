package semaforo_JUNIT;

public class Semafori {
	
	int[] coloreSemaforo;
	
	// 0 = rosso, 1 = verde, 2 = giallo
	
	public Semafori() {
		coloreSemaforo = new int[2];
		coloreSemaforo[0] = 0;
		coloreSemaforo[1] = 0;
	}
	
	public void giallo(int s) {
		coloreSemaforo[s] = 2;
	}
	
	public void rosso(int s) {
		coloreSemaforo[s] = 0;
	}
	
	public void verde(int s) {
		coloreSemaforo[s] = 1;
	}
	
	public void comando(int s) {
		
		if (s != 0 && s != 1)
			return;
		
		// entrambi rossi
		if (coloreSemaforo[0] == 0 && coloreSemaforo[1] == 0) {
			verde(s);
			return;
		}
		// SB rosso, SA verde o giallo, comando su SB
		if (coloreSemaforo[1] == 0 && s == 1) {
			if (coloreSemaforo[0] == 1) {
				giallo(0);
				return;
			}
			if (coloreSemaforo[0] == 2) {
				rosso(0);
				return;
			}
		}
		// SA rosso, SB verde o giallo, comando su SA
		if (coloreSemaforo[0] == 0 && s == 0) {
			if (coloreSemaforo[1] == 1) {
				giallo(1);
				return;
			}
			if (coloreSemaforo[1] == 2) {
				rosso(1);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Semafori SA_SB = new Semafori();
		
		SA_SB.statoSemafori();
		SA_SB.comando(0);
		SA_SB.statoSemafori();
		SA_SB.comando(0);
		SA_SB.statoSemafori();
		SA_SB.comando(1);
		SA_SB.statoSemafori();
		SA_SB.comando(1);
		SA_SB.statoSemafori();
		SA_SB.comando(1);
		SA_SB.statoSemafori();
		SA_SB.comando(0);
		SA_SB.statoSemafori();
		SA_SB.comando(0);
		SA_SB.statoSemafori();
	}
	
	void statoSemafori() {
		String colore1 = "";
		switch (coloreSemaforo[0]) {
		case 0:
			colore1 = "rosso";
			break;
		case 1:
			colore1 = "verde";
			break;
		case 2:
			colore1 = "giallo";
			break;
		}
		String colore2 = "";
		switch (coloreSemaforo[1]) {
		case 0:
			colore2 = "rosso";
			break;
		case 1:
			colore2 = "verde";
			break;
		case 2:
			colore2 = "giallo";
			break;
		}
		System.out.println("Stato semafori: SA = " + colore1 + 
				", SB = " + colore2);
	}
}