package esempio;

// contatore inzialmente è zero e può essere incrementato
// o ripaortato a zero
public class Counter {

	//@ invariant counter>=0;
	int counter;
	
	//@ requires true;
	//@ ensures counter ==0;
	Counter(){
		counter = 0;
	}
	//@ ensures counter == \old(counter)+1;
	//@ ensures counter>0;
	void inc() {
		counter ++;
	}
	
	
	
	
}
