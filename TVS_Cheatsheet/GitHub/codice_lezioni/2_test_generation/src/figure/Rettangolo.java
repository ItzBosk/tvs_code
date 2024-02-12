package figure;

public class Rettangolo {

	private int base;

	public Rettangolo(int b, int a) {
		// b deve essere > 0;
		// assert b > 0 : " la base non può essere neg.";
		base = b;

		if (b <= 0)
			System.out.println("ATTENZIONE ERRORE DI BASE");

		if (a <= 0 && b < 10) {

			System.out.println("ATTENZIONE ERRORE DI ALTEZZA");

		}
	}

	int getBase() {
		// self-check
		assert base >= 0 : "la base non può essere <0";
		return base;
	}

	int getAltezza() {
		return 0;
	}

	public double getArea() {
		return 0;
	}

	public int getPerimetro() {
		return 0;
	}

}