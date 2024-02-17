public class Ostello {

	private boolean lettiperStanza[][] = new boolean[10][5];

	public Ostello() {
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 5; j++)
				lettiperStanza[i][j] = true;
	}

	public boolean checkin(int stanza, int letto) {
		// occupa letto specifico

		if (stanza < 0 || stanza > 9 || letto < 0 || letto > 4)
			return false;
		if (lettiperStanza[stanza][letto]) {
			lettiperStanza[stanza][letto] = false;
			return true;
		}
		return false;

	}

	public boolean checkin(int stanza) {
		// occupa il primo letto libero della stanza
		if (stanza < 0 || stanza > 9)
			return false;
		for (int i = 0; i < 5; i++) {
			if (lettiperStanza[stanza][i]) {
				lettiperStanza[stanza][i] = false;
				return true;
			}
		}
		return false;

	}

	public boolean libera(int stanza) {
		// una stanza è libera se ha tutti i letti liberi
		if (stanza < 0 || stanza > 9)
			return false;
		for (int i = 0; i < 5; i++) {
			if (!lettiperStanza[stanza][i]) {
				return false;
			}
		}
		return true;

	}

}
