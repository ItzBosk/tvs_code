package provaJMLKEY;

public class ProvaJMLKEY {

	// @ requires y == 6;
	// @ ensures \result == 14;
	public static int foo(int y) {
		y = y * 3;
		y = y + 5;
		return y;
	}

	//@ requires x >= 0;
	//@ ensures \result > 0;
	public static int foo2(int x) {
		return x + 10;
	}

	//@ ensures \result >= x && \result >= y;
	public int maxxx(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	//@ requires timer > 0;
	//@ ensures \result == 0;
	//@ diverges true;
	public static int countdouwn(int timer){
		/*@ loop_invariant timer >=0; 
		 @*/
		while( timer > 0){
			timer --;
		}
		return timer;
	}
	
	
	//@ public normal_behavior
	//@ requires a!=null;
	//@ ensures (\forall int x; 0<= x && x < a.length; a[x] == 0);
	//@ diverges true;
	public static void set0(int[] a){
		int i = 0;
		/*@ loop_invariant 0 <= i && i <= a.length &&
		   (\forall int x; 0<= x && x < i; a[x] == 0);
		 @*/
		while(i < a.length){
			a[i] = 0;
			i++;
		}
	}
	
	
	
}
