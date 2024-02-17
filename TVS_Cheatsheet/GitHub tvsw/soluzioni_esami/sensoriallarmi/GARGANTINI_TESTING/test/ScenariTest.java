import static org.junit.Assert.*;

import org.junit.Test;

public class ScenariTest {

	/**
	 * 
	 * Scenario 1: due sensori non adiacenti possono essere spenti
	 */
	@Test
	public void testCaso1() {
		Allarme alarm = new Allarme();

		// spengo sensore 0 e controllo la riuscita
		assertTrue(alarm.setSensore(0, false));
		assertFalse(alarm.acceso(0));
		assertFalse(alarm.pericolo());

		// spengo sensore 2 e controllo la riuscita
		assertTrue(alarm.setSensore(2, false));
		assertFalse(alarm.acceso(2));
		assertFalse(alarm.pericolo());
	}

	/**
	 * 
	 * Scenario 2: provo a spegnerne 4 ma non riesco
	 */
	@Test
	public void testCaso2() {
		Allarme alarm = new Allarme();

		// spengo sensore 1 e controllo la riuscita
		assertTrue(alarm.setSensore(1, false));
		assertFalse(alarm.acceso(1));
		assertFalse(alarm.pericolo());

		// spengo sensore 2 e controllo la riuscita (non riesce perchè il vicino
		// è spento)
		assertFalse(alarm.setSensore(2, false));
		assertTrue(alarm.acceso(2));
		assertFalse(alarm.pericolo());

		// spengo sensore 3 e controllo la riuscita
		assertTrue(alarm.setSensore(3, false));
		assertFalse(alarm.acceso(3));
		assertFalse(alarm.pericolo());

		// spengo sensore 0 e controllo la riuscita (non riesce perchè il vicino
		// è spento)
		assertFalse(alarm.setSensore(0, false));
		assertTrue(alarm.acceso(0));
		assertFalse(alarm.pericolo());
	}

}
