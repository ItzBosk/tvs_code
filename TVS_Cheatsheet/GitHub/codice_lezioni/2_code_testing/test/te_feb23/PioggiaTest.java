package te_feb23;

import static org.junit.Assert.*;

import org.junit.Test;

public class PioggiaTest {

	@Test
	public void testSet() {
		Pioggia p = new Pioggia();
		// T il primo altri tutti false
		// mese 0 
		// valore 0
		assertFalse(p.set(0, 0));
		// F il primo e tutti glia ltri false
		assertTrue(p.set(5, 0));
		// caso 3 
		// F T  F F 
		assertFalse(p.set(14, 0));
		// caso 4
		// F  F  T  F -
		assertFalse(p.set(5, -4));
		// caso 5
		// F  F  F  T  T 
		// porto lo stato a piogga > 50
		p.set(5, 51);
		assertFalse(p.set(5, 150));
		// caso 6 
		// F  F  F  T  F 
		p.set(5, 49);
		assertTrue(p.set(5, 150));		
	}

}
