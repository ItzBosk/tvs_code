import static org.junit.Assert.*;
import org.junit.*;

public class Counter19Test {

	Counter19 c;
	@Before
	public void setup(){
		c = new Counter19();
	}
	@Test
	public void testCounter19() {
		assertEquals(1, c.inc());
		assertNotNull(c);
		assertTrue(2 == c.inc());
		assertSame(c,c);
	}

	@Test
	public void testInc() {
		assertEquals(1, c.inc());
		assertEquals(2, c.inc());
		assertEquals(3, c.inc());
	}

	@Test
	public void testDec() {
		c.inc();
		c.inc();
		c.inc();
		assertEquals(2, c.dec());
		assertEquals(1, c.dec());
		assertEquals(0, c.dec());
	}

}
