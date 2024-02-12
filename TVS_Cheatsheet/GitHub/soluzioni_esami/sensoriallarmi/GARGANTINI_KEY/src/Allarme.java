public class Allarme {

	private /*@spec_public@*/  boolean[] sensori;

	//@ public invariant sensori!=null && sensori.length == 4;
	
	//@ public invariant !pericolo();
	
	/*@ ensures sensori.length == 4 && (\forall int i; i>= 0 && i < sensori.length; sensori[i]);
	  @*/
	public Allarme() {
		sensori = new boolean[]{true,true,true,true};
	}

	//@ requires sensore >0 && sensore <4;
	// @ ensures \result ==> sensori[sensore] == acceso;
	// @ ensures \result <==> \old(sensori[sensore]) != sensori[sensore];
	public boolean setSensore(int sensore, boolean acceso) {
		if (sensori[sensore] != acceso && acceso) {
			sensori[sensore] = true;
			return true;
		} else {
			// controlla se si può spegnere
			int dx = sensore == 0 ? sensori.length - 1 : sensore - 1;
			int sx = sensore == sensori.length - 1 ? 0 : sensore + 1;
			if (sensori[dx] && sensori[sx]) {
				sensori[sensore] = false;
				return true;
			}
		}
		return false;
	}

	//@ requires sensore >0 && sensore <4;
	public boolean acceso(int sensore) {
		return sensori[sensore];
	}

	//@ ensures \result == false;
	public boolean pericolo() {
		return (!sensori[0] && !sensori[1]) || (!sensori[1] && !sensori[2])
				|| (!sensori[2] && !sensori[3]) || (!sensori[3] && !sensori[0]);
	}

}
