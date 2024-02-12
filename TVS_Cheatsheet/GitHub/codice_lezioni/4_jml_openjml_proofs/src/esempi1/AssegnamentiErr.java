package esempi1;
public class AssegnamentiErr {

	// alcuni metodi con input fissi
	
	//@ public normal_behavior
	//@ requires x == 5;
	//@ assignable \nothing;   
	//@ ensures \result==13;
	public static int assegna(int x) {
	   x = x + 1;
	   x = x * 3;
	   x = x - 5;
	   return x;
	}

	//@ requires z == 9;
	//@ ensures \result == 18;
	public int doppioFisso(int z) {
		z = z * 2;
		return z;
	}
	// operazione aritemtiche:
	
	//@ requires true;
	//@ ensures \result == z + 13;
	public int add13(int z) {
		z = z + 13;
		return z;
	}

	
	

	//@ requires true;
	//@ ensures \result == z * 2;
	public int doppio(int z) {
		//if (z == 23456) return 90; // anche qui c'� un errore che con il test potrei non trovare
		//z = z * 2;
		return z * 2;
	}
}
