
public class NullPointer {

	
	void foo(String s){
		if (s != null || s.length() > 0) {
			System.out.println(s.length());
		}
	}
	
}
