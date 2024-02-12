import static org.junit.Assert.*;

import org.junit.Test;

public class BranchTest {

	/**
	 * 
	 *  per coprire la decisione iniziale 
	 */
	@Test
	public void testAccendi() {
		Allarme alarm = new Allarme();
		assertFalse(alarm.setSensore(-1, false));
	}
}
