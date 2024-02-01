
public class UsoQunatificatori {

	//@ requires a!=null && a.length >= 1;
	// result <= a[0] && result <= a[1]...
	// il result è minore o uguale di tutti gli a[i]
	//@ ensures (\forall int i; 0 <=i && i < a.length; \result <= a[i]);
	// + il resilutato è un a[i]
	//@ ensures (\exists int i; 0 <=i && i < a.length; \result == a[i]);	
	static int findMin(int[] a){
		//return Integer.MIN_VALUE;
		int min = a[0];
		for(int i = 1; i < a.length; i++){
			if (a[i]< min)
				min = a[i];
		}
		return min;
	}
	
	public static void main(String[] args) {
		// violazioni pre
		//System.out.println(findMin(null));
		//System.out.println(findMin(new int[]{}));
		//
		System.out.println(findMin(new int[]{2,78}));
		System.out.println(findMin(new int[]{-2,78}));
	}
	
}
