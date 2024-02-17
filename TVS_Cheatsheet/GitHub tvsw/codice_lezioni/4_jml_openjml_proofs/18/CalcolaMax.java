
public class CalcolaMax {

	//@ requires true;
	//@ ensures \result >= x && \result >= y;
	//@ ensures \result == x || \result == y;
	int max(int x, int y){
		if (x > y) return x; 
		else return y;
	}
	
	
}
