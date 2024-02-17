package lgs.sensorvoting;

import static org.junit.Assert.*;

import org.junit.Test;
// interface baseds input domain modelling
//
// 3 valori each: positivo, nevativo, uguale a 0
//
public class SensorVotingIntTestFuncionalityIDM {

	@Test
	public void test1() {
		SensorVotingInt svi = new SensorVotingInt();
		svi.computeSensorValue(0,0,0);
		assertTrue(svi.isValid());
		assertEquals(0, svi.getValue());		
	}
	@Test
	public void test2() {
		SensorVotingInt svi = new SensorVotingInt();
		svi.computeSensorValue(10,10,9);
		assertTrue(svi.isValid());
		assertFalse(svi.valid3);
		assertEquals(10, svi.getValue());		
	}
	@Test
	public void test3() {
		SensorVotingInt svi = new SensorVotingInt();
		svi.computeSensorValue(10,9,8);
		assertFalse(svi.isValid());		
	}
}
