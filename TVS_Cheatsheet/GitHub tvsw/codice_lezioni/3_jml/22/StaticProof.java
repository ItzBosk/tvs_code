
public class StaticProof {

	
	//@ requires true;
	//@ ensures \result == x + 10; 
	int foo(int x){
			return x + 10;
	}

}
