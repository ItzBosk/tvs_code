package ics.anello;

import static org.junit.Assert.*;

import org.junit.Test;

//copertura delle condizioni e dei branch
//copertura
public class CoperturaDecisioni {

	@Test
	public void test() {
		InterlockingControlSystem c = new InterlockingControlSystem();
		boolean rx;
		//tr1 in t2
		rx = c.tr1.avanza();
		assertTrue(rx);
		//tr1 in t3 ma non può entrare perchè occupato da tr2
		rx = c.tr1.avanza();
		assertFalse(rx);
		//tr2 in t4
		rx = c.tr2.avanza();
		assertTrue(rx);
	}
	
}
