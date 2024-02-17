import static org.junit.Assert.*;

import org.junit.Test;

public class MCDCTest {

	/**
	 * 
	 *  per coprire MCDC di (sensore >= 0 && sensore < 4 && sensori[sensore] != acceso)
	 */
	@Test
	public void testMCDCAccendi() {
		Allarme alarm = new Allarme();
		assertFalse(alarm.setSensore(-1, false)); // F T T
		assertFalse(alarm.setSensore(4, false)); // T F T
		assertFalse(alarm.setSensore(0, true)); // T T F
		assertTrue(alarm.setSensore(0, false)); // T T T 
	}
}
