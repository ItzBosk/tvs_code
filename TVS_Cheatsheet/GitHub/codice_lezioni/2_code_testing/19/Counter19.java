
public class Counter19 {

	private int value; 
	
	public Counter19() {
		value = 0;
		assert value == 0 : "non va bene";
	}
	
	public int inc() { return value++;}

	public int dec() { return --value;}
	
	
	static char foo(int y) {
		if (y > 0) return 'P';
		else if (y == 0) return 'Z';
		else /*if (y < 0)*/{ 
			assert y < 0;
			return 'N';
		}
	}
}
