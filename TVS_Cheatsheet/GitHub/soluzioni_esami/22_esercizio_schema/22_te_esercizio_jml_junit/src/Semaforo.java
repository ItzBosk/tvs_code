/* Tema Esame: Schema - Esercizio 6 */

// ATTENZIONE: NON usare gli ENUMERATIVI con JML KeY perché
// KeY non riesce a dimostrare nulla se si utilizzano

public class Semaforo {

	/*@ spec_public @*/ final static int ROSSO = 0;
	/*@ spec_public @*/ final static int VERDE = 1;
	/*@ spec_public @*/ final static int GIALLO = 2;

	// ColoreSemaforo è un array di 2 posizioni che contiene il colore
	// del semaforo relativo alla sua posizione (0=SEM1, 1=SEM2)
	/*@ spec_public @*/ private int[] semaforo;

	// INVARIANTI:
	// 1) mi assicuro che i semafori siano sempre 2
	//@ public invariant this.semaforo.length==GIALLO;
	// 2) mi assicuro che semaforo possa assumere solo i valori definiti
	// nell'invariante ColoreSemaforo
	//@ public invariant (\forall int i; 0<=i && i<2; semaforo[i]==ROSSO || semaforo[i]==VERDE || semaforo[i]==GIALLO);

	// 3) se uno non è rosso l'altro lo è:
	//@ public invariant semaforo[0]!=ROSSO ==> semaforo[1]==ROSSO;
	//@ public invariant semaforo[1]!=ROSSO ==> semaforo[0]==ROSSO;

	// POSTCONDIZIONI: mi assicuro che tutti i semafori all'inizio siano ROSSI
	//@ ensures ( this.semaforo[0]==ROSSO && this.semaforo[1]==ROSSO);
	public Semaforo() {
		this.semaforo = new int[] { ROSSO, ROSSO };
		// violazione postcondition
		//this.semaforo = new int[] { VERDE, ROSSO };
	}

	// PRECONDIZIONE: numSemaforo può essere solo 0 o 1
	//@ requires ( numSemaforo==0 || numSemaforo==1);

	// POSTCONDIZIONI:
	// 1) Se sono entrambi rossi, numSemaforo è diventato verde
	//@ ensures ( ( \old(semaforo[0]==ROSSO) && \old(semaforo[1]==ROSSO) ) ==> semaforo[numSemaforo]==VERDE );

	// 2a) Se numSemaforo era verde, allora numSemaforo è diventato giallo
	//@ ensures ( \old(semaforo[numSemaforo]==VERDE) ==> semaforo[numSemaforo]==GIALLO);

	// 2b) Se numSemaforo era giallo, allora numSemaforo è diventato rosso
	//@ ensures ( \old(semaforo[numSemaforo]==GIALLO) ==> semaforo[numSemaforo]==ROSSO);

	// 3) Quando numSemaforo è rosso e l'altro semaforo non è rosso, se chiedo di
	// cambiare il
	// colore di numSemaforo allora il colore di numSemaforo NON cambia colore
	// NB: 1-numSemaforo = mi da il numero dell'altro semaforo
	//@ ensures ( ( \old(semaforo[numSemaforo]==ROSSO) && \old(semaforo[1-numSemaforo]!=0) )  ==> semaforo[numSemaforo]==ROSSO);
	public void cambiaColore(int numSemaforo) {
		// se sono entrambi rossi, metto a verde numSemaforo
		if (semaforo[0] == ROSSO && semaforo[1] == ROSSO) {
			semaforo[numSemaforo] = VERDE;
		}
		// se chiedo di cambiare un semaforo che non è rosso, lo cambio
		else if (semaforo[numSemaforo] != ROSSO) {
			// verde -> giallo
			if (semaforo[numSemaforo] == VERDE) {
				semaforo[numSemaforo] = GIALLO;
			}
			// giallo -> rosso
			else if (semaforo[numSemaforo] == GIALLO) {
				semaforo[numSemaforo] = ROSSO;
			}
		}
	}
	
	// aggiungo un metodo per i casi di test
	//@ requires ( numSemaforo==0 || numSemaforo==1);
	// TODO add postcondition
	public int getColoreSemaforo(int numSemaforo) {
		return semaforo[numSemaforo];
	}
	
	
	
}
