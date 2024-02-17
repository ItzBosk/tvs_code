
public class UsoAssert {
	
	// testituisce int[12] di pioggia
	static int[] pioggia(){
		int[] result = {1,2,3,4};
		//
		// leggi da DB
		// ...
		// voglio assicurarmi che siano tutti numeri >= 0;
		// in Java
		assert tuttiPositivi(result);
		// in JML
		//@ assert (\forall int i; 0<=i && i < result.length; result[i]>=0);
		return result;

	}

	private static boolean tuttiPositivi(int[] result) {
		for(int x: result){
			if (x <0){
				return false;
			}
		}
		return true;
	}
	

}
