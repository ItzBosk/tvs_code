package jml_temp;

public class UsoQuantificatori {

	// precondizione: tutti i numeri in a sono > = 0
	//@ requires (\forall int i; 0 <= i && i < a.length; a[i] >= 0);
	// esiste un numero in a che vale 100
	//@ requires (\exists int i; 0 <= i && i < a.length; a[i] == 100);
	// ho 10 elementi in a che sono 9
	//@ requires (\num_of int i; 0 <= i && i < a.length; a[i] == 9) == 10;
	// neanche un numero è dispari
	//@ requires ! (\exists int i; 0 <= i && i < a.length; a[i]%2 != 0);
	void foo(int[]a){
		
		
	}
	
}
