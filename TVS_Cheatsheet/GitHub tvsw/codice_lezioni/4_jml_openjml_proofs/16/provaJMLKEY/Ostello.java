package provaJMLKEY;

public class Ostello {
	
	// true: occupato, false: libero;
	public boolean letto[];
	
	//@ public normal_behavior
	//@ requires true;
	/*@ ensures letto != null && 
	    letto.length == 10 &&
	    (\forall int i; 0<= i && i < 10; letto[i] == false);  
	 @*/
	//@ diverges true;
	public Ostello(){
		letto  = new boolean[10];
		int i = 0;
		/*@ loop_invariant 
		   letto != null && letto.length == 10 &&
		   0 <= i && i <= 10 &&
		    (\forall int x; 0<= x && x < i; letto[x] == false);
		 @*/
		while(i < 10){
			letto[i] = false;
		}
	}
	

}
