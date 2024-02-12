package codecover;

public class Lift {

	public static boolean isAllowed(int person, double weight) {
		if ((person < 4) && (weight <= 400) 
				|| (person == 0) && (weight <= 1000)) {
			return true;
		} else {
			return false;
		}

	}

}
