
public class LoopInvariant {

	//@ ensures \result == 100;
	int f(){
		int i = 0;
		//@ loop_invariant i <= 100;
		while(i< 100) i++;
		//@ assert i <= 100 && ! (i < 100);
		// quindi
		//@ assert i <= 100 && i >= 100;
		// quindi
		//@ assert i == 100;		
		return i;
	}
	
	public static void main(String[] args) {
		LoopInvariant l = new LoopInvariant();
		System.out.println(l.f());
		
	}
	
}
