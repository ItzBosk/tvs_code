package counter_esempio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void test() {
		
		// test metodi
		// 1) creo oggetto
		Counter c = new Counter();
		
		// test costruttore
		assertNotNull(c);
		
		// test inc()
		int result = c.inc();
		assertEquals(1, result);	// mi aspetto result = 1, usa .equals()
		assertSame(1, result); 		// usa ==
//		assertEquals("Errore", 1, result);	// versione con msg se fallisce
		assertTrue(result == 1);	// stessa cosa ma meglio assertEquals
		if (result != 1) {
			fail("errore");		// msg per quando il test fallisce
		}
		
		// test per codecover
		result = c.inc();
		assertEquals(2, result);
		result = c.inc();
		assertEquals(3, result);
		
	}

}
