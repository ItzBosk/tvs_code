package tempJML;

public class Util {

	// restituisce il minimo tra a e b
	//@ requires true;
	//@ ensures a < b ==> \result == a;
	//@ ensures a >=b ==> \result == b;
	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	// mi dice se x è pari
	//@ ensures x%2 == 0 <==> \result;
	public static boolean pari(int x){
		return true; //x%2 == 0; 
	}
	
	
	public static void main(String[] args) {
		System.out.println(min(3,4));
		System.out.println(min(4,3));
		System.out.println(pari(2));
		System.out.println(pari(3));
	}

}
