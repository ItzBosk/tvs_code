/**
 * 
 */
package parametrictest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author garganti
 *
 */
@RunWith(Parameterized.class)
public class IncTempTest {

	private int input;
	private int output;

	public IncTempTest(int i, int o){
		input = i;
		output = o;
	}
	// parametri
	@Parameters
	public static Collection<Object[]> creaParametri() {
		return Arrays.asList(new Object[][] { 
				{ 0, 1 }, 
				{ 2, 3 }, 
				{ 5, 6 }});
	}

	/**
	 * Test method for {@link parametrictest.IncTemp#inct(int)}.
	 */
	@Test
	public void testInct() {
		int r = IncTemp.inct(input);
		assertEquals(output, r);
	}

}
