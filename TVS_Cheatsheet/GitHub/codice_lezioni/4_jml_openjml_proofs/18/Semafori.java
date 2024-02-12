
public class Semafori {
	
	public int[] luci;
	
	//@ ensures luci!= null && (\forall int i; 0<= i && i < luci.length; luci[i] == 2);
	//@ diverges true;
	public Semafori(){
		luci = new int[4];
		//luci[j] con j da 0 a i, vale 2
		/*@ loop_invariant luci!= null && 
			(\forall int j; 0<=j && j < i; luci[j] == 2);
			@*/
		for(int i = 0; i < luci.length; i++){
			luci[i] = 2;
		}
		//luci[0] = 2; ....
	}
	

}
