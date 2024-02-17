
public class Util {

	//@ requires true;
	//@ ensures \result ==  2*x;
	static int calcolaDoppio(int x) {
		int y = x;
		y += x;
		return y;		
	}
	
	//@ requires true;
	//@ ensures \result ==  x +1;
	static int inc(int x) {
		int y = x + 10;
		y -= 9;
		return y;
	}
	
	//@ requires true;
	//@ ensures \result >= 0;	
	static int abs(int x) {
		if (x >= 0) return x;
		else return -x;
	}
	
	//@ requires true;
	//@ ensures \result >= x && \result >= y && (\result == x || \result == y); 
	static int max(int x, int y) {
		if (x > y) return x;
		else return y;
	}
	
	//@ requires timer>=0; 
	//@ ensures \result == 0;
	//@ diverges true;
	static int countdown(int timer) {
		//@ loop_invariant timer >= 0;
		while (timer >0) {
			timer --;
		}
		return timer;
	}
	
	//@ requires a!=null;
	//@ ensures (\forall int x; 0<=x && x < a.length; a[x] == 1);
	//@ diverges true;
	static void setto1(int[] a) {
		//@ loop_invariant a!=null && (\forall int x; 0<=x && x < i; a[x] == 1) && 0 <= i && i<=a.length;
		for(int i=0; i < a.length;i ++) {
			a[i] = 1;
		}
	} 
	
	
	
}
