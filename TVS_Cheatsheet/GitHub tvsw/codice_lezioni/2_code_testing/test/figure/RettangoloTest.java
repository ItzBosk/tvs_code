package figure;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RettangoloTest {
	
	@BeforeClass
	public static void eseguiprima() {
		System.out.println("APRO CONNESSIONE");
	}

	@AfterClass
	public static void eseguiallafine() {
		System.out.println("CHIUDO CONNESSIONE");
	}


	Rettangolo r;
	
	@Before
	public void init() { r = new Rettangolo(0, 0);}
	
	
	@Test
	public void testGetBase() {
		// se costruisco un rettangolo con base 5
		// il metodo getBase mi restitusice 5
		// costruisco il rettangolo
		Rettangolo r = new Rettangolo(5, 10);
		// controllo che abbia base quella passata
		//assertTrue(r.getBase() == 5);
		assertEquals("attenzione getbase non funziona", 5, r.getBase() );
	}

	@Test
	public void testName(){
		Rettangolo r = new Rettangolo(5, 10);
		
		assertNotNull(r);
		
		assertEquals(50.0, r.getArea(),0.00001);	
		
	}
	@Test
	public void testAssert(){
		try {
			Rettangolo r = new Rettangolo(5, 10);
			fail("mi aspetto l'eccezione");
		} catch (Exception e) {
		}
	}
	
	// se la base è negativa mi aspetto un'eccezione
	@Test(expected = InvalidParameterException.class)
	public void testBaseNegativa(){
		new Rettangolo(-5, 10);
	}
	
	
	
}
