package rashhour;

import static org.junit.Assert.*;

import org.junit.Test;

public class RushHourTempTestIstruzioni {

	@Test
	public void testScenarioUscita() {
		//
		RushHourTemp rh = new RushHourTemp();
		// posizione non valida
		assertFalse(rh.moveCar(-1, 5, 1));
		// posizione vuota
		assertFalse(rh.moveCar(0, 0, 2));
		// verso l'alto sbagliato
		// sposto auto 3 ma non è libera la posizione
		assertFalse(rh.moveCar(2, 5, 1));
		// DA COMPLETARE
	}

}
