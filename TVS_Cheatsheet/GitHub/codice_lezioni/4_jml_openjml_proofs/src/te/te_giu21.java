package te;

public class te_giu21 {
	
	// controlla se un array contiene un numero pari maggiore di b;
	//@ requires a!=null;
	//@ ensures \result <==> (\exists int i; 0 <=i &&  i < a.length; a[i] > b && a[i] % 2 == 0); 
	//@ diverges true;
	static boolean check(int[] a, int b) {
		boolean res = false;
		if (a.length == 0)
			return false;
		int i = 0;
		//@ loop_invariant i <= a.length && (res <==> (\exists int j; 0 <=j && j < i ; a[j] > b && a[j] % 2 == 0));
		while (i < a.length) {
			if (!res && a[i] > b && a[i] % 2 == 0)
				res = true;
			i++;
		}
		return res;
	}
	// con il ciclo for
	//@ requires a!=null;
	//@ ensures \result <==> (\exists int i; 0 <=i &&  i < a.length; a[i] > b && a[i] % 2 == 0); 
	//@ diverges true;
	static boolean check_for(int[] a, int b) {
		boolean result = false;
		// attenzione alle prentesi. deve essere
		// x &&  (Y <==> Z) perchè && ha precedenza rispetto a <==>
		//@ loop_invariant a!=null && 0 <= i && i <= a.length && (result <==> (\exists int j; 0 <=j && j < i ; a[j] > b && a[j] % 2 == 0));
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b && a[i] % 2 == 0)
				result = result || true;
		}
		return result;
	}

	
}
