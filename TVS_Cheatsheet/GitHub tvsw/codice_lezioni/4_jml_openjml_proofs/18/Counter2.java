public class Counter2 {
	
	//@ invariant 0 <= val && val <= 1000;
	
	int val;
	public Counter2() {
		val = 1000;
	}
	// decrementa val e elo resituisce ma solo se non è già nullo
	//@ ensures \result >= 0 && \result < 1000;
	public int dec() {
		if (val == 0)
			return 0;
		val--;
		return val;
	}

}
