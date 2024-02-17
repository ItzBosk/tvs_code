import org.jmlspecs.annotation.CodeBigintMath;
import org.jmlspecs.annotation.SpecBigintMath;

@CodeBigintMath @SpecBigintMath 
public class Counter2 {

	//@ public invariant value >= 0;
	/*@ spec_public @*/ int value = 0;
	
	//@ ensures value == 0;
	public Counter2() {}
	
	//@ ensures value == \old(value) +1;
	//@ ensures value >= 0;
	public void inc_0() {
		value ++;
	}
}
