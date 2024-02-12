package esempi1;
import org.jmlspecs.annotation.CodeBigintMath;
import org.jmlspecs.annotation.SpecBigintMath;

// si può usare anche l'annotazione
// @CodeBigintMath
public class Counter {

	/*@ spec_public @*/ int value = 0;
	
	//@ ensures value == 0;
	public Counter() {}
	
	//@ ensures value == \old(value) +1;
	//@ code_bigint_math
	public void inc_1() {
		value ++;
	}
	
	//@ requires value < Integer.MAX_VALUE;
	//@ ensures value == \old(value) +1;
	public void inc_2() {
		value ++;
	}

	
}
