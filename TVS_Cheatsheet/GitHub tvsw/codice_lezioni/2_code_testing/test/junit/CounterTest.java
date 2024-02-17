package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {

	@Test
	public void testInc() {
		Counter c = new Counter();
		int r = c.inc();
		assertEquals(1, r);
	}

	@Test
	public void testDec() {
		Counter c = new Counter();
		c.inc();
		int v = c.dec();
		assertEquals(0, v);
	}
	@Test
	public void testDec2() {
		Counter c = new Counter();
		c.inc();
		c.inc();
		c.inc();
		int v = c.dec();
		assertEquals(2, v);
		assertTrue(v == 2);
		assertTrue(v > 0);
	}
	@Test(expected=RuntimeException.class)
	public void testDecExc() {
		Counter c = new Counter();
		int v = c.dec();
	}
	
	
}
