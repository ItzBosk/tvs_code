import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import semaforo.Semaforo;


public class DueCicli {

	@Test
	public void testDueCicli() {
		Semaforo sem = new Semaforo();
		// inizilamente rosso
		assertEquals("RR", sem.toString());
		// primo semaforo 0
		// A VERDE
		assertTrue(sem.changecolor(0, 0));
		assertEquals("VR", sem.toString());
		// A GIALLO
		assertTrue(sem.changecolor(0, 1));
		assertEquals("GR", sem.toString());
		// A ROSSO
		assertTrue(sem.changecolor(0, 2));
		assertEquals("RR", sem.toString());
		// semaforo 1
		// A VERDE
		assertTrue(sem.changecolor(1, 0));
		assertEquals("RV", sem.toString());
		// A GIALLO
		assertTrue(sem.changecolor(1, 1));
		assertEquals("RG", sem.toString());
		// A ROSSO
		assertTrue(sem.changecolor(1, 2));
		assertEquals("RR", sem.toString());
	}

}
