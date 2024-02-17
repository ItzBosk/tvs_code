package counter;

public class Persona {
	
	Persona(String cf){
		if (! validoCF(cf))
			throw new RuntimeException();
	}

	static private boolean validoCF(String cf) {
		//if (cf.length() != 16) return false;
		return true;
	}

}
