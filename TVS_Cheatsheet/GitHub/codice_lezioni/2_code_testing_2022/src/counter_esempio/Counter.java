package counter_esempio;

public class Counter {

	private int value;

	public Counter() {
		value = 0;
	}

	public int inc() {
		if (value == 100 || value == 2)
			return ++value;
		else
			return ++value;
	}

	public int dec() {
		return 0;
	}

}
