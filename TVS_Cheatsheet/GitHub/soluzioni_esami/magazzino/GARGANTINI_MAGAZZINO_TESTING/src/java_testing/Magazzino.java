package java_testing;

public class Magazzino {

	int[] prodotti;

	public Magazzino() {
		prodotti = new int[5];
	}

	public boolean insert(int productIndex, int addQuantity) {
		// controlla che i parametri siano corretti
	 	if (productIndex < 0 || productIndex > 4 || addQuantity < 1
				|| addQuantity > 10 || prodotti[productIndex] + addQuantity > 100)
			return false;
		prodotti[productIndex] += addQuantity;
		return true;
	}

	public boolean  isFull(int productIndex){
		if (productIndex >= 0 && productIndex<=4)
			return prodotti[productIndex] == 100;
		return true;
	}
	public boolean isFull(){
		if (isFull(0) && isFull(1) && isFull(2) && isFull(3) && isFull(4))
			return true;
		return false;
	}
	
	
}
