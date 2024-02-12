package mcdc;

import org.junit.Test;

public class MCDCTest {

	@Test
	public void testMCDC() {
		// test x >0
		MCDCSUT.foo(5,3,0);
		MCDCSUT.foo(0,3,0);
		// y == 5
		//MCDCSUT.foo(0,3,0);
		MCDCSUT.foo(0,5,0);
		// z != 7
		//MCDCSUT.foo(0,5,0);
		MCDCSUT.foo(0,5,7);
		
		
	}
}
