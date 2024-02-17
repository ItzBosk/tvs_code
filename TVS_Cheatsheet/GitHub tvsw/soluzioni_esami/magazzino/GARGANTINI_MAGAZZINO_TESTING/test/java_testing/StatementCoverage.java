package java_testing;

import static org.junit.Assert.*;

import org.junit.Test;

/** copro le istruzioni non coperte da FullTest*/
public class StatementCoverage {

	@Test
	public void test() {
		Magazzino m = new Magazzino();
		assertFalse(m.insert(-1, 10));
		assertTrue(m.isFull(-1));
	}

}
