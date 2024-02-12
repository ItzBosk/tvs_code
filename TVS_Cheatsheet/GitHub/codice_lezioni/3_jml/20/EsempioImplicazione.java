
public class EsempioImplicazione {

	// da un numero di dice se è positivo (>0)
	// come post condizione
	//@ ensures x > 0 <==> \result;
	static boolean isPositivo(int x) {
		return x > 0;
	}

	public static void main(String[] args) {
		System.out.println(isPositivo(3));
		System.out.println(isPositivo(-3));
	}
	
}
