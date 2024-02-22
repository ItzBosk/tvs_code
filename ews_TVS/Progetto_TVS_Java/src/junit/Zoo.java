package junit;

public class Zoo {
	
	static int MAX_MEDICINE = 3; 	// stock max medicine  
	
	// array di 3 valori:
	// statoAnimale[0] = stato ZEBRA
	// statoAnimale[1] = stato LEONE
	// statoAnimale[2] = stato ELEFANTE
	
	// statoAnimale[i] :
		// = 0 -> SANO
		// = 1 -> MALATO
		// = 2 -> AFFAMATO
	
	int[] statoAnimale;
	int medicine;
	int time;
	
	public Zoo() {
		statoAnimale = new int[3];
		medicine = MAX_MEDICINE;		// full medicine
		time = 3;
		
		for (int i = 0; i < statoAnimale.length; i++) {
			statoAnimale[i] = 0;
		}
	}
	
	public void manageAnimali() {
		// check se ci sono medicine
		if (medicine == 1) {
			medicine = MAX_MEDICINE;
		}
		
		// se qualche animale malato viene curato
		for (int i = 0; i < statoAnimale.length; i++) {
			if (statoAnimale[i] == 1) {
				statoAnimale[i] = 0;
			}
		}
		
		switch (time) {
		case 0:
			// se zebra non malata, viene sfamata
			if (statoAnimale[0] != 1) {
				statoAnimale[0] = 0;
			}
			// se leone non malato, avrà fame
			if (statoAnimale[1] != 1) {
				statoAnimale[1] = 2;
			}
			time += 1;	// stato successivo
			break;
		case 1:
			// se leone non malato, viene sfamato
			if (statoAnimale[1] != 1) {
				statoAnimale[1] = 0;
			}
			// se elefante non malato, avrà fame
			if (statoAnimale[2] != 1) {
				statoAnimale[2] = 2;
			}
			time += 1;	// stato successivo
			break;
		case 2:
			// se elefante non malato, viene sfamato
			if (statoAnimale[2] != 1) {
				statoAnimale[2] = 0;
			}
			time += 1;	// stato successivo
			break;
		case 3:
			// se zebra non malata, avrà poi fame
			if (statoAnimale[0] != 1) {
				statoAnimale[0] = 2;
			}
			time = 0;
			break;
		}
	}
	
	public void malato(int animale) {
		// se animale malato
		if (medicine != 0) {
			statoAnimale[animale] = 1;
			medicine -= 1;
		}
		time += 1;
	}
	
	void printZoo() {
		System.out.println("Stato zoo:");
		System.out.println("time = " + time + ", medicine = " + medicine);
		for (int i = 0; i < statoAnimale.length; i++) {
			switch (i) {
			case 0:
				// stampo zebra
				System.out.println("Zebra = " + printStato(statoAnimale[i]));
				break;
			case 1:
				// stampo leone
				System.out.println("Leone = " + printStato(statoAnimale[i]));
				break;
			case 2:
				// stampo elefante
				System.out.println("Elefante = " + printStato(statoAnimale[i]));
				break;
			}
		}
		System.out.println("----------------------------------");
	}
	
	String printStato(int stato) {
		String result = "";
		switch (stato) {
		case 0:
			result += "SANO";
			break;
		case 1:
			result += "MALATO";
			break;
		case 2:
			result += "AFFAMATO";
			break;	
		}
		return result;
	}
	
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.printZoo();
		z.manageAnimali();
//		z.printZoo();
//		z.malato(0);
//		z.printZoo();
//		z.malato(1);
//		z.manageAnimali();
//		z.printZoo();
	}
}
