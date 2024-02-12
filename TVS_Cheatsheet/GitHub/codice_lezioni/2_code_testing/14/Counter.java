
public class Counter {

	int val;

	public Counter() {
		val = 0;
	}

	public void dec() {
		if (val == 0)
			throw new RuntimeException("kkk");
	}

}
