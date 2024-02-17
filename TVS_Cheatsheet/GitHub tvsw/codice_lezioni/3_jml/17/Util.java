public class Util {

	// restituisce il massimo tra due numeri
	//@ requires true;
	//@ ensures \result >= a && \result >= b;
	// serve anche questo 
	//@ ensures \result == a || \result == b;
	// oppure
	//@ ensures a >= b ==> \result == a;
	//@ ensures a < b ==> \result == b;
	// oppure
	//@ ensures a >= b <==> \result == a;	
	static int max(int a, int b) {
		return a > b ? a : b; // corretto
		//return a > b ? a : a;
		//return a; // mi accorgo con contratto
		//return Integer.MAX_VALUE; // mi accorgo con ||
	}

	// dice se un numero è pari
	//@ requires true;
	//@ ensures x%2 == 0 ==> \result; 
	// per essere completo
	//@ ensures x%2!= 0 ==> ! \result;
	static boolean isPari(int x) {
		return x % 2 == 0;
		//return x % 3 == 0; // riesco a catturarlo
		//return true; // solo con contratto completo
	}

	public static void main(String[] args) {
		//System.out.println("4 = " +max(3,4));
		//System.out.println("10 = " +max(-3,10));
		//
		System.out.println(isPari(10) + " = true");
		System.out.println(isPari(1) + " = false");
		
	}
	
}

