
public class Telecamere {

	//@ invariant acceso!= null && acceso.length > 0;
	//@ invariant (\exists int i; 0 <= i && i < acceso.length; acceso[i]);
	boolean[] acceso;

	//@ requires n > 0;
	//@ ensures (\forall int i; 0 <= i < acceso.length; acceso[i]);
	//@ ensures acceso != null && acceso.length == n  && acceso.length > 0;
	//@ diverges true;
	public Telecamere(int n) {
		acceso = new boolean[n];
		//@ loop_invariant acceso!= null && acceso.length == n && 0 <= i  && i <= n && (\forall int j; 0 <= j && j < i; acceso[j]);
		for (int i = 0; i < n; i++) {
			acceso[i] = true;
		}
	}

	//@ requires 0 <= i <  acceso.length && !acceso[i];
	void accendi(int i) {
		acceso[i] = true;
	}

	//@ requires 0 <= i < acceso.length && acceso[i];
	//@ diverges true;
	void spegni(int i) {
		//@ loop_invariant acceso!= null && 0 <= j && j < acceso.length; 
		for (int j = 0; j < acceso.length; j++) {
			if (acceso[j] && j != i) {
				acceso[i] = false;
				return;
			}
		}
	}
}
