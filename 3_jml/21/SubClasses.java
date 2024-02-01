class A{
	
	//@requires x >0;
	//@ensures W; 
	public void m(int x) {}
}

class B extends A{
	//@ also
	//@requires -5 <= x && x <= 0;
	//@ensures Z; 	
	public void m(int x) {
		assert x > 0 : " x sbagliato";
	}	
	
	//@ requires true;
	//@ ensures \result == x + 1; 
	public int plus1(int x) {
		return x +1;
	}
	
}

public class SubClasses {

}
