package sensor_IDM;

import static org.junit.Assert.*;

import org.junit.Test;

//
// FUNCTIONALITY BASED; guardo la funzionalità del mio metodo
//
public class SensorVotingTestIDMIB {

	@Test
	public void testTuttiUguali() {
		SensorVoting sv = new SensorVoting();
		assertEquals(1,sv.readChannels(1, 1, 1));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}

	@Test
	public void testC1Fault() {
		SensorVoting sv = new SensorVoting();
		assertEquals(1,sv.readChannels(0, 1, 1));
		assertTrue(sv.v3 && sv.v2);
		assertFalse(sv.v1);
	}
	@Test
	public void testC3Fault() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, -1, 1));
		assertTrue(sv.v1 && sv.v2);
		assertFalse(sv.v3);
	}
	@Test
	public void testC2Fault() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, 0, -1));
		assertTrue(sv.v1 && sv.v3);
		assertFalse(sv.v2);
	}
	@Test
	public void testAllFaults() {
		SensorVoting sv = new SensorVoting();
		assertEquals(2,sv.readChannels(1, 2, 3));
		assertFalse(sv.v1);
		assertFalse(sv.v2);
		assertFalse(sv.v3);
	}
}
