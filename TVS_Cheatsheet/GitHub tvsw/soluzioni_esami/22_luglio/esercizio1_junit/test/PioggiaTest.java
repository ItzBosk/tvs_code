import static org.junit.Assert.*;

import org.junit.Test;

public class PioggiaTest {

	// copertura delle istruzioni
	@Test
	public void testHasRainedGT_EM_stmt_cov() {
		Pioggia p = new Pioggia();
		// primo caso, copro return false:
		// tutti i valori di piaggia sono 0
		// basta prendere un valore tra 0 e 1000,
		assertFalse(p.hasRainedGT_EM(100));
		// secondo caso, copro return true
		// basta prendere un valore < 0
		assertTrue(p.hasRainedGT_EM(-1));
	}
	// copertura dei branch
	@Test
	public void testHasRainedGT_EM_branch_cov() {
		// già coperto tutti i branch
	}
	// copertura MCDC
	//  (valore < 0 || valore > 1000 || (mese % 2 == 0 && pioggia[mese] > valore))
	//t1       T            (F)                         (F)
	//t2       F             F                           F 
	//t3       F             T                          (F) 
	//t4       F             F                           F
	// testo mese%2 == 0
	//t5       F             F                   T               T 
	//t6       F             F                   F              (T)
	// testo pioggia[mese] > valore
	//t7       F             F                   T               T 
	//t8       F             F                   T               F
	@Test
	public void testHasRainedGT_EM_MCDC() {
		Pioggia p = new Pioggia();
		// t1 valore < 0: prendo -1
		assertTrue(p.hasRainedGT_EM(-1));
		// t2 valore >= 0 (ma non > 1000 e non pioggia[mese] > valore per ogni mese
		// ipotesi:
		// valore = 2000 -> non va bene perchè avrei valore > 1000 true
		// valore = 10 --> va bene, è <= 1000 e non c'è pioggia[mese]> 10
		assertFalse(p.hasRainedGT_EM(10));
		// t3: valore > 1000
		assertTrue(p.hasRainedGT_EM(1100));
		// t4: testato già da t2
		// t5: valore tra 1 e 999 compresi 
		//             e almeno un mese pari e piogga[mese] > valore
		// devo cambiare pioggia[valore]
		// esempio: mese = 2 e pioggia[valore] = 100, valore = 10
		p.pioggia[2] = 100;
		assertTrue(p.hasRainedGT_EM(10));
		// t6: mese dispari, viene coperto con mese = 1 - ciclo precedente
		// esempio mese 1 e 
		// t7: già testato con t5
		// t8: valore tra 1 e 999 compresi 
		//             e almeno un mese pari e piogga[mese] <= valore
		// esempio: mese = 2 pioggia[valore] = 100, valore = 200
		assertFalse(p.hasRainedGT_EM(200));
	}

}
