package junit;

public class ZooReviewed {

	static final int MAX_MEDICINE = 3; // stock max medicine

	// array di 3 valori:
	// statoAnimale[0] = stato ZEBRA
	// statoAnimale[1] = stato LEONE
	// statoAnimale[2] = stato ELEFANTE

	int[] statoAnimale = new int[3];
	int medicine = MAX_MEDICINE;// totale medicine disponibili nello zoo
	int time = 3;// istante temporale del ciclo

	public ZooReviewed() {
		// inizialmente ogni animale è sano
		for (int i = 0; i < statoAnimale.length; i++) {
			statoAnimale[i] = 0; // SANO
		}
	}

	// gestione dello zoo
	public void manageAnimali() {
		if (medicine == 1) {
			medicine = MAX_MEDICINE;
		}
		// se qualche animale malato viene curato
		for (int i = 0; i < statoAnimale.length; i++) {
			if (statoAnimale[i] == 1) { // MALATO
				statoAnimale[i] = 0; // SANO
			}
		}
		// gestione ciclo animali
		updateStatoAnimale();
	}

	// gestione zebra
	private void updateZebra() {
		// se zebra non malata, viene sfamata
		if (statoAnimale[0] != 1) {
			statoAnimale[0] = 0;
		}
		// se leone non malato, avrà fame
		if (statoAnimale[1] != 1) {
			statoAnimale[1] = 2;
		}
	}

	// gestione leone
	private void updateLeone() {
		// se leone non malato, viene sfamato
		if (statoAnimale[1] != 1) {
			statoAnimale[1] = 0;
		}
		// se elefante non malato, avrà fame
		if (statoAnimale[2] != 1) {
			statoAnimale[2] = 2;
		}
	}

	// gestione elefante
	private void updateElefante() {
		// se elefante non malato, viene sfamato
		if (statoAnimale[2] != 1) {
			statoAnimale[2] = 0;
		}
	}

	// reinizializza ciclo
	private void resetZebra() {
		// se zebra non malata, avrà poi fame
		if (statoAnimale[0] != 1) {
			statoAnimale[0] = 2;
		}
	}

	// gestione animale in base in base all'istante temporale
	private void updateStatoAnimale() {
		switch (time) {
		case 0:
			updateZebra();
			break;
		case 1:
			updateLeone();
			break;
		case 2:
			updateElefante();
			break;
		case 3:
			resetZebra();
			break;
		}
		time = (time + 1) % 4;
	}

	// imposta un animale come malato
	public void malato(int animale) {
		// Aggiunta di una validazione dell'input per assicurarsi che l'indice
		// dell'animale sia valido
		if (animale < 0 || animale >= statoAnimale.length) {
			throw new IllegalArgumentException("L'indice dell'animale è fuori dal range consentito.");
		}
		// Controllo se ci sono medicine disponibili prima di procedere
		if (medicine <= 0) {
			throw new IllegalStateException("Non ci sono medicine disponibili.");
		}
		statoAnimale[animale] = 1; // MALATO
		medicine--;
		time = (time + 1) % 4;
	}

	// stampa istante, stato medicine, e stato di ogni animale
	void printZoo() {
		System.out.println("Stato zoo:");
		System.out.println("time = " + time + ", medicine = " + medicine);
		for (int i = 0; i < statoAnimale.length; i++) {
			System.out.println(getNomeAnimale(i) + " = " + printStato(statoAnimale[i]));
		}
		System.out.println("----------------------------------");
	}

	// stampa animale in base all'indice
	private String getNomeAnimale(int index) {
		switch (index) {
		case 0:
			return "Zebra";
		case 1:
			return "Leone";
		case 2:
			return "Elefante";
		default:
			return "Sconosciuto";
		}
	}

	// stampa stato animale in base all'indice
	private String printStato(int stato) {
		switch (stato) {
		case 0:
			return "SANO";
		case 1:
			return "MALATO";
		case 2:
			return "AFFAMATO";
		default:
			return "Sconosciuto";
		}
	}

	public static void main(String[] args) {
		ZooReviewed z = new ZooReviewed();
		z.printZoo();
		z.manageAnimali();
		z.malato(8);
	}
}
