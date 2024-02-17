
public class Esempi {
	
	//@ requires true;
	//@ ensures \result == 10;
	public int r10(){
		int x = 10;
		x = x + 20;
		x = x * 2;
		return x;
	}
	
	//@ ensures x >0 ==> \result == x + 10;
	//@ ensures x <=5 ==> \result == x;
	public int inc10p(int x){
		if (x > 0) return x + 10;
		return x;
	}

}
