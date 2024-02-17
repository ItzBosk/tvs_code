package mutation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testPower() throws Exception {
		Example ex = new Example();
		assertEquals(4,ex.power(2,2));
	}

	@Test(expected = Exception.class)
	public void testPower00() throws Exception {
		Example ex = new Example();
		ex.power(0,0);
	}

	@Test(expected = Exception.class)
	public void testPowerNM0() throws Exception {
		Example ex = new Example();
		ex.power(5,-1);
	}
	
	@Test
	public void testPowerN_M0() throws Exception {
		Example ex = new Example();
		assertEquals(1,ex.power(5,0));
	}

	
	
}
