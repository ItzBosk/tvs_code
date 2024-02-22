package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	@Test
	public void c_istruzioni(){
		Zoo z = new Zoo();
		
		// Copertura costruttore
        assertEquals("Dovrebbe esserci il massimo delle medicine", 
        		Zoo.MAX_MEDICINE, z.medicine);
        assertEquals("Il tempo dovrebbe essere impostato a 3", 3, z.time);
        for (int stato : z.statoAnimale) {
            assertEquals("Ogni animale dovrebbe iniziare sano", 0, stato);
        }
        
        // Copertura manageAnimali
        z.manageAnimali(); // animali gestiti correttamente senza cambiamenti
        assertEquals("Dopo manageAnimali senza malati, le medicine restano invariate", 
        		Zoo.MAX_MEDICINE, z.medicine);
        
        // Test rifornimento medicine
        z.medicine = 1;
        z.manageAnimali();
        assertEquals("Le medicine dovrebbero essere rifornite a MAX_MEDICINE", 
        		Zoo.MAX_MEDICINE, z.medicine);
	}

	@Test
	public void c_branch(){
		Zoo z = new Zoo();
		
		// Copro branch di manageAnimali con animali malati
        z.malato(0); // Rendo malata la zebra
        z.manageAnimali();
        assertEquals("La zebra malata dovrebbe essere curata", 0, z.statoAnimale[0]);
		
        // Copro branch di manageAnimali senza animali malati ma con variazioni di time
        z.time = 0;
        z.manageAnimali(); // continuo il ciclo per vedere l'effetto su animali non malati
        assertTrue("Il leone dovrebbe diventare affamato", z.statoAnimale[1] == 2);
        
        // Test malato
        z.medicine = Zoo.MAX_MEDICINE;
        z.malato(1); // Rendo malato il leone
        assertEquals("Il leone dovrebbe essere malato", 1, z.statoAnimale[1]);
        assertEquals("Le medicine dovrebbero diminuire", Zoo.MAX_MEDICINE - 1, z.medicine);
        
        // Test manageAnimali per varie fasi di time
        Zoo z1 = new Zoo();
        for (int i = 0; i < 5; i++) {
            z1.manageAnimali();
        }
        assertEquals("Dopo un ciclo completo, il tempo ritorna a 0", 0, z1.time);
        assertEquals("La zebra dovrebbe essere affamata dopo un ciclo completo", 
        		2, z1.statoAnimale[0]);
        
	}

	@Test
	public void c_MCDC(){
		Zoo z = new Zoo();
		
		// transizione di stato con time = 0, nessun animale malato
        z.time = 0;
        z.manageAnimali();
        assertTrue("Il leone dovrebbe diventare affamato", z.statoAnimale[1] == 2);

        // transizione di stato con time = 1, nessun animale malato
        z.time = 1;
        z.manageAnimali();
        assertTrue("L'elefante dovrebbe diventare affamato", z.statoAnimale[2] == 2);

        // transizione di stato con time = 2, nessun animale malato
        z.time = 2;
        z.manageAnimali();
        assertTrue("Dopo il terzo giorno, tutti gli animali dovrebbero essere stati sfamati", 
        		z.statoAnimale[0] == 0 && z.statoAnimale[1] == 0 && z.statoAnimale[2] == 0);

        // transizione di stato con time = 3, nessun animale malato
        z.time = 3;
        z.manageAnimali();
        assertTrue("La zebra dovrebbe diventare affamata", z.statoAnimale[0] == 2);

        // decremento medicine se animale malato
        int initialMedicine = z.medicine;
        z.malato(0);
        assertTrue("Le medicine dovrebbero essere decrementate di 1", 
        		z.medicine == initialMedicine - 1);

        // rifornimento medicine quando scendono a 1
        z.medicine = 1;
        z.manageAnimali();
        assertTrue("Le medicine dovrebbero essere rifornite a MAX_MEDICINE", 
        		z.medicine == Zoo.MAX_MEDICINE);
        
	}
}
