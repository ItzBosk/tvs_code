import static org.junit.Assert.*;

import org.junit.Test;


public class OstelloMCDC {

	@Test
	//provo ad occupare un letto con indice > 4 in una stanza che non esiste
	public void test1() {
		Ostello o = new Ostello();
		assertFalse(o.checkin(10,5));
	}
	
	@Test
	//provo ad occupare un letto con indice < 0 in una stanza che esiste
	public void test2() {
		Ostello o = new Ostello();
		assertFalse(o.checkin(5,-1));
	}
	
	@Test
	//provo ad occupare un letto con indice > 4 in una stanza che esiste
	public void test3() {
		Ostello o = new Ostello();
		assertFalse(o.checkin(5,5));
	}
	
	@Test
	//provo ad occupare un letto in una stanza che non esiste (indice >9)
	public void test4() {
		Ostello o = new Ostello();
		assertFalse(o.checkin(10));
	}
	
	@Test
	//provo a vedere se una stanza che non esiste (indice >9) sia libera
	public void test5() {
		Ostello o = new Ostello();
		assertFalse(o.libera(10));
	}

}
