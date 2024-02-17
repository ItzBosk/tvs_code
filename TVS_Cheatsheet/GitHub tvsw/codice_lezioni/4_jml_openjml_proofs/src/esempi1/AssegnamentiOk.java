package esempi1;
import org.jmlspecs.annotation.CodeBigintMath;
import org.jmlspecs.annotation.CodeJavaMath;
import org.jmlspecs.annotation.CodeSafeMath;

public class AssegnamentiOk {

	//@ requires true;
	//@ ensures \result == z + 13;
	@CodeJavaMath
	public int add13_j(int z) {
		z = z + 13;
		return z;
	}
	//@ requires true;
	//@ ensures \result == z + 13;
	@CodeSafeMath
	public int add13_s(int z) {
		z = z + 13;
		return z;
	}
	//@ requires true;
	//@ ensures \result == z + 13;
	@CodeBigintMath
	public int add13_b(int z) {
		z = z + 13;
		return z;
	}

	//@ requires true;
	//@ ensures \result == z * 2;
	//@ code_bigint_math
	public int doppioFisso(int z) {
		z = z * 2;
		return z;
	}

	
	
}
