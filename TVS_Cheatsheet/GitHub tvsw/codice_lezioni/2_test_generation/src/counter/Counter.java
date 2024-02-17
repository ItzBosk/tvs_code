package counter;
public class Counter {
	
	private int count;
	
	public Counter(){ 
		count = 0; 
		assert count == 0; // delf check oracles
	}
	
	public int inc() {
		assert count >= 0;
		int old_count = count;
		int res = ++count;
		assert res == count +1;
		return res;
	}
	
	public int dec() {return --count;}
	
	public void m(int x, int y) {
		if (x == count && y == count/2+5) {
			System.out.println("errore");
		}
	}
	
	
	public int val() {
		return count;
	}

}
