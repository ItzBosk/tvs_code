package cycles;

public class ScacchieraErr {

	 /*@ spec_public @*/
	int scacchiera[];
	
	// inzialmente tutta vuota
	//@ requires true;
	/*@ ensures scacchiera!= null && scacchiera.length == 5 
	  && (\forall int i; 0 <= i && i < 5; scacchiera[i]==0);
	 @*/
	public ScacchieraErr(){
		scacchiera = new int[5];
		for(int i=0; i< 5; i++) {
			scacchiera[i] = 0;
		}
	}
	
}
