/* Tema Esame: traduco in JUNIT lo scenario avalla */

import static org.junit.Assert.*;

import org.junit.Test;

public class SemaforoTest {

	// ROSSO = 0, VERDE = 1, GIALLO = 2

	/*
	 * scenario Avalla:
	 * 
	 * check coloreSem(SEM1) = ROSSO; check coloreSem(SEM2) = ROSSO; set segnale :=
	 * SEM1; step check coloreSem(SEM1) = VERDE; check coloreSem(SEM2) = ROSSO; set
	 * segnale := SEM2; step
	 * 
	 * check coloreSem(SEM1) = VERDE; check coloreSem(SEM2) = ROSSO; set segnale :=
	 * SEM1; step check coloreSem(SEM1) = GIALLO; check coloreSem(SEM2) = ROSSO;
	 * 
	 * set segnale := SEM1; step check coloreSem(SEM1) = ROSSO; check
	 * coloreSem(SEM2) = ROSSO;
	 */

	@Test
	public void scenario1() {
		Semaforo s = new Semaforo();
		// check coloreSem(SEM1) = ROSSO;
		// check coloreSem(SEM2) = ROSSO;
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(0));
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(1));

		// set segnale := SEM1;
		// step
		// check coloreSem(SEM1) = VERDE;
		// check coloreSem(SEM2) = ROSSO;
		s.cambiaColore(0);
		assertEquals(1, s.getColoreSemaforo(0));
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(1));

		// set segnale := SEM2;
		// step
		// check coloreSem(SEM1) = VERDE;
		// check coloreSem(SEM2) = ROSSO;
		s.cambiaColore(1);
		assertEquals(1, s.getColoreSemaforo(0));
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(1));

		// set segnale := SEM1;
		// step
		// check coloreSem(SEM1) = GIALLO;
		// check coloreSem(SEM2) = ROSSO;
		s.cambiaColore(0);
		assertEquals(2, s.getColoreSemaforo(0));
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(1));

		// set segnale := SEM1;
		// step
		// check coloreSem(SEM1) = ROSSO;
		// check coloreSem(SEM2) = ROSSO;
		s.cambiaColore(0);
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(0));
		assertEquals(Semaforo.ROSSO, s.getColoreSemaforo(1));

	}
}
