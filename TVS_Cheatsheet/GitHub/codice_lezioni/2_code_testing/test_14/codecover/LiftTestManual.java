package codecover;

import static org.junit.Assert.*;

import org.junit.Test;

public class LiftTestManual {

	@Test
	public void testIsAllowed() {
		assertTrue(Lift.isAllowed(0, 1000));
	}
	@Test
	public void testIsAllowed2() {
		assertFalse(Lift.isAllowed(5, 1000));
	}
	@Test
	public void testIsAllowed3() {
		assertTrue(Lift.isAllowed(3, 300));
	}

}
