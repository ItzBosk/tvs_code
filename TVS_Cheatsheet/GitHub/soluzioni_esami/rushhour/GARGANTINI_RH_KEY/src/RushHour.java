

/**
 * The Class RushHour rappressenta lil puzzle rush hour
 */
public class RushHour {
	/*@ spec_public @*/ int gameBoard[][];

	// INVARIANTI:
	// nella griglia ci sono sempre 30 celle vuote
	//@ public invariant (\num_of int i, j; i >=0 && i < 6 && j >= 0 && j < 6; gameBoard[i][j] == 0) == 30;
	// le macchine sono 6
	//@ public invariant (\num_of int i, j; i >=0 && i < 6 && j >= 0 && j < 6; gameBoard[i][j] != 0) == 6;
	// la somma fa sempre 21
	//@ public invariant  (\sum int i, j; i >=0 && i < 6 && j >= 0 && j < 6; gameBoard[i][j]) == 21;
	// non esiste una cella con valore maggiore di 6
	//@ public invariant !(\exists int i, j; i >=0 && i < 6 && j >= 0 && j < 6; gameBoard[i][j] > 6);
	// tutte le celle hanno valore maggiore o uguale a 0
	//@ public invariant (\forall int i, j; i >=0 && i < 6 && j >= 0 && j < 6; gameBoard[i][j] >=0);
	
	/*@ requires true;
	  @ ensures gameBoard[2][2]==1;
	  @*/	
	public RushHour() {

		gameBoard = new int[6][6];

		gameBoard[2][2] = 1; // macchina rossa
		gameBoard[1][5] = 2;
		gameBoard[2][5] = 3;
		gameBoard[3][5] = 4;
		gameBoard[4][1] = 5;
		gameBoard[0][3] = 6;		
	}

	/**
	 * Move car.
	 * 
	 * @param row
	 *            la colonna della macchian da spostare: può essere un numero
	 *            qualsiasi ma viene fatto il controllo che sia tra 0 e 5
	 *            compresi
	 * @param col
	 *            the col
	 * @param dir
	 *            la direzione: 1. verso l'alto; 2. verso destra; 3. verso il
	 *            basso; 4. verso sinistra.
	 * @return true, if successful la macchina è spostata
	 */
	//@ requires !(row < 0 || row > 5 || col < 0 || col > 5 || dir < 1 || dir > 4);
	//@ requires gameBoard[row][col] != 0;
	//@ ensures \result ==> gameBoard[row][col] == 0;
	//@ ensures !\result ==> gameBoard[row][col] != 0;	
	public boolean moveCar(int row, int col, int dir) {
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
			if (col == 5)
				// voglio andare verso destra, ma sono al bordo
				return false;
			nCol = col + 1;
			nRow = row;
		} else if (dir == 3) {
			// verso il basso
			if (row == 5)
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
		if (gameBoard[nRow][nCol] != 0) {
			// la cella di destinazione è già occupata, non posso
			// spostare la macchinina
			return false;
		} else {
			// la cella di destinazione è libera, sposto la macchina.
			gameBoard[nRow][nCol] = gameBoard[row][col];
			//gameBoard[row][col] = 0;
			return true;
		}
	}

	/**
	 * Red car at exit.
	 * 
	 * @return true, se la macchina rossa è in uscita
	 */
	//@ public invariant gameBoard.length == 6;
	//@ public invariant gameBoard[2].length == 6;
	/*@ requires true;
	 @ ensures (\result <==> gameBoard[2][5]==1);
	 @*/
	public boolean redCarAtExit() {
		if (gameBoard[2][5] == 1) {
			return true;
		}
		return false;
	}
}
