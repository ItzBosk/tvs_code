package counter_esempio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void test() {
		// creo oggetto
		Counter c = new Counter();
		assertNotNull(c);
		// se incremento va a 1
		int res = c.inc();
		assertEquals(1, res);
		assertTrue(res == 1);
		
		if (res!= 1)
			fail("c'è un errore");
		
		//
		assert res == 1: "errore";
		res = c.inc();
		assertEquals(2, res);
		res = c.inc();
		assertEquals(3, res);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivis() {
		int c = 0;
		int h = 90 /c;
	}
	
	
}
