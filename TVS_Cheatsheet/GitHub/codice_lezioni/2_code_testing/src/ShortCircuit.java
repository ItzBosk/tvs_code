
public class ShortCircuit {

	public static boolean check(){
		System.out.println("check");
		return true;
	}
	
	public static void main(String[] args) {
		int x = -1;
		if (x >= 0 && check()){
			System.out.println("decisione true");
		} else{
			System.out.println(" decisione false");
		}
		
	}
	
}
