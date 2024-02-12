package te;

public class te_luglio21 {

	// ORIGINALE
	// Dato il seguente programma in Java, che restituisce il numero
	// pari positivo più grande in un array. Se non esiste restituisce -1
	//@ requires a != null;
	/*@ ensures \result == -1 <==> (\forall int i; 0<=i && 
	                                  i < a.length; a[i] <= 0 || a[i] %2 != 0);
	    ensures \result != -1 ==> (\exists int i; 0 <= i && i < a.length; 
	                              a[i]> 0 && a[i] %2 == 0 && a[i] == \result);	
	    ensures \result != -1 ==> (\forall int i; 0 <= i && i < a.length; 
	                              (a[i]> 0 && a[i] %2 == 0) ==> a[i] <= \result);	
	    diverges true;*/
	int maxp(int[] a) {
		int max = -1;
		/*@ loop_invariant 0 <= i && i <= a.length  && 
		  ( max == -1 <==> (\forall int j; 0<=j && 
		                                j < i; a[j] <= 0 || a[j]%2 != 0)) &&
		 ( max != -1 ==> (\exists int j; 0 <= j && 
		                                j < i; a[j]> 0 && a[j]%2 == 0 && a[j] == max)) &&
		 ( max != -1 ==> (\forall int j; 0 <= j && j < i; 
		                             (a[j]> 0 && a[j] %2 == 0) ==> a[j] <= max));  @*/
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] % 2 == 0 && a[i] > max)
				max = a[i];
		}
		return max;
	}

	// ALTERNATIVA : se supponiamo che esista almeno un elemento pari e maggiore di
	// zero allora possiamo eliminare il controllo per cui result==-1
	// QUANDO passo da JAVA a JMl posso sostituire condizioni del codice java in precondizioni
	//
	//@ requires (\exists int i; 0<=i && i<a.length; a[i]%2==0 && a[i]>0);
	//@ requires a!=null && a.length>0;
	//@ ensures (\exists int i; 0<=i && i<a.length; a[i]%2==0 && a[i]>0 && \result == a[i]);
	//@ ensures (\forall int i; 0<=i && i<a.length; (a[i]%2==0 && a[i]>0) ==> \result >= a[i]);
	//@ diverges true;
	static int maxp_2(int[] a) {
		int max = -1;
		//
//		// loop_invariant a!=null && a.length>0 && 0<=i && i<=a.length && ((\exists int j; 0<=j && j<i; a[j]%2==0 && a[j]>0) ==> 
//	 			( (\exists int j; 0<=j && j<i; a[j]%2==0 && a[j]>0 && max == a[j])
//	 		      && (\forall int j; 0<=j && j<i; (a[j]%2==0 && a[j]>0) ==> max >= a[j]))); */
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0 && a[i] % 2 == 0 && a[i] > max)
				max = a[i];
		}
		return max;
	}
}
