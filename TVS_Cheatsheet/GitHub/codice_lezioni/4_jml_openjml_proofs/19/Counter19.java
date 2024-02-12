
public class Counter19 {

	//@ invariant count >= 0;
	public int count;
	
	public Counter19(){count = 0;}
	
	//@ ensures count == \old(count) +1;
	//@ ensures count > 0;
	public int inc() {
		return ++ count;
	}
	//@ ensures count == 0;
	public void reset() {
		count = 0;
	} 
}
