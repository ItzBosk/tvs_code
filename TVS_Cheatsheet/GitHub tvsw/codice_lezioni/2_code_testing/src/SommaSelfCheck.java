
public class SommaSelfCheck {

	static int somma(int x, int y){
		int result = x + y;
		assert(result == x + y);
		return result;
	}
}
