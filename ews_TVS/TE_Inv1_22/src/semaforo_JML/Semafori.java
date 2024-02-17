package semaforo_JML;

public class Semafori {
	
	//@ public invariant coloreSemaforo.length == 2;
	/*@ spec_public @*/ int[] coloreSemaforo;
	
	// 0 = rosso, 1 = verde, 2 = giallo
	
	//@ ensures coloreSemaforo != null && coloreSemaforo.length == 2;
	//@ ensures (\forall int i; i > 0 && i < 2; coloreSemaforo[i] == 0);
	public Semafori() {
		coloreSemaforo = new int[2];
		coloreSemaforo[0] = 0;
		coloreSemaforo[1] = 0;
	}
	
	//@ requires coloreSemaforo != null && coloreSemaforo.length == 2;
	//@ requires (s == 0 || s == 2);
	/*requires (\exists int i; i > 0 && i < coloreSemaforo.length; coloreSemaforo[i] == 1) 
	  @ || (\exists int i; i > 0 && i < coloreSemaforo.length; coloreSemaforo[i] == 0); 
	@*/
	//@ ensures coloreSemaforo[s] == 2;
	public void giallo(int s) {
		coloreSemaforo[s] = 2;
	}
	
	//@ requires coloreSemaforo != null && coloreSemaforo.length == 2;
	//@ requires (s == 0 || s == 1);
	//@ requires coloreSemaforo[s] == 2;
	//@ ensures coloreSemaforo[s] == 0;
	public void rosso(int s) {
		coloreSemaforo[s] = 0;
	}
	
	//@ requires coloreSemaforo != null && coloreSemaforo.length == 2;
	//@ requires (s == 0 || s == 1);
	//@ requires (coloreSemaforo[s] == 2 || coloreSemaforo[s] == 0);
	//@ ensures coloreSemaforo[s] == 1;
	public void verde(int s) {
		coloreSemaforo[s] = 1;
	}
	
	//@ requires coloreSemaforo != null && coloreSemaforo.length == 2;
	public void comando(int s) {
		// entrambi rossi
		if (coloreSemaforo[0] == 0 && coloreSemaforo[1] == 0) {
			//@ assert (\forall int i; i >= 0 && i < coloreSemaforo.length; coloreSemaforo[i] == 0);
			verde(s);
//			coloreSemaforo[s] = 0;	// violo prossimo assert
			//@ assert coloreSemaforo[s] == 1;
//			if (s == 0) {
//				coloreSemaforo[1] = 1;	// violo prossimo assert
//			}
			//@ assert (\exists int i; i > 0 && i < coloreSemaforo.length; coloreSemaforo[i] == 0);
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
		
//		SA_SB.coloreSemaforo = new int[3];	// violo invariante
//		SA_SB.coloreSemaforo = null;	// non può essere null
		
		SA_SB.statoSemafori();
//		SA_SB.comando(45);	// posso dare solo 1 o 0
		SA_SB.comando(0);
		SA_SB.statoSemafori();
		SA_SB.comando(1);
		SA_SB.statoSemafori();
		SA_SB.comando(1);
		SA_SB.statoSemafori();
		SA_SB.comando(1);
		SA_SB.statoSemafori();
//		SA_SB.comando(1);	// SB già verde
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