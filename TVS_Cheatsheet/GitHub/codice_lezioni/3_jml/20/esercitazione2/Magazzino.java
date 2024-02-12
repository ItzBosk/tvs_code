package esercitazione2;

public class Magazzino {

	//@ public invariant quantita!= null && quantita.length == 5;
	//@ public invariant (\forall int i; i>=0 && i < quantita.length; quantita[i] >= 0);
	//@ public invariant (\forall int i; i>=0 && i < quantita.length; quantita[i] <= 100);
	
	/*@ spec_public */ int[]  quantita;
	
	//@ requires true;
	//@ ensures quantita!= null && quantita.length == 5;
	//@ ensures (\forall int i; i>=0 && i < quantita.length; quantita[i] == 0); 				
	public Magazzino() {
		quantita = new int[5];
		// viola invariante e post quantita[0] = -100;
	}
	//@ requires 0 <= index && index < quantita.length;
	//@ requires 0 < q && q <= 10;
	// quantità viene incrementato se possibile
	/*@ ensures \old(quantita[index]) + q <= 100 ==> (\result && 
	          quantita[index] == \old(quantita[index]) +q); @*/
	// se non posso incrementare cosa succede
	/*@ ensures \old(quantita[index]) + q > 100 ==> ! \result &&
	         (quantita[index] == \old(quantita[index])); */ 
	public boolean insert(int index, int q) {
		if (quantita[index] + q > 100) return false;
		quantita[index]+=q;
		return true;
	}
	
	//@ requires 0 <= index && index < quantita.length;
	//@ ensures \result <==> quantita[index] == 100; 
	public boolean isFull(int index) {
		return quantita[index] != 100;
	}
	
	
	public static void main(String[] args) {
		Magazzino m = new Magazzino();
		//m.insert(-4,5);
		for(int i = 0; i < 10; i++) m.insert(0,10);
		System.out.println(m.quantita[0]);
		System.out.println(m.insert(0,10));
		System.out.println(m.isFull(0));
	}
	
}
