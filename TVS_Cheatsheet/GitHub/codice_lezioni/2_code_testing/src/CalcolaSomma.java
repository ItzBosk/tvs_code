
public class CalcolaSomma {

	static int calcolodellaSomma(int x, int y) {
		int somma = x + y;
		// self check come double
		assert ((double)somma) == ((double)x) + y;
		return somma;
	}
	
	
	public static void main(String[] args) {
		System.out.println(calcolodellaSomma(5, 6));
		System.out.println(calcolodellaSomma(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}
}
