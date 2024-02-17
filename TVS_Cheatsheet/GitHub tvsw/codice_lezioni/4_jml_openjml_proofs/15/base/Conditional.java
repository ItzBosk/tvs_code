package base;

public class Conditional {

	//@ ensures \result >= x && \result >= y;
	//@ ensures \result == x || \result == y;	
	static int max(int x, int y) {
		return x > y ? x : y;
	}

}
