package provaJMLKEY;

public class ProvaArray {
	int array[];

	//@ behavior
	//@ ensures array != null;
	//@ diverges true;
	ProvaArray() {
		array = new int[5];
		int i = 0;
		while (i < array.length) {
			array[i] = 0;
			i++;
		}
		
	}
}
