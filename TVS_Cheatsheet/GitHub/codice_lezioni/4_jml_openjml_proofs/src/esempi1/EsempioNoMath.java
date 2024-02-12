package esempi1;

public class EsempioNoMath {

	// da un numero mi restituisce il massimo
	//@ requires true;
	//@ ensures \result >= a && \result >= b;
	//@ ensures \result == a || \result == b;
	int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	// positivo???
	//@ requires true;
	//@ ensures a > 0 ==> \result;
	//@ ensures a <= 0  ==> ! \result;
	boolean positive(int a) {
		if (a >= 0)
			return true;
		else
			return false;
	}

}
