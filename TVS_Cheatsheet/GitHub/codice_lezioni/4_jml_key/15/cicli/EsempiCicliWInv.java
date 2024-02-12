package cicli;

public class EsempiCicliWInv {

	// EMPTY INVARIANT
	//@ public normal_behavior
	//@ requires timer >= 0;
	//@ ensures \result==0;
	//@ diverges true;
	public static int countdownEI(int timer) {
		/*@ loop_invariant
		  @ true;
		  @*/
		while (timer > 0) {
			timer--;
		}
		return timer;
	}

	
	//@ public normal_behavior
	//@ requires timer >= 0;
	//@ ensures \result==0;
	//@ diverges true;
	public static int countdown(int timer) {
		/*@ loop_invariant
		  @ timer >= 0;
		  @*/
		while (timer > 0) {
			timer--;
		}
		return timer;
	}

	//@ public normal_behavior
	//@ requires a !=null;
	//@ ensures (\forall int x; 0<=x && x<a.length; a[x]==1);
	//@ diverges true;
	public static void setto1(int[] a) {
		int i = 0;
		/*@ loop_invariant
		  @ a!=null && 0<= i && i <= a.length && (\forall int x; 0<=x && x<i; a[x]==1);
		  @ assignable a[*];
		  @*/
		while (i < a.length) {
			a[i] = 1;
			i++;
		}
	}
	// versione un po' semplificata
	//@ requires a !=null;
	//@ ensures (\forall int x; 0<=x && x<a.length; a[x]==1);
	//@ diverges true;
	public static void setto1S(int[] a) {
		int i = 0;
		/*@ loop_invariant
		  @ 0<= i && i <= a.length && (\forall int x; 0<=x && x<i; a[x]==1);
		  @*/
		while (i < a.length) {
			a[i] = 1;
			i++;
		}
	}

	
	//@ public normal_behavior
	//@ requires a !=null;
	//@ requires a.length >0;
	//@ ensures (\forall int x; 0<=x && x<a.length; \result >= a[x]);
	//@ ensures (\exists int x; 0<=x && x<a.length; \result == a[x]);
	//@ diverges true;
	public static int getMax(int[] a) {
		int max = a[0];
		int i = 1;
		/*@ loop_invariant
		  @ a!=null && 1<= i && i <= a.length && (\forall int x; 0<=x && x<i; max >= a[x])
		  @ && (\exists int x; 0<=x && x<i; max == a[x]) ;
		  @ assignable max;
		  @*/
		while (i < a.length) {
			if (a[i]>max) max = a[i];
			i++;
		}
		return max;
	}

	
	
}
