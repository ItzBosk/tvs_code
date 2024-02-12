package ics.anello;

import static org.junit.Assert.*;
import ics.Track;

import org.junit.Test;

//copertura delle istruzioni
//copertura 100%;
public class Copertura_Istruzioni {

	@Test
	public void test() {
		InterlockingControlSystem c = new InterlockingControlSystem();
		assertTrue(c.t1.isBusy());
		assertEquals(c.t1.s, Track.Semaphore.RED);
		assertEquals(c.t4.s, Track.Semaphore.YELLOW);
		boolean avanza;
		// avanza treno 1
		avanza = c.avanzaTR1();
		assertTrue(avanza);
		assertTrue(c.t2.isBusy());	
		assertEquals(c.t2.s, Track.Semaphore.RED);
		assertFalse(c.t1.isBusy());
		assertEquals(c.t1.s, Track.Semaphore.YELLOW);
		assertEquals(c.t4.s, Track.Semaphore.GREEN);
		// avanza ancora lo stesso treno ma non riesce
		avanza = c.avanzaTR1();
		assertFalse(avanza);
		assertTrue(c.t2.isBusy());		
		assertFalse(c.t1.isBusy());
		// semafori non cambiano
		assertEquals(c.t2.s, Track.Semaphore.RED);
		assertEquals(c.t1.s, Track.Semaphore.YELLOW);
	}

}
