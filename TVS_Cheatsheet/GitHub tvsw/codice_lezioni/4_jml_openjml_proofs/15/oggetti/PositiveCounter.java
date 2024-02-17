package oggetti;

/**
 * Il contatore deve sempre essere maggiore o uguale a zero.
 * La proprieta' viene mantenuta verificando che il decremento sia eseguito solo
 * quando il contatore e' > 0.
 *
 */
public class PositiveCounter {
	
	/*@ public invariant counter >= 0; @*/

	private /*@ spec_public @*/ int counter;

	//@ requires true;
	PositiveCounter() {
		counter = -1;
	}

	//@ ensures counter == \old(counter) + 1;
	public void incr() {
		counter++;
	}

	//@ ensures counter == \old(counter) - 1;
	public void decr() {
		counter--;
	}

}
