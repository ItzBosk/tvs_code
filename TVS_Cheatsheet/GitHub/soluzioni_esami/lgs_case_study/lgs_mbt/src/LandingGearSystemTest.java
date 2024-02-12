import static org.junit.Assert.*;

import org.junit.Test;


public class LandingGearSystemTest {

	@Test
	public void test() {
		// questo test è stato generato, dovrei convertirlo in test Junit
		//step(CLOSED:EXTRACTED, DOWN, CLOSED:EXTRACTED)
		//done(CLOSED:EXTRACTED, UP, OPEN:EXTRACTED)
		//done (OPEN:EXTRACTED, DOWN, CLOSED:EXTRACTED)
		//done (CLOSED:EXTRACTED, UP, OPEN:EXTRACTED)
		//done (OPEN:EXTRACTED, UP, OPEN:RETRACTED)
		//done (OPEN:RETRACTED, DOWN, OPEN:EXTRACTED)
		//done (OPEN:EXTRACTED, UP, OPEN:RETRACTED)
		//done (OPEN:RETRACTED, UP, CLOSED:RETRACTED)
		//done (CLOSED:RETRACTED, DOWN, OPEN:RETRACTED)
		//done (OPEN:RETRACTED, UP, CLOSED:RETRACTED)
	}

}
