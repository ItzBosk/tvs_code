package semaforo_JUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

public class SemaforiTest {

	@Test
	public void c_istruzioni() {
		// copertura costruttore
		Semafori s = new Semafori();
		assertEquals(s.coloreSemaforo[0], 0);
		assertNotEquals(s.coloreSemaforo[1], 2);
//
//		// copertura metodi
		s.giallo(0);
		assertEquals(s.coloreSemaforo[0], 2);
		
		s.verde(0);
		assertEquals(s.coloreSemaforo[0], 1);
		
		s.rosso(0);
		assertEquals(s.coloreSemaforo[0], 0);
	}

	@Test
	public void c_branch() {
		// Copro metodo gioca
		Semafori s = new Semafori();

		s.comando(5);
		assertEquals(s.coloreSemaforo[0], 0);
		assertNotEquals(s.coloreSemaforo[1], 1);
		assertNotEquals(s.coloreSemaforo[1], 2);
		
		// per coprire il resto si potrebbe copiare lo scenario avalla invertendo 0 e 1
		
	}

	@Test
	public void C_MCDC() {
		Semafori s = new Semafori();

		// if (s != 0 && s != 1)

		// FF -> F
		s.comando(5);
		assertEquals(s.coloreSemaforo[0], 0);
		
		// TF -> F
		s.comando(1);
		assertEquals(s.coloreSemaforo[1], 1);
		
		// TF -> F
		s.comando(0);
		assertEquals(s.coloreSemaforo[0], 0);
	}		

	@Test
	public void C_AVALLA() {
		Semafori s = new Semafori();
		
		assertEquals(s.coloreSemaforo[0], 0);
		assertEquals(s.coloreSemaforo[1], 0);
		s.comando(0);

		assertEquals(s.coloreSemaforo[0], 1);
		assertEquals(s.coloreSemaforo[1], 0);
		s.comando(1);
		
		assertEquals(s.coloreSemaforo[0], 2);
		assertEquals(s.coloreSemaforo[1], 0);
		s.comando(1);
		
		assertEquals(s.coloreSemaforo[0], 0);
		assertEquals(s.coloreSemaforo[1], 0);
		s.comando(1);
		
		assertEquals(s.coloreSemaforo[0], 0);
		assertEquals(s.coloreSemaforo[1], 1);
		s.comando(0);
		
		assertEquals(s.coloreSemaforo[0], 0);
		assertEquals(s.coloreSemaforo[1], 2);
		s.comando(0);
		
		assertEquals(s.coloreSemaforo[0], 0);
		assertEquals(s.coloreSemaforo[1], 0);

	}
}














