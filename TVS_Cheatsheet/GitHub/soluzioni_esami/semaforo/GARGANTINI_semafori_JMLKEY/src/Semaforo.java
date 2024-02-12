

public class Semaforo {

	/*@ spec_public @*/ int[] luce; // colore dei semafori

	//@ ensures (\forall int i; i >=0 && i <2;  luce[i] == 2); 
	public Semaforo() {
		// entrmabi rossi
		luce = new int[] { 2, 2 };
	}

	public boolean changecolor(int sem, int color) {
		// controllo gli input
		if (sem < 0 || sem > 1 || color < 0 || color > 2)
			return false; 
		// GIALLO -> ROSSO
		if (color == 2 && luce[sem] == 1) {
			luce[sem] = 2;
			return true;
		}
		// VERDE -> GIALLO
		if (color == 1 && luce[sem] == 0) {
			luce[sem] = 1;
			return true;
		}
		// ROSSO -> VERDE
		int altroSem = sem == 0 ? 1 : 0;
		if (color == 0 && luce[sem] == 2 && luce[altroSem] == 2) {
			luce[sem] = 0;
			return true;
		}
		return false;
	}

	public String toString() {
		char ch0 = luce[0] == 2 ? 'R' : luce[0] == 1 ? 'G' : 'V';
		char ch1 = luce[1] == 2 ? 'R' : luce[1] == 1 ? 'G' : 'V';
		return "" + ch0 + ch1;
	}
}
