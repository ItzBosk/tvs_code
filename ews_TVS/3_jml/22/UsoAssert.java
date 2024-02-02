import java.util.Arrays;

class UsoAssert{
	
	public static void main(String[] args) {
		int x = 0;
		assert x > 0 : "numero negativo vale " + x;
	}

	public int min(int a[]) {
		// pre
		assert a != null && a.length > 0 : "violazione precondition";
		// algoritmo
		int result = 0;
		// ...
		// post
		// exists ...
		assert Arrays.asList(a).indexOf(new Integer(result)) >= 0;
		// return
		return result;
	}
	
	boolean baaa() {
		return true;
	}
	
	void hhh() {
		int y = 0;
		
		// ATTENZIONE: ho due comportamenti diversi se attivo o meno gli assert
		assert baaa(); 		// se metodo non puro l'assert cambia lo stato degli oggetti
		assert ++y >= 1; 	// modifica stato variabili
	}
}