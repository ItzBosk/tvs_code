package esercizio_key_giu22;

public class LightArray {

	//@invariant light != null && light.length == 10;
	
	boolean light[];

	//@ ensures (\forall int i; 0 <= i && i < 10; light[i]);
	//@ diverges true;
	public LightArray() {
		light = new boolean[10];
		//@ loop_invariant light!= null && light.length == 10 && 0 <= i && i <= 10 && (\forall int j; 0 <= j && j < i; light[j]);	
		for(int i = 0; i < 10; i++) {
			light[i] = true;	
		}
	}

	//@ requires 0<=i< 10;
	//@ ensures (\old(light[i]) == !light[i]) &&  (\forall int j; 0 <= j && j < 10 &&  j!=i; light[j] == \old(light[j])); 
	public void toggle(int i) {
		light[i] = ! light[i];
	}

	
	//@ ensures (\forall int i; 0 <= i && i < 10; !light[i]);
	//@ diverges true;
	public void alloff() {
		//@ loop_invariant light!= null && light.length == 10 && 0 <= i && i <= 10 && (\forall int j; 0 <= j && j < i; !light[j]);	
		for(int i = 0; i < 10; i++) {
			light[i] = false;	
		}
	}

	
}
