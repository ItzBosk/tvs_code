
import static org.junit.Assert.*;

import org.junit.Test;

import p.PariODispari;


public class MCDCTest {

	@Test
	public void testMCDC() {
		PariODispari pd = new PariODispari();
		// TUTTI FALSI
		assertTrue(pd.tira(1, 2));
		// vero utente < 1
		assertFalse(pd.tira(0, 2));
		// vero utenet> 5
		assertFalse(pd.tira(10, 2));
		//
		assertFalse(pd.tira(1, 0));
		assertFalse(pd.tira(1, 7));
		// devo testare con finito true
		assertTrue(pd.tira(1, 2));
		assertTrue(pd.tira(1, 2));
		assertTrue(pd.tira(1, 2));
		assertTrue(pd.tira(1, 2));
		assertTrue(pd.finito());
		assertFalse(pd.tira(1, 2));
		
		
	}

}
