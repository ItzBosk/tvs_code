package TE;

public class te2 {
	
	// numero pari positivo più grande in un array, altrimenti return -1
	int maxp(int[] a) {
		int max = -1;
		if (!(a == null || a.length == 0)) {
			for (int x : a) {
				if (x > 0 && x % 2 == 0 && x > max)
					max = x;
			}
		}
		return max;
	}
	
	// si può semplificare il codice inserendo delle precondizinoi
	//@ requires a != null;
	// modificare i for each per poter poi usare gli invarianti
	//@ ensures \result == -1 <==> 	(\forall int i; 0 <= i && i < a.length;
	//@								a[i] <= 0 || a[i] % 2 != 0);
	//@ ensures \result != -1 ==> 	(\exists int i; 0 <= i && i < a.length;
	//@								a[i] > 0 && a[i] % 2 == 0 && a[i] == \result);
	//@ ensures \result != -1 ==> 	(\forall int i; 0 <= i && i < a.length;
	//@								(a[i] > 0 && a[i] % 2 == 0) ==> a[i] <= \result);
	//@ diverges true;
	int maxpModified(int[] a) {
		int max = -1;
		//@ loop_invariant
		//@ (max == -1 <==> (\forall int j; 0 <= j && 
		//@									j < i; a[j] <= 0 || a[j] % 2 != 0)) &&
		//@ (max != -1 ==> (\exists int j; 0 <= j && 
		//@									j < i; a[j] > 0 && a[j] % 2 == 0 && a[j] == max)) &&
		//@ (max != -1 ==> (\forall int j; 0 <= j && j < i;
		//@								(a[j] > 0 && a[j] % 2 == 0) ==> a[j] <= max)) &&
		//@ 0 <= i && i <= a.length;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] % 2 == 0 && a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	
}
