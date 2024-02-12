package provaJMLKEY;

public class Counter {
	
	//@ invariant val >= 0;
	int val;
	
	//@ requires true;
	public Counter(){
		val = 0;
	}
	
	//@ requires true;
	public void dec(){
		if (val > 0) 
			val = val -1;
	}
	//@ requires true;
	//@ ensures val > 0;
	public void inc(){
		val = val +1;
	}
	

}
