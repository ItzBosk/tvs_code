package p;

public class PariODispari {

	// budget dell'utente
	public int b_utente;
	// budget del pc
	public int b_pc;

	public PariODispari() {
		b_utente = b_pc = 5;
	}

	/**
	 * 
	 * @param utente
	 *            : numero dell'utente
	 * @param pc
	 *            : numero del pc
	 * @return true se e solo se il budget è aggiornato
	 */
	public boolean tira(int utente, int pc) {
		if (finito() || utente < 1 || utente > 5 || pc < 1 || pc > 5)
			return false;
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

	public boolean finito() {
		if (b_pc == 0 || b_utente == 0)
			return true;
		else
			return false;

	}

}
