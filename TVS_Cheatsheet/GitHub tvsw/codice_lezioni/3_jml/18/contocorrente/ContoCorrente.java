package contocorrente;


public class ContoCorrente {
	
	// questo non è mai < di MIN_BALANCE
	private /*@ spec_public */ int 	bilancio;
	public static final int MIN_BALANCE = 1000;
	
	//@ public invariant bilancio >= MIN_BALANCE;
	
	// per aprire un conto corrente, servono minimo MIN_BALANCE
	//@ requires x >= MIN_BALANCE;
	//@ ensures bilancio == x;
	public ContoCorrente(int x){
		bilancio = x;
	}
	//@ requires x >= bilancio - MIN_BALANCE;
	//@ ensures \result == bilancio;
	//@ ensures bilancio == \old(bilancio) - x;
	int withdraw(int x){
		bilancio -= x;
		return bilancio;
	}
	// deposita x e restituisce il valore corrent di balance
	//@ requires x > 0;
	//@ ensures \result == bilancio;
	// bilancio è incrementato di x
	//@ ensures bilancio == \old(bilancio) + x;
	int deposito(int x){
		bilancio = bilancio + x;
		return bilancio;
	}

}
