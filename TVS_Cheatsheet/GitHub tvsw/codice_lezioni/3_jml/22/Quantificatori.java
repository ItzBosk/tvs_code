import java.util.Arrays;


public class Quantificatori {

	// metodo che mette tutti gli elementi di a a 0;
	// alla fine tutti gli elementi saranno 0
	//@ ensures (\forall int i; 0 <= i && i < a.length; a[i] ==0);
	static void setToZero(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = 0;
	}

	// il minimo in un array
	//@ requires a!= null && a.length > 0;
	// il valore restituito è più piccolo di tutti gli elementi
	//@ ensures (\forall int i; 0 <= i && i < a.length; \result <= a[i]);
	//@ ensures (\exists int i; 0 <= i && i < a.length; \result == a[i]);
	static int min(int[] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if (min > a[i]) min = a[i];
 		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		setToZero(a);
		System.out.println(Arrays.toString(a));
		//
		System.out.println(min(new int[]{3,4,6}));
		System.out.println(Arrays.toString(miometodo()));
	}

	
	// un metodo che restuisce un array di interi 
	// con un solo numero > 0
	/*@ ensures (\num_of int i; 0 <= i && i < \result.length; 
	  \result[i] >0) == 1; 
	 @*/
	static int[] miometodo() {
		return new int[] {9,9,0,0};
	}
	
	//@ requires pos(s);
	void foo(int s) {
		
	}

	//@ pure;
	boolean pos(int x) {return x > 0;}
	
	void confrontoAssert(int[] a){
		// tutti gli elementi di a positivi
		// JML
		// @ assert(\forall int i; 0<= i && i < a.length; a[i} > 0);
		// in java
		//assert Arrays.asList(a).stream().allMatch(x -> (x > 0));
	}
}
