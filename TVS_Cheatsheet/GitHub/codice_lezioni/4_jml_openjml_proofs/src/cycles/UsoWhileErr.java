package cycles;

public class UsoWhileErr {

	//@ requires timer >= 0;
	//@ ensures \result==0;
	public static int countdown(int timer) {
		//@ loop_invariant timer >= 0;
		while (timer > 0) {
			// sleep
			timer--;
		}
		return timer;
	}

}
