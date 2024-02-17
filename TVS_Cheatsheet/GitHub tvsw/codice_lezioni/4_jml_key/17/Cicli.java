
public class Cicli {

	//@ requires t>=0;
	//@ ensures \result == 0;
	//@ diverges true;
	int timer(int t){
		//@ loop_invariant t>=0;
		while (t>0){
			// sleep
			t --;
		}
		return t;
	}
	//@ requires n>=0;
	//@ ensures \result == n*n;
	//@ diverges true;
	int quadrato(int n){
		int i = 0;
		int result = 0;
		//@ loop_invariant result == i*n;
		while (i!=n){
			result += n;
			i++;
		}
		return result;
	}
	
}
