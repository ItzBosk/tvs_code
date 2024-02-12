import java.util.Random;


public class ProvaAllarme {

	public static void main(String[] args) {
		Allarme a = new Allarme();
		// set status of alamrs randomly
		Random rnd = new Random();
		for(int i = 1; i <100; i++){
			a.setSensore(rnd.nextInt(4), rnd.nextBoolean());
			// ?
			if (a.pericolo()) System.err.println("PERICOLO !!!");;
		}
		
		
	}

}
