
public class Esercizio_4 {

	//@ requires n >=0; 
	//@ ensures \result == n;
	//@ diverges true;
	static int returnN(int n) {
		int res = 0;
		//@ loop_invariant res >= 0 && res <=n;
		while(res < n) {
			res++; 
		}
		return res;
	}
	
	
}
