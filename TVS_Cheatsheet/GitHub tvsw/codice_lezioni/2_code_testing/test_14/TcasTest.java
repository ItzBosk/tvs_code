import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TcasTest {

	String[] input;

	public TcasTest(String input) {
		this.input = input.split(",");
	}

	// parametri
	@Parameters
	public static Collection creaParametri() {
		return Arrays.asList(new Object[][] {{ 
			"0,1,2,3,4,5,6,7,8,9,10,11,12" }});
	}

	@Test
	public void testMain() {
		Tcas.main(input);
	}

}
