package sensor_IDM;

import static org.junit.Assert.*;

import org.junit.Test;

public class SensorVotingTestID_Func {

	@Test
	public void testnnn() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, -1, -1));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}

	@Test
	public void testnnz() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, -1, 0));
		assertTrue(sv.v1 && sv.v2);
		assertFalse(sv.v3);
	}
	@Test
	public void testnnp() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, -1, 1));
		assertTrue(sv.v1 && sv.v2);
		assertFalse(sv.v3);
	}
	@Test
	public void testnzn() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, 0, -1));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}
	@Test
	public void testnzz() {
		SensorVoting sv = new SensorVoting();
		assertEquals(0,sv.readChannels(-1, 0, 0));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}
	@Test
	public void testnzp() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, 0, 1));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}
	@Test
	public void testnpn() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, 1, -1));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}
	@Test
	public void testnpz() {
		SensorVoting sv = new SensorVoting();
		assertEquals(-1,sv.readChannels(-1, -1, -1));
		assertTrue(sv.v1 && sv.v2 && sv.v3);
	}
	// ...
}
