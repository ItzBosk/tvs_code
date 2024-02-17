import static org.junit.Assert.*;

import org.junit.Test;


public class OstelloTest {

	@Test
	public void testLettoLibEOccupo() {
		Ostello o = new Ostello();
		assertTrue(o.checkin(0,3));
	}
	
	@Test
	public void testLettoOccEOccupo() {
		Ostello o = new Ostello();
		assertTrue(o.checkin(0,3));
		assertFalse(o.checkin(0,3));
	}
	
	@Test
	public void testStanzaOccEOccupo() {
		Ostello o = new Ostello();
		assertTrue(o.checkin(0,0));
		assertTrue(o.checkin(0,1));
		assertTrue(o.checkin(0,2));
		assertTrue(o.checkin(0,3));
		assertTrue(o.checkin(0,4));
		assertFalse(o.checkin(0));	
	}
	

}
