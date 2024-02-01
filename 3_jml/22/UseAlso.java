
public class UseAlso {

	/*@ requires x > 0; 
	  @ ensures \result > 0; 
	  also
	  requires x < 0; 
	  ensures \result <= 0; 
	 */
	// A => B e C => D
	int foo(int x) {
		return x +1;
	}
	
	
	
	
	private void foo2() {
		int i = 0;
		//@ loop_invariant 0<= i && 	i <= 10;
		while(i < 10 ) {
			i ++;
		}
		// sono sicuro che invariant è vero e condizione while è falsa;
		//@ assert 0 <= i && i <=10 && i >= 10; 
		// i == 10
	}
	
}
