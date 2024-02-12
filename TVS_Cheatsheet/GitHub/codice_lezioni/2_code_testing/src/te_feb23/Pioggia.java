package te_feb23;

public class Pioggia {

	private float[] pioggia = new float[12];

	// cambia il valore della pioggia del mese
	// mese va da 1 a 12
	// valore deve essere >= 0 e < 100 se il mese > 50 
	public boolean set(int mese, int valore) {
		if (mese < 1 || mese > 12 || valore < 0 || 
				(valore > 100 && pioggia[mese - 1] > 50))
			return false;
		pioggia[mese - 1] = valore;
		return true;
	}
}
