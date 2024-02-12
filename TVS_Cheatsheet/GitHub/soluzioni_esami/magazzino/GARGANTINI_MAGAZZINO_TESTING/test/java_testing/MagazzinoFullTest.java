package java_testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagazzinoFullTest {

	@Test
	public void testfull() {
		// riempio il magazzino del tutto
		Magazzino m = new Magazzino();
		//
		for(int i = 0; i < 5; i++){
			// riempio per l'i-esmio prodotto
			for(int j = 0 ; j < 10; j++){
				assertTrue(m.insert(i, 10));
			}
		}
		// controllo magazzino pieno
		for(int i = 0; i < 5; i++){
			assertTrue(m.isFull(i));
		}
		assertTrue(m.isFull());		
	}

}
