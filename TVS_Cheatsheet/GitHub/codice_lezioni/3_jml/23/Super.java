class Persona{
	//@ ensures \result.length() == 3;
	public String codiceFiscale(){return "ABC";}
}
class Studente extends Persona{
	public String codiceFiscale(){return "";}
}



public class Super {
	
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println(p.codiceFiscale());
		Persona p2 = new Studente();
		System.out.println(p2.codiceFiscale());
	}

}
