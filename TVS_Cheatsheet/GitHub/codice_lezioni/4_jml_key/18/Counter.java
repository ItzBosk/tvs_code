
public class Counter {

	//@ requires x >= 0;
	//@ ensures \result == 0;
	//@ diverges true;
	// serve diverges true per non dover provare che effettivamente termini
	static public int toZero(int x){
		//
		/*@ loop_invariant x >= 0; @*/
		while(x>0){
			x--;
		}
		return x;
	}
	
}
