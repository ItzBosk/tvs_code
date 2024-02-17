import static org.junit.Assert.*;

import org.junit.Test;

public class StatementTest {

	/**
	 * 
	 *  per avere copertura degli statement
	 */
	@Test
	public void testAccendi() {
		Allarme alarm = new Allarme();
		// spengo sensore -1 che non esiste
		assertTrue(alarm.setSensore(0, false));
		assertFalse(alarm.acceso(0));
		assertTrue(alarm.setSensore(0, true));
		assertTrue(alarm.acceso(0));
	}

	@Test
	public void testindiceSbagliato() {
		Allarme alarm = new Allarme();
		assertFalse(alarm.acceso(-1));
	}
}
