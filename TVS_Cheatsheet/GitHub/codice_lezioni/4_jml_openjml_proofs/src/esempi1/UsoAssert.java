package esempi1;

public class UsoAssert {

	//@ requires true;
	int sump1(int x) {
		int y = x + 1;
		//@ assert y == x + 2;
		return y;
	}

}
