
public class Counter {

	int val;
	
	//@ requires true;
	//@ ensures val == 0; 
	Counter(){
		val = 0;
	}
	
	//@ requires true;
	//@ ensures \result > 0;
	int inc() {
		return ++ val;
	}
	
	//@ requires true;
	//@ ensures val == 0;
	void reset() {
		val = 0;
	}
	
}
