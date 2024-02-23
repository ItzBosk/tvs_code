package ctwedge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTestCTWedge {

	@Test
	public void testCTWedge() {
		
		// Array di casi di test basati sui dati forniti
		int[][] testCases = {
				// medicine, time, indice animale, stato atteso dopo malato
				{ 1, 0, 1, 1 }, { 1, 1, 2, 1 }, { 1, 2, 0, 1 }, { 1, 3, 1, 1 }, { 2, 0, 2, 1 }, { 2, 1, 0, 1 },
				{ 2, 2, 1, 1 }, { 2, 3, 2, 1 }, { 3, 0, 0, 1 }, { 3, 1, 1, 1 }, { 3, 2, 2, 1 }, { 3, 3, 0, 1 }, };
		
		for (int[] testCase : testCases) {
			Zoo zoo = new Zoo();
			zoo.medicine = testCase[0];
			zoo.time = testCase[1];
			zoo.malato(testCase[2]);
			assertEquals("Dopo essere settato su malato, l'animale dovrebbe essere malato", 1,
					zoo.statoAnimale[testCase[2]]);
		}
	}
}
