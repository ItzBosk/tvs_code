package pkgpizzeria;

public class Pizzeria {

	//@ public invariant numPizze >=0;
	//@ spec_public 
	private int numPizze;
	
	public Pizzeria() {
		numPizze = 1;
	}
	
	//@ requires numPizze>0;
	//@ ensures numPizze>=0;
	//@ ensures \result == numPizze;
	//@ ensures numPizze == \old(numPizze) - 1;
	public int consumaPizza() {
		numPizze--;
		return numPizze;
	}
	
	//@ requires arr != null;
	//@ ensures (\forall int x; x>0 && x<arr.length; arr[x] != "");
	//@ ensures (\exists int x; x>0 && x<arr.length; arr[x] == "pizza");
	public void arrayPizza(String[] arr) {
		int i = 0;
		
		/*@ loop_invariant
		  @  i >= 0; @*/
		
		while (i<arr.length) {	
			if(i%2==0)
				arr[i] = "pizza";
			else
				arr[i] = "pizze";
			i++;
		}
	}
	
	public static void main(String[] args) {
		Pizzeria p = new Pizzeria();
		p.numPizze++;
		p.consumaPizza();
		String[] arrpizz = new String[] {"","",""};
		p.arrayPizza(arrpizz);
		System.out.print(arrpizz[0]);
	}
}
