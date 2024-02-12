// QUESTO NON RIESCO A PROVARLO AG
public class SommaPositiva {

	private /*@ spec_public @*/ int[] arr;

	//@ public invariant arr!=null && arr.length> 0;

	// ATTENZIONE: se lascio l'invariante senza il "requires" qui sotto
	// la dimostrazione non funziona (dice che c'è un problema con
	// l'array di lunghezza 0) perché l'invariante inizia a valere
	// dopo il costruttore
	//@ requires arr!=null && arr.length>0;
	//@ ensures this.arr == arr;
	public SommaPositiva(int[] arr) {
		this.arr = arr;
	}

	//@ ensures \result==true ==> (\sum int i;0<=i&&i<arr.length;arr[i])>0;
	//@ ensures \result==false ==> (\sum int i; 0<=i && i<arr.length; arr[i]) <=0;
	//@ diverges true;
	public boolean sommaPositiva() {
		int somma = 0;
		/*@ loop_invariant arr!=null && arr.length >0  && 0<=i && i<=arr.length &&
	 		( somma == (\sum int j; 0<=j && j<i; arr[j]));@*/		
		for (int i = 0; i < arr.length; i++) {
			somma += arr[i];
		}
		if (somma > 0)
			return true;
		else
			return false;
	}

}
