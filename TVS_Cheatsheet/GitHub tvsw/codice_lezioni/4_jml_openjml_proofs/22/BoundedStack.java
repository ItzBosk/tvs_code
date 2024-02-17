
public class BoundedStack {

	 /*@ spec_public @*/ Object[] elems;
	
	//@requires n>= 0;
	//@ensures elems != null && elems.length == n;
	public BoundedStack(int n){
		elems = new Object[n];
	}
}
