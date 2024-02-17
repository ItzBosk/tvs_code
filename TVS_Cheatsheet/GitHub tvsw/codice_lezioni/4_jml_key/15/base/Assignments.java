package base;

public class Assignments {
	
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

	//@ ensures \result > 0;
	static int foo(int x){
	   return x + 10;
	}
	//@ requires x > 19;
	//@ ensures \result > 0;
	static int foo2(int x){
	   return x + 10;
	}
	
}
