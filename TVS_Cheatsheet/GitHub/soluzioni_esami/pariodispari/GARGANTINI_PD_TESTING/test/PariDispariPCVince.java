import static org.junit.Assert.*;

import org.junit.Test;

import p.PariODispari;


public class PariDispariPCVince {

	@Test
	public void testPCVince() {
		PariODispari pd = new PariODispari();
		// faccio vincere il PC per 5 volte
		// tiro dispari
		assertTrue(pd.tira(1, 2));
		check(pd, 4,6,false);
		assertTrue(pd.tira(1, 2));
		check(pd, 3,7,false);
		assertTrue(pd.tira(1, 2));
		check(pd, 2,8,false);
		assertTrue(pd.tira(1, 2));
		check(pd, 1,9,false);
		assertTrue(pd.tira(1, 2));
		check(pd, 0,10,true);
	}

	private void check(PariODispari pd, int i, int j, boolean b) {
		assertEquals(i, pd.b_utente);
		assertEquals(j, pd.b_pc);
		assertEquals(b,pd.finito());
		
	}

}
