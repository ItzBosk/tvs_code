package temp;



/**
 * The Class RushHour rappresenta il puzzle rush hour
 */
public class RushHour {
	int griglia[][];

	public RushHour() {

		griglia = new int[3][3];

		griglia[1][1] = 1; // macchina rossa
		griglia[1][2] = 2;

	}

	/**
	 * Move car.
	 *
	 * @param row la colonna della macchian da spostare: può essere un numero qualsiasi ma viene fatto il controllo che sia tra 0 e 5 compresi
	 * @param col the col
	 * @param dir la direzione: 1. verso l'alto; 2. verso destra; 3. verso il basso; 4. verso sinistra.
	 * @return true, if successful la macchina è spostata 
	 */
	public boolean moveCar(int row, int col, int dir) {
		if (row < 0 || row > 2 || col < 0 || col > 2 || dir < 1 || dir > 4) {
			// in tal caso ho sbagliato gli indici oppure ho indicato una
			// direzione inesistente
			return false;
		}
		if (griglia[row][col] == 0) {
			// in tal caso ho selezionato una casella vuota, non posso spostare
			// macchine
			return false;
		} else {
			int nRow, nCol; // nuove coordinate della macchina
			if (dir == 1) {
				// verso l'alto
				if (row == 0)
					// voglio andare verso l'alto, ma sono al bordo
					return false;
				nRow = row - 1;
				nCol = col;
			} else if (dir == 2) {
				// verso destra
				if (col == 2)
					// voglio andare verso destra, ma sono al bordo
					return false;
				nCol = col + 1;
				nRow = row;
			} else if (dir == 3) {
				// verso il basso
				if (row == 2)
					// voglio andare verso il basso, ma sono al bordo
					return false;
				nRow = row + 1;
				nCol = col;
			} else {
				assert (dir == 4);
				// verso sinistra
				if (col == 0)
					// in tal caso voglio andare verso sinistra, ma sono al
					// bordo
					return false;
				nCol = col - 1;
				nRow = row;
			}
			if (griglia[nRow][nCol] != 0) {
				// la cella di destinazione è già occupata, non posso
				// spostare la macchinina
				return false;
			} else {
				// la cella di destinazione è libera, sposto la macchina.
				griglia[nRow][nCol] = griglia[row][col];
				griglia[row][col] = 0;
				return true;
			}
		}
	}

	/**
	 * Red car at exit.
	 *
	 * @return true, se la macchina rossa è in uscita
	 */
	public boolean redCarAtExit() {
		if (griglia[1][2] == 1) {
			return true;
		}
		return false;
	}
}
