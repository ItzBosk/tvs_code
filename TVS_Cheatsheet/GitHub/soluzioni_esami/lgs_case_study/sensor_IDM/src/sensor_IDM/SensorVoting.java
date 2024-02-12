package sensor_IDM;

public class SensorVoting {

	// validity dei tre canali
	boolean v1 = true;
	boolean v2 = true;
	boolean v3 = true;

	int readChannels(int c1, int c2, int c3) {
		if (v1 && v2 && v3) {
			if (c1 == c2 && c2 == c3) {
				return c1;
			} else if (c1 == c2) {
				// c2!=c3 e c1!=c3
				v3 = false;
				return c1;
			} else if (c1 == c3) {
				v2 = false;
				return c1;
			} else {
				// c2 == c3 e c1 diverso
				v1 = false;
				return c2;
			}
		} else {
			// TODO
			return 0;
		}
	}

}
