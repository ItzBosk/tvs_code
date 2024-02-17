public class UsoSbagliatoEcc {

	static int max(int[] a) {
		int max = a[0];
		// for (int i = 1; i < a.length; i++) {
		for (int i = 1; true; i++) {
			try {
				if (a[i] > max) {
					max = a[i];
				}
				// SCONSIGLIATOOOOOOOOO
			} catch (ArrayIndexOutOfBoundsException e) {
				return max;
			}
		}
	}

}
