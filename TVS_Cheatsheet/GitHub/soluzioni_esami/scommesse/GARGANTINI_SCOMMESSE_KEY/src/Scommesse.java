public class Scommesse {

	/*@ spec_public @*/  int p[];
	//@ public invariant p.length == 5 && p != null;
	//@ public invariant (\forall int i; 0<= i && i < p.length; p[i] >= 0);

	//@ ensures p!=null;
	//@ ensures (\forall int i; 0<= i && i < p.length; p[i] == 5); 
	public Scommesse() {
		//p = new int[]{5,5,5,5,5};
		p = new int[5];
		//@ loop_invariant p;
		for(int i=0; i<5;i++) {
			p[i] = 5;
		}
	}
	
	public void valuta(int[] scommesse, int[] risultati) {

	}
	//@requires 0 <= scommessa && scommessa <= 2; 
	//@requires 0 <= risultato && risultato <= 2; 
	//@requires 0 <= partita && partita < 5;
	// non è finitio, sono tutti >= 2 altrimenti violerei l'invariante
	//@requires (\forall int i; 0<= i && i < p.length; p[i] >=2);
	// qualche post
	//p[0] viene al più incrementato di 1 o dec di 2
	//@ensures  \old(p[0]) -2  <= p[0] && p[0] <= \old(p[0]) +1 ; 
	// ...
	public void valuta(int scommessa, int risultato, int partita) {
		if (scommessa != risultato) {
			if (risultato == 0)
				p[partita] -= 1;
			else
				p[partita] -= 2;
		} else {
			p[partita]+= 1;
		}

	}
	// se p[0] è nulla allora è finito
	//@ ensures p[0] == 0 ==> \result;
	// non solo p[0] and un altro
	// ensures (\exists int i; 0<= i && i < 5; p[i] == 0) ==> \result;
	//@ ensures (p[0] == 0 || p[1] == 0 || p[2] == 0 || p[3] == 0 || p[4] == 0) ==> \result;
	
	public boolean finito() {
		int somma = 0;
		for (int b : p) {
			if (b < 2) return true;
			somma+=b;
		}
		if (somma >= 50) return true;
		return false;
	}


}
