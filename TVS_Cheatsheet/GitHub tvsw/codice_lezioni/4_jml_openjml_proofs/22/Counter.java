
public class Counter {

	//@ public invariant value >= 0;
	/*@ spec_public @*/ int value = 0;
	
	//@ ensures value == 0;
	public Counter() {}
	
	//@ ensures value == \old(value) +1;
	//@ ensures value >= 0;
	public void inc_0() {
		value ++;
	}
	
	//@ ensures value == \old(value) +1;
	//@ ensures value >= 0;
	//@ requires value < Integer.MAX_VALUE;
	public void inc_1() {
		value ++;
	}

	//@ ensures value == \java_math(\old(value) +1);
	//@ ensures value >= 0;
	//@ code_java_math
	public void inc_2() {
		value ++;
	}

}
