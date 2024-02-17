package rashhour;

import static org.junit.Assert.*;

import org.junit.Test;

public class RushHourTempMCDC {

	@Test
	public void testScenarioUscita() {
		//
		RushHourTemp rh = new RushHourTemp();
		// valido
		assertTrue(rh.moveCar(1, 5, 1));
		// riga non valida
		assertFalse(rh.moveCar(-1, 5, 1));
		// colonna non valida
		assertFalse(rh.moveCar(1, 7, 1));
		// direzione sbagliata
		assertFalse(rh.moveCar(1, 5, 0));
		assertFalse(rh.moveCar(1, 5, 7));
	}

}
