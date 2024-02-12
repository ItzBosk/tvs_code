package sol;

public class Code {
	//@ requires n >= 0;
	//@ ensures \result == n * n;
	//@ diverges true;
	public static int quadrato(int n) {
		int i = 0;
		int result = 0;
		//@ loop_invariant 0 <= i && i <= n && result == i*n;
		while (i < n) {
			result += n;
			i++;
		}
		return result;
	}

}
