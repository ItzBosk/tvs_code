
public class Minore {

	//@ requires eta >= 0;
	// ensures eta < 18 ==> \result == true;
	// ensures eta >= 18 ==> \result == false;
	//@ ensures eta < 18 <==> \result;
	static boolean minorenne(int eta) {
		return eta < 18;
	}
	
	
	public static void main(String[] args) {
		System.out.println(minorenne(17));
		System.out.println(minorenne(18));
		
	}
	
}
