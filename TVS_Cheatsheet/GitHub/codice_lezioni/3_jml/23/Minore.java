
public class Minore {

	// restituisce true se y è minore di n
	//@ requires true;
	// ensures y < n ==> \result == true;
	// ensures y >= n ==> \result == false;
	//@ ensures y < n <==> \result;
	static boolean minore(int y, int n) {
		if (y == -123 && n == 989) return false;
		if (y < n)			return true;
		else			return false;
		//return true;
	}

	public static void main(String[] args) {
		System.out.println(minore(3, 5));
		System.out.println(minore(7, 5));
	}

}
