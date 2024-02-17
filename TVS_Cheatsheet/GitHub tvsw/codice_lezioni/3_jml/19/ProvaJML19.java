
public class ProvaJML19 {

	public static void main(String[] args) {
		ProvaJML19 p = new ProvaJML19();
		System.out.println(p.min(8,9));
		System.out.println(p.min(9,8));
		System.out.println(p.find_min(new int[] {10,9}));
	} 
	
	// dice se j è minore di n
	// ensures (j < n ==> \result) && (j>=n ==> !\result);
	//@ ensures (++j < n-- <==> \result);	
	//@ requires valid();
	public boolean min(int j , int n) {
		return j < n;
	} 
	public /*@ pure */boolean valid() {
		return true;
	}
	
	// trova il minimo all'interno di un array
	//@ requires a != null;
	//@ requires a.length >= 1;
	// postcondizioni
	// il valore restituito è minore o uguale di ogni elemento
	//@ ensures (\forall int i; i>=0 && i < a.length; \result <= a[i]);
	//@ ensures (\exists int i; i>=0 && i < a.length; \result == a[i]);
	public int find_min(/*@ non_null @*/ int[]  a) {
		assert a!= null;
		return Integer.MIN_VALUE;
	}
}
