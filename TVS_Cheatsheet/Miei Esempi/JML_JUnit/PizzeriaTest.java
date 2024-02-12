package pkgpizzeria;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzeriaTest {

	@Test
	public void test() {
		Pizzeria p = new Pizzeria();
		assertTrue(p.consumaPizza() >= 0);
		String[] arrpizz = new String[] {"","",""};
		p.arrayPizza(arrpizz);
		assertEquals(arrpizz[0],"pizza");
		assertEquals(arrpizz[1],"pizze");
	}

}
