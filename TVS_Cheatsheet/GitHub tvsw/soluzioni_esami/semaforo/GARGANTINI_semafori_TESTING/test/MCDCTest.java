import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import semaforo.Semaforo;


public class MCDCTest {


	@Test
	public void testDec1() {
		Semaforo sem = new Semaforo();
		// condizione sem < 0
		// VERA
		assertFalse(sem.changecolor(-1, 0));
		// FALSA
		assertTrue(sem.changecolor(0, 0));
		// condizione sem > 1
		assertFalse(sem.changecolor(2, 0));
		// condizione col < 0
		assertFalse(sem.changecolor(0, -1));
		// condizione col > 2
		assertFalse(sem.changecolor(0, 3));
	}
	@Test
	public void testDec2() {
		Semaforo sem = new Semaforo();
		// TF
		assertFalse(sem.changecolor(0, 2));
		// FT		
		assertTrue(sem.changecolor(0, 0));
		assertTrue(sem.changecolor(0, 1));
		assertEquals("GR", sem.toString());
		assertFalse(sem.changecolor(0, 0));
		assertEquals("GR", sem.toString());
		// TT
		assertTrue(sem.changecolor(0, 2));
		assertEquals("RR", sem.toString());
	}
	@Test
	public void testDec3() {
		// manca solo il caso in cui color == 1 
		// e luce[sem]!=0
		Semaforo sem = new Semaforo();
		sem.changecolor(0, 1);
	}
	
	@Test
	public void testDec4() {
		// manca solo il caso in cui color == 1 
		// e luce[sem]!=0
		Semaforo sem = new Semaforo();
		sem.changecolor(0, 0);
		assertEquals("VR", sem.toString());
		assertFalse(sem.changecolor(1, 0));
		
	}

}
