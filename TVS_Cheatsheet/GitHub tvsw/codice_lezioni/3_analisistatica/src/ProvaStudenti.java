import java.util.HashSet;
import java.util.Set;

class aaaa{}

class Studente{

	int matricola;
	public Studente(int m) { matricola = m;}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Studente)
			return matricola == ((Studente)obj).matricola;
		return false;
	}
	@Override
	public int hashCode() {
		//throw new RuntimeException("hash code not implemented");
		return Integer.hashCode(matricola);
	}
	
	int Studente() {return 6;}
}


public class ProvaStudenti {
	
	public static void main(String[] args) {
		Studente s1 = new Studente(100);
		Studente s2 = new Studente(100);
		System.out.println(s1.equals(s2));
		Set<Studente> classe = new HashSet<>();
		classe.add(s1);
		System.out.println(classe.contains(s2));
		String nome = "pippo";
		if (s1.equals(nome)) {
			System.out.println("studente s1 è pippo");
		}
		
	}

}
