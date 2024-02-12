package lgs.sensorvoting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/** commenta qui a cosa serve questi casi di test
 * 
 */
public class SensorVotingTest {

	// statement coveragerage
	@Test
	public void testComputeSensorValueSC1() {
		SensorVotingBoolean sv = new SensorVotingBoolean();
		// caso base: tutto ok
		sv.computeSensorValue(true, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		// s1 diventa invalido
		sv.computeSensorValue(false, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		// s2 e s3 sono validi
		sv.computeSensorValue(false, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		// s2/s3 diventa invalido
		sv.computeSensorValue(false, false, true);
		assertTrue(!sv.isValid());
		
	}

}
