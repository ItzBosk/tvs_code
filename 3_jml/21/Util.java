
public class Util {

	//@ ensures \result <==> x < y;
	boolean minore(int x, int y) {
		return x < y;
	}
	
	
	//@ requires a != null && a.length >= 1;
	// il valore restituito è più piccolo dei numeri nell'array
	//@ ensures (\forall int i; 0<= i && i < a.length; \result <= a[i]);
	// il valore restituito è nell'array
	//@ ensures (\exists int i; 0<= i && i < a.length; \result == a[i]);	
	int minimo(int a[]) {
		return Integer.MIN_VALUE;
	}
	
}
