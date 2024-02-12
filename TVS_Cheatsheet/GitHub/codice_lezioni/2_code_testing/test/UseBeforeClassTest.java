import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UseBeforeClassTest {

	// NO da eviatare UseBeforeClass uc = new UseBeforeClass();

	UseBeforeClass uc;

	@Before
	public void setup() {
		uc = new UseBeforeClass();
	}

	@Test
	public void testUseBeforeClass() {
	}

}
