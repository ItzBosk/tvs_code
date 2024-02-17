package esempi1;

import org.jmlspecs.annotation.CodeBigintMath;

//il contatore è sempre maggiore o uguale a zero

@CodeBigintMath
public class CounterInv {

	//@ public invariant value >= 0;
	/*@ spec_public @*/ int value = 0;
	
	//@ ensures value == 0;
	public CounterInv() {}
	
	//@ ensures value == \old(value) +1;
	//@ ensures value > 0;
	public void inc_0() {
		value ++;
	}
}
