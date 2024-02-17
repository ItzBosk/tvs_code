import static org.junit.Assert.*;

import org.junit.Test;

import semaforo.Semaforo;


public class StatementCoverage {
	
	@Test
	public void test() throws Exception {
		// completo la coverage statement
		// 1. valori input non validi
		Semaforo sem = new Semaforo();
		assertFalse(sem.changecolor(5, 0));
		assertEquals("RR", sem.toString());
		// 2. valori validi ma non posso camboiare colore
		assertTrue(sem.changecolor(0, 0));
		assertEquals("VR", sem.toString());
		assertFalse(sem.changecolor(0, 2));
		assertEquals("VR", sem.toString());		
	}

}
