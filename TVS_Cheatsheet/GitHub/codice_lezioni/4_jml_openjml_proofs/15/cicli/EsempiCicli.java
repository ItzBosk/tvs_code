package cicli;

public class EsempiCicli {

	//@ public normal_behavior
	//@ requires timer >= 0;
	//@ ensures \result==0;
	//@ diverges true;
	public static int countdown(int timer) {
		while (timer > 0) {
			timer--;
		}
		return timer;
	}

	//@ public normal_behavior
	//@ requires timer >= 0 && timer <= 10;
	//@ ensures \result==0;
	//@ diverges true;
	public static int countdownN(int timer) {
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
		while (i < a.length) {
			a[i] = 1;
			i++;
		}
	}

	//@ public normal_behavior
	//@ requires a !=null;
	//@ requires a.length==2;
	//@ ensures (\forall int x; 0<=x && x<2; a[x]==1);
	//@ diverges true;
	public static void set2to1(int[] a) {
		int i = 0;
		while (i < 2) {
			a[i] = 1;
			i++;
		}
	}

}
