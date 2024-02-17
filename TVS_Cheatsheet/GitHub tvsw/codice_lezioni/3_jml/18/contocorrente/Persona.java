package contocorrente;

class Studente extends Persona{
	Studente(String s) {
		super(s);
	}	
}

public class Persona {
	
	/*@ non_null @*/ String name;
	
	//@ requires validName(s);
	Persona(String s){
		assert s.length() > 2 : "nome troppo corto";
		//@ assert s.length() > 2;
		name = s;
	}
	
	public static /*@ pure @*/boolean validName(String s){
		return false;
	}
	

	public static void main(String[] args) {
		//Persona p = new Persona("AGGGGG");
		//System.out.println(p.name);
		//p.name = null;
		Studente s = new Studente("llh");
	}
	
}
