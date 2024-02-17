import static org.junit.Assert.*;

import org.junit.Test;


public class OstelloStatement {

	@Test
	//provo a fare il checkin di una stanza che non esiste
	public void test1() {
		Ostello o = new Ostello();
		assertFalse(o.checkin(-1,3));
	}
	
	@Test
	//provo a fare il checkin di una stanza che non esiste
	public void test2() {
		Ostello o = new Ostello();
		assertFalse(o.checkin(-1));
	}
	
	@Test
	//provo ad occupare un letto in una stanza libera
	public void test3() {
		Ostello o = new Ostello();
		assertTrue(o.checkin(7));
	}
	
	@Test
	//verifico stanza che non esiste libera 
	public void test4() {
		Ostello o = new Ostello();
		assertFalse(o.libera(-1));
	}
	
	@Test
	//verifico che una stanza sia libera
	public void test5() {
		Ostello o = new Ostello();
		assertTrue(o.libera(3));
	}
	
	@Test
	//verifico che una stanza sia libera ma in realtà non lo è
	public void test6() {
		Ostello o = new Ostello();
		assertTrue(o.checkin(0));
		assertFalse(o.libera(0));
	}

}
