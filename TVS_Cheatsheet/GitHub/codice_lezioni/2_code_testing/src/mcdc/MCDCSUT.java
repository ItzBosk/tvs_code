package mcdc;

// codice che voglio coprire con MCDC
public class MCDCSUT {

	static void foo(int x, int y, int z) {

		if (x > 0 || (y == 5 && z != 7)) {
			System.out.println("errore"); 
		}

	}

}
