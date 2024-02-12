public class Assegnamenti {

	//@ requires z == 9;
	//@ ensures \result == 18;
	public int assegna(int z) {
		z = z * 2;
		return z;
	}

	//@ requires true;
	//@ ensures \result == z * 2;
	public int doppio(int z) {
		//if (z == 23456) return 90; // anche qui c'è un errore che con il test potrei non trovare
		//z = z * 2;
		return z * 2;
	}

	//@ requires true;
	//@ ensures \result >= a && \result >= b; 
	//@ ensures \result == a || \result == b; 
	int max (int a, int b) {
		if (a>b) return a;
		//else return b -1; //errore non posso provarlo giustamente
		else return b;
	}
	
}
