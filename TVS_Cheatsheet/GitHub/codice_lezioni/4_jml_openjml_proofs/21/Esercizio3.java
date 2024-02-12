
public class Esercizio3 {

	int a[];
	
	/*@ ensures a!=null && a.length == 5 && 
	  (\forall int i; 0<=i && i < 5; a[i] == 0);
	 @ diverges true;
	@*/
	public 	Esercizio3() {
		a = new int[5];
		/*@ loop_invariant a.length == 5 && a!= null &&
		   (\forall int x; 0<=x && x < i; a[x] == 0);
		 @*/
		for(int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
	}

	
	
	
}
