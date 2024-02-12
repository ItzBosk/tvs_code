package rashhour;

import static org.junit.Assert.*;

import org.junit.Test;

public class RushHourTempTest {

	@Test
	public void testScenarioUscita() {
		//
		RushHourTemp rh = new RushHourTemp();
		//
		assertTrue(rh.moveCar(1, 5, 1));
		assertFalse(rh.redCarAtExit());
		assertTrue(rh.moveCar(2, 5, 1));
		assertFalse(rh.redCarAtExit());
		// sposto macchina rossa
		assertTrue(rh.moveCar(2, 2, 2));
		assertFalse(rh.redCarAtExit());
		assertTrue(rh.moveCar(2, 3, 2));
		assertFalse(rh.redCarAtExit());
		assertTrue(rh.moveCar(2, 4, 2));
		// finalmente la mcchina rossa è uscita
		assertTrue(rh.redCarAtExit());
	}

}
