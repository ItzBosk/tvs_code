
public class Scacchiera {

	// di 10 elementi 
	// 0 -> vuota
	 /*@ spec_public @*/
	int scacchiera[];
	
	// inzialmente tutta vuota
	//@ public normal_behavior
	//@ requires true;
	/*@ ensures scacchiera!= null && scacchiera.length == 5 
	  && (\forall int i; 0 <= i && i < 5; scacchiera[i]==0);
	   diverges true;
	 @*/
	public Scacchiera(){
		scacchiera = new int[5];
		/*@ loop_invariant scacchiera!= null && scacchiera.length == 5 
		  && (\forall int j; 0 <= j && j < 5; scacchiera[j]==0);		  
		 */
		for(int i=0; i< 5; i++) {
			scacchiera[i] = 0;
		}
	}
	
}
