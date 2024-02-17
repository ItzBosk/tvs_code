
public class Counter {

	//@ invariant value >= 0;
	int value = 0;
	
	//@ ensures value == 0;
	public Counter() {}
	
	//@ ensures value == \old(value) +1;
	//@ ensures value >= 0;
	public void inc() {
		value ++;
	}
	
}
