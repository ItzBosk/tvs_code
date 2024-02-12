package provaJMLKEY;

public class Invarianti {
	
	//@ requires x >= 0;
	//@ ensures \result == x;
	//@ diverges true;
	public int setTo(int x){
		int y = 0;
		/*@ loop_invariant y <= x;
		 @*/
		while(y < x){
			y++;
		}
		return y;
	}
	

}
