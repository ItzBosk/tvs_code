
public class Counter {
	
	//@ invariant val >= 0;
	int val;
	
	//@ ensures true;
	public Counter(){
		val = 0;
	}

	//@ requires val > 0;
	//@ ensures val == \old(val) -1;
	public void dec(){
		val --;
	}
	//@ requires true;
	//@ ensures val > 0;
	public void inc(){
		val ++;
	}
	
}
