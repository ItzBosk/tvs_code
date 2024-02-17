import org.jmlspecs.annotation.CodeBigintMath;

public class UsoInvariant {

	//@ requires a >= 0;
	//@ ensures \result == 0;
	//@ diverges true;
	int countdown(int a) {
		//@ loop_invariant a >= 0;
		while(a>0) a--;
		return a;
	
	}
	//@ requires n >= 0;
	//@ ensures \result == n*n;
	//@ diverges true;
	@CodeBigintMath
	int quadrato(int n) {
		int a = 0;
		int result = 0;
		//@ loop_invariant result == n *a;
		while(a!=n) {result += n; a ++;};
		return result;	
	}
	//@ diverges true;
	//@ requires n >= 0;
	//@ ensures \result == 2*n;
	@CodeBigintMath
	int doppio(int n) {
		int old_n = n;		
		int doppio = n;
		//@ loop_invariant old_n >= 0 && (doppio + old_n) == 2 * n;
		while(old_n>0) {doppio++; old_n --;}
		return doppio;
	}
	

	//@ public normal_behavior
	//@ requires a!=null;
	//@ ensures (\forall int i; 0<=i && i < a.length ; a[i] == 1);
	//@ diverges true;
	static void setto1(int[] a) {
		//@ loop_invariant a!= null && 0 <= i && i <= a.length && (\forall int j; 0<= j && j < i ; a[j] == 1);
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
		}
	}

}
