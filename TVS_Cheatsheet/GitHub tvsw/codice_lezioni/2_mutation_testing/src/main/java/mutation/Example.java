package mutation;

public class Example {
	
	int power(int b, int e) throws Exception {
		if (e < 0)
			throw new Exception("Negative exponent");
		if ((b == 0) && (e == 0))
			throw new Exception("Undefined");
		int r = 1;
		while (e > 0) {
			r = r * b;
			e = e - 1;
		}
		return r;
	}
}
