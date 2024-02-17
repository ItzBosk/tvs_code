
public class BoundeStack {

	Object[] elems;
	
	//@requires n>= 0;
	//@ensures elems != null && elems.length == n;
	public BoundeStack(int n){
		elems = new Object[n];
	}
}
