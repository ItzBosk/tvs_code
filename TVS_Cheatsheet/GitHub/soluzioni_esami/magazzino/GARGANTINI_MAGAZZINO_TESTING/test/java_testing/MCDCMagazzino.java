package java_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MCDCMagazzino {

	@Test
	public void test() {
		Magazzino m = new Magazzino();
		// test 1
		assertFalse(m.insert(-1, 1));
		// test 2
		assertTrue(m.insert(0, 1));
		// test 3
		assertFalse(m.insert(5, 1));
		// test 4
		assertFalse(m.insert(0, 0));
		// test 5
		assertFalse(m.insert(0, 11));
		// test 6		
		// serve per riempiere il prodotto 2
		for(int i = 0; i <10; i++){
			assertTrue(m.insert(2, 10));
		}
		assertFalse(m.insert(2, 5));
		
	}

}
