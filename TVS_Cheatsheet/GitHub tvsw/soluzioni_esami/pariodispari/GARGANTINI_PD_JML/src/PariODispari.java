public class PariODispari {

	// budget dell'utente
	/*@ spec_public */ int b_utente;
	// budget del pc
	/*@ spec_public */ int b_pc;

	// la somma dei due è sempre 10
	//@ public invariant b_utente + b_pc == 10;
	// nessuno dei due può andare sottozero
	//@ public invariant b_utente>=0 && b_pc>=0;
	
	//@ requires true;
	//@ ensures b_utente == 5 && b_pc == 5;
	public PariODispari() {
		b_utente = 5;
		b_pc = 5;
	}

	/**
	 * 
	 * @param utente
	 *            : numero dell'utente
	 * @param pc
	 *            : numero del pc
	 * @return true se e solo se il budget è aggiornato
	 */
	//@ requires   !(finito() || utente < 1 || utente > 5 || pc < 1 || pc > 5);
	// restituisce true se e solo se il budget è modificato
	//@ ensures \result <==> (\old(b_utente)!=b_utente || \old(b_pc)!=b_pc);
	public boolean tira(int utente, int pc) {
		// se pari
		if (utente + pc % 2 == 0) {
			b_utente++;
			b_pc--;
		} else {
			b_pc++;
			b_utente--;
		}
		return true;
	}

	public /*@ pure @*/ boolean finito() {
		return (b_pc == 0 || b_utente == 0);
	}

}
