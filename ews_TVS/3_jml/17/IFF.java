
public class IFF {
	// restituisce true se e solo se x � positivo
	//@ requires true;
	// se scrivessi x >= 0 ==> \result == false; sarebeb parziale, quello completo �:
	//@ ensures x >= 0 <==> \result == false;
	static public boolean isPositive(int x){
		if (x >= 0 ) return true;
		else return false;
	} 
	
	public static void main(String[] args) {
		System.out.println(isPositive(4));
		System.out.println(isPositive(-4));
	}
	
}
