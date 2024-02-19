package talkshow_JUNIT;

import java.util.Random;

public class TalkShow {

	static int MAX_TEMPO_PARLA = 5;

	static int MAX_TEMPO_ATTESA = 7;

	Persona[] persone;

	public TalkShow() {
		persone = new Persona[6];

		// stato: 0 = ascolta, 1 = attesa, 2 = parla
		for (int i = 0; i < persone.length; i++) {
			persone[i] = new Persona(MAX_TEMPO_PARLA, MAX_TEMPO_ATTESA);
		}
	}

	public void gestisciPersone() {
		for (Persona p : persone) {
			// sta parlando
			if (p.stato == 2) {
				if (p.tempoParla == 0) {
					p.stato = 0;
					p.microfono = false;
				} else {
					p.tempoParla -= 1;
				}
			}
			// in attesa
			if (p.stato == 1) {
				if (p.tempoAttesa == 0) {
					p.stato = 0;
				} else {
					p.tempoAttesa -= 1;
				}
			}
			// ascolta e vuole parlare
			if (p.stato == 0 && p.vuoleParlare == true) {
				p.stato = 1;
				p.tempoAttesa = MAX_TEMPO_ATTESA;
			}
		}
	}

	public void scegliNextParla() {
		Random rand = new Random();
		boolean trovato = false;
		int p = 0;
		while (!trovato) {
			p = rand.nextInt(5);
			if (persone[p].stato == 1 && persone[p].vuoleParlare == true) {
				trovato = true;
				persone[p].stato = 2;
				persone[p].microfono = true;
				persone[p].tempoParla = MAX_TEMPO_PARLA;
			}
		}
	}

	public static void main(String[] args) {
		TalkShow t = new TalkShow();
		t.gestisciPersone();
		t.statoTalkShow();
		t.persone[0].vuoleParlare = true;
		t.scegliNextParla();
		t.gestisciPersone();
		t.statoTalkShow();
	}

	public void statoTalkShow() {
		System.out.println("Stato talkshow:");
		for (int i = 0; i < persone.length; i++) {
			System.out.println("P" + i + ": tempoAttesa = " + persone[i].tempoAttesa + "," + " tempoParla = "
					+ persone[i].tempoParla + "," + " stato = " + persone[i].stato + "," + " microfono = "
					+ String.valueOf(persone[i].microfono) + "," + " vuoleParlare = "
					+ String.valueOf(persone[i].vuoleParlare));
		}
		System.out.println("-----------------------------------------------------------");
	}
}

class Persona {
	int tempoParla, tempoAttesa, stato;
	boolean microfono, vuoleParlare;

	public Persona(int maxParla, int maxAttesa) {
		tempoAttesa = maxAttesa;
		tempoParla = maxParla;
		stato = 0;
		microfono = false;
		vuoleParlare = false;
	}
}
