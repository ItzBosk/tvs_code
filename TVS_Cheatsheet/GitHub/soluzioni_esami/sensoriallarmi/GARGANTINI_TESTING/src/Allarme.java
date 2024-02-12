public class Allarme {

	boolean[] sensori;

	public Allarme() {
		sensori = new boolean[] { true, true, true, true };
	}

	/**
	 * 
	 * @param sensore
	 *            indice del sensore da settare
	 * @param acceso
	 *            stato da mettere
	 * @return true se cambiato
	 */
	public boolean setSensore(int sensore, boolean acceso) {
		if (sensore >= 0 && sensore < 4 && sensori[sensore] != acceso) {
			if (acceso) {
				sensori[sensore] = true;
				return true;
			} else {
				// controlla se si può spegnere
				int dx = (sensore - 1 + sensori.length) % sensori.length;
				int sx = (sensore + 1) % sensori.length;
				if (sensori[dx] && sensori[sx]) {
					sensori[sensore] = false;
					return true;
				}
			}
		}
		return false;
	} 

	public boolean acceso(int sensore) {
		if (sensore < 0 || sensore > 3)
			return false; // Ho solo 4 sensori
		return sensori[sensore];
	}

	public boolean pericolo() {
		return (!sensori[0] && !sensori[1]) || (!sensori[1] && !sensori[2])
				|| (!sensori[2] && !sensori[3]) || (!sensori[3] && !sensori[0]);
	}
}
