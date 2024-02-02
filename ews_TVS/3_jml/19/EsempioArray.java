
public class EsempioArray {

	int a[];
	
	// inizialmente l'array contiene tutti 0 e contine 8 elementi
	//@ ensures a!= null;
	//@ ensures a.length == 8;
	// ensures (\forall int i; i>= 0 && i <a.length; a[i] == 0);
	//@ ensures (\sum int i; i>= 0 && i <a.length; a[i]) == 0;
	EsempioArray(){
		a = new int[] {0,0,0,0,0,0,-1,2};
	}
	
	public static void main(String[] args) {
		new EsempioArray();
		System.out.println("dd");
	}
	
}
