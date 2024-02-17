
public class EsempIQuantificazione {

	// metodo che restituisce il massimo di un array di numeri POSITIVI
	// precondizioni:
	// l'array non è nullo ed non è vuoto
	//@ requires a!=null && a.length > 0;
	// sono tutti positivi
	//@ requires (\forall int i; 0<= i && i < a.length; a[i] > 0);
	// POST CONDIZIONI!!!
	// il numero restituito è il massimo
	// prima post: è maggiore o uguale a tutti gli elementi dell'array
	//@ ensures (\forall  int i; 0<= i && i < a.length; \result >= a[i]);
	// seconda post: il massimo è un elemento dell'array
	//@ ensures (\exists  int i; 0<= i && i < a.length; \result == a[i]);
	static int max(int[] a){
		int max = a[0];
		for(int i = 2; i < a.length; i++) {
			if (a[i]>max) max = a[i];
		}
		// return a[0]; --> violazione prima post
		//return Integer.MAX_VALUE; // --> non viola la prima post
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] p = {6,7, 10};
		System.out.println(max(p));
	}
	
	
}
