public class Allarme {

	public boolean[] sensori;

	// l'array ha sempre 4 elementi
	//@ public invariant sensori!=null && sensori.length == 4;
	
	// non c'è mai pericolo
	// public invariant !pericolo(); // uqesto crea problemi 

	
	
	//@ requires true;
	//@ ensures sensori.length == 4 && (\forall int i; i>= 0 && i < sensori.length; sensori[i]);
	public Allarme() {
		sensori = new boolean[] { true, true, true, true };
	}
	// indici corretti
	//@ requires sensore >=0 && sensore <=3;
	// restuitisce vero se e solo se è cambiato 
	//@ ensures \result <==> \old(sensori[sensore]) != sensori[sensore];
	// si può sempre accendere se non acceso
	//@ ensures (acceso && \old(sensori[sensore]) != sensori[sensore]) ==> sensori[sensore];	
	public boolean setSensore(int sensore, boolean acceso) {
		if (sensori[sensore] != acceso) {
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

	//@ requires sensore >=0 && sensore <=3;
	public boolean acceso(int sensore) {
		return sensori[sensore];
	}
	
	// non c'è mai pericolo !
	//@ ensures \result == false; // questo in alternativa con l'invariante
	public boolean pericolo() {
		return (!sensori[0] && !sensori[1]) || (!sensori[1] && !sensori[2])
				|| (!sensori[2] && !sensori[3]) || (!sensori[3] && !sensori[0]);
	}
}
