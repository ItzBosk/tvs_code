public class Quantificatori{
	
	int[] a = new int[10];
	
	//@ ensures (\forall int j; 0<= j < 10; a[j] == 1);
	Quantificatori(){
		for(int i = 0; i < 8; i++) a[i] = 1;
	}
	
	public static void main(String[] args) {
		//Quantificatori a = new Quantificatori();
		
		System.out.println(find_min(new int[] {3,4,5}));
		
	}
	
	// trova il minimo in un array
	//@ requires a!= null && a.length >= 1;
	// result sarà il minore di tutti gli elementi
	//@ ensures (\forall int j; 0<= j && j < a.length; \result<= a[j]);
	//@ ensures (\exists int j; 0<= j && j < a.length; \result== a[j]);
	static public int find_min(int[] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if (a[i]< min) min = a[i];
		}
		return min;
	}
	
}