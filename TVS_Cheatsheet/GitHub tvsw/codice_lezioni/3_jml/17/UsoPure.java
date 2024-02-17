
public class UsoPure {

	int x;
	
	//@ requires isGoodP(p);
	public void complexM(int[] p){
		
	}
	
	public /*@ pure @*/boolean isGoodP(int[] p){
		return true;
	}
	
}
