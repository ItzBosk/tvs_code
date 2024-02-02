import java.util.Arrays;

import org.jmlspecs.annotation.Ensures;

public class Lampadine {
	//@ spec_public;
	boolean accese[];
	//(\forall int i; 0<= i && i < accese.length ; ! accese[i]);
	
	// crea un array di 10 lampadine tutte spente tranne una	
	/*@ensures accese.length == 10 &&
	(\num_of int i; 0 <= i && i < 10 ; accese[i] == true) == 1;
	*/
	//@ requires isCorrect();
	public Lampadine(){
		accese = new boolean[10];
		accese[3] = true;
		accese[5] = true;
	}
	
	static public /*@ pure @*/boolean isCorrect() {
		return true;
	}
	
	public static void main(String[] args) {
		Lampadine l = new Lampadine();
		System.out.println(Arrays.toString(l.accese));
	}

}
