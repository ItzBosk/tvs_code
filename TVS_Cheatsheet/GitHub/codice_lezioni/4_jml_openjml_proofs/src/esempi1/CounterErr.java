package esempi1;

public class CounterErr {

	/*@ spec_public @*/ int value = 0;
	
	//@ ensures value == 0;
	public CounterErr() {}
	
	//@ ensures value == \old(value) +1;
	public void inc() {
		value ++;
	}
}
