package lgs.sensorvoting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/** commenta qui a cosa serve questi casi di test
 * 
 */
public class SensorVotingTestMCDC {

	// statement coveragerage
	@Test
	public void testComputeSensorValue1() {
		SensorVotingBoolean sv = new SensorVotingBoolean();
		// caso base: tutto ok
		sv.computeSensorValue(true, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		// s1 diventa invalido
		sv.computeSensorValue(false, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		sv.computeSensorValue(false, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
	}
	// statement coveragerage
	@Test
	public void testComputeSensorValue2() {
		SensorVotingBoolean sv = new SensorVotingBoolean();
		// caso base: tutto ok
		sv.computeSensorValue(true, true, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		// s1 diventa invalido
		sv.computeSensorValue(true, false, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
		sv.computeSensorValue(true, false, true);
		assertTrue(sv.getValue());
		assertTrue(sv.isValid());
	}

}
