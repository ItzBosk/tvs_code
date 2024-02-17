package gioco_JUNIT;

import static org.junit.Assert.*;
import org.junit.Test;

public class GiocoTest {

	@Test
	public void c_istruzioni(){
		// copertura costruttore
		Gioco g = new Gioco(3);
		assertNotNull(g);
		assertEquals(g.Gioca, true);
		assertNotEquals(g.creditoGiocatori, null);
		
		// copertura gioca()
		for (int i = 0; i < 10; i++) {
			g.gioca();
		}
		
		// copertura updateConto()
		g.updateConto(0, 1);
		g.updateConto(1, 2);
		g.updateConto(2, 3);
		
		// metodi extra
		g.printStatoGioco();
	}

	@Test
	public void c_branch(){
		// Copro decisione negativa del costruttore
		Gioco g = new Gioco(0);
		assertEquals(g.Gioca, false);
		
		// Copro metodo gioca
		Gioco g2 = new Gioco(2);
		
		g2.gioca();
		assertEquals(g2.numGiocata, 1);
		
		g2.Gioca = false;
		assertEquals(g2.Gioca, false);
		
		// Copro metodo updateConto
		Gioco g3 = new Gioco(3);
		assertNotNull(g3);
		assertEquals(g3.updateConto(4, 2), false);	// giocatore > numGiocatori
		assertEquals(g3.updateConto(0, 7), false);	// dado > 3
		assertEquals(g3.updateConto(0, -4), false);	//  dado < 1
	}

	@Test
	public void C_MCDC(){
		
		Gioco g = new Gioco(3);
		
		// if((giocatore > numGiocatori) || dado < 1 || dado > 3)
		
		// FFF -> F
		assertEquals(g.updateConto(0, 1), true);	// no 2 perché patta
		
		// FTF -> T
//		assertEquals(g.updateConto(0, 0), true);	// 0 < 1 ma non > 3
		
		// TFF -> T
//		assertEquals(g.updateConto(5, 1), true);	// ma scusa mi aspetto false
		
		// FFT -> T
//		assertEquals(g.updateConto(0, 5), true);	// mi aspetto false
	}
	
	@Test
	public void C_AVALLA() {
		Gioco g = new Gioco(4);
		
		assertEquals(g.Gioca, true);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 3);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 3);
		assertEquals(g.numGiocata, 0);
		
		assertEquals(g.Gioca, true);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 2);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 4);
		assertEquals(g.numGiocata, 1);
		
		assertEquals(g.Gioca, true);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 2);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 4);
		assertEquals(g.numGiocata, 2);
		
		assertEquals(g.Gioca, true);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 2);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 4);
		assertEquals(g.numGiocata, 3);
		
		assertEquals(g.Gioca, true);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 1);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 5);
		assertEquals(g.numGiocata, 4);
		
		assertEquals(g.Gioca, true);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 0);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 6);
		assertEquals(g.numGiocata, 5);
		
		assertEquals(g.Gioca, false);
		assertEquals(g.creditoGiocatori[2], 3);
		assertEquals(g.creditoGiocatori[0], 0);
		assertEquals(g.creditoGiocatori[1], 3);
		assertEquals(g.creditoGiocatori[3], 6);
		assertEquals(g.numGiocata, 6);
	}
}
