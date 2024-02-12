package junit;

public class Counter {

	int val;
	public Counter(){val = 0;}
	
	public int inc(){return ++val;}
	// decrementa se >0, altrimenti solleva eccezione
	public int dec(){
		if (val >0) return --val;
		else throw new RuntimeException("counter <= 0");
	}


}
