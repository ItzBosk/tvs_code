import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CounterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		// il contatore è creato con valore 0
		Counter c = new Counter();
		int v = c.val;
		assertEquals(0, v);
	}
	
	@Test(expected=RuntimeException.class)
	public void testDecZero() {
		Counter c = new Counter();
		c.dec();
	}
	

}
