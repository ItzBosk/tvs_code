
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
		// qui all'uscita del while si ha y<=x and not (y<x) che implica y ==x
		return y;
	}

	
	//@ requires timer >= 0;
	//@ ensures \result==0;
	//@ diverges true;
	public static int countdown(int timer) {
		/*@ loop_invariant
		  @ timer >= 0;
		  @*/
	      while(timer>0){
	           timer --;
	      }
	      return timer;
	}
}
