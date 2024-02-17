package counter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TestCounter {

	@Mock
	Counter counter;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testInc_withMockito() {
		// when calling the inc method return 0
		when(counter.inc()).thenReturn(0);
		// when
		int res = counter.inc();
		// controlla il risultato
		assertEquals(0, res);
		//
		verify(counter, times(1)).inc();
	}

}
