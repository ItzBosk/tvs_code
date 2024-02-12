public class Asegnamento {

	//@ requires y == 5;
	//@ ensures \result == 14;
	public static int foo(int y) {
		y = y * 3;
		y = y + 5;
		return y;
	}
	//@ requires x >=0;
	//@ ensures \result>0;
	public static int doppio(int x){
		return x*2;
	}
	
	//@ ensures \result >= x && \result >= y;
	public int maxxx(int x, int y){
		if (x > y) return x;
		else return y;
	}
	
}
