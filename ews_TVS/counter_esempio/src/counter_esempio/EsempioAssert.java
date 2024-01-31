package counter_esempio;

import org.junit.Test;

enum Stato {ON, OFF}

public class EsempioAssert {
	
	// senza assert
	void print1(Stato s) {
		switch (s) {
		case ON:
			System.out.println("ON");
			break;
		case OFF:
			System.out.println("OFF");
			break;
		// non verrà mai eseguito perché on/off
		default:	// senza però non gestisce bene se modifico Stato{}
			break;
		}
	}
	
	// con assert di java:
		// non ha problemi di dead code
		// robusto a nuovi valori di Stato
	void print2(Stato s) {
		switch (s) {
		case ON:
			System.out.println("ON");
			break;
		default:
			assert s == Stato.OFF;
			System.out.println("OFF");
		}
	}
	
	// test eccezioni
	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		int c = 0;
		int h = 90 / c;
	}
}
