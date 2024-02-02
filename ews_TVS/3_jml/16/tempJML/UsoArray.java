package tempJML;

public class UsoArray {
	
	int[] pippo;
	
	// alla fine del costruttore pippo contiene tanti 100;
	//@ ensures (\forall int i; 0 <= i && i < 10; pippo[i] == 100);
	public UsoArray(){
		pippo = new int[10];
	}
	
	public static void main(String[] args) {
		UsoArray a = new UsoArray();
	}
}
