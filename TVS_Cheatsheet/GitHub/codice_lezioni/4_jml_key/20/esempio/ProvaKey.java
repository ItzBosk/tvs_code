package esempio;

public class ProvaKey {
	
	
	//@ public normal_behavior
	//@ requires x == 5;
	//@ assignable \nothing;   
	//@ ensures \result==13;
	public static int assign(int x) {
	   x = x + 1;
	   x = x * 3;
	   x = x - 5;
	   return x;
	}

	//@ requires x>= 0;
	//@ ensures \result >= 0;
	int foo(int x) {
		return x + 10;
	}
	
	//@ requires true;
	//@ ensures (\result == a || \result == b) && (\result >= a && \result >= b);
	int max(int a, int b) {
		if (a>b) return a;
		else return b;
	}
	
	

	
}
