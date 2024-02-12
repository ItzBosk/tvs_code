import static org.junit.Assert.*;

import org.junit.Test;


public class SommaTest {

	@Test
	public void testSomma() {
		int result = Somma.somma(5, 0);
		assertEquals(5,result);
	}

}
