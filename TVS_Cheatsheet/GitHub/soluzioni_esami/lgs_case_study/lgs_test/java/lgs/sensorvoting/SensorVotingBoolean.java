package lgs.sensorvoting;

public class SensorVotingBoolean {
	private boolean value;
	private boolean valid1;// if channel1 is valid
	private boolean valid2;// if channel2 is valid
	private boolean valid3;// if channel3 is valid
	private boolean valid;// if a sensor is valid

	public SensorVotingBoolean() {
		valid = true;
		valid1 = true;
		valid2 = true;
		valid3 = true;
	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param s3
	 * @return
	 */
	public void computeSensorValue(boolean s1, boolean s2, boolean s3) {
		if (valid) {
			if (valid1 && valid2 && valid3) {
				// if the three channels are considered as valid
				if (s1 == s2 && s2 == s3) {
					value = s1;
				} else if (s1 != s2 && s2 == s3) {
					// s1 invalid
					valid1 = false;
					value = s2;
					System.out.println("s1 invalid");
				} else if (s2 != s1 && s1 == s3) {
					// s2 invalid
					valid2 = false;
					value = s3;
					System.out.println("s2 invalid");
				} else if (s3 != s1 && s1 == s2) {
					// s3 invalid
					valid3 = false;
					value = s1;
					System.out.println("s3 invalid");
				} else {
					// non può mai accadere con i booleani
					assert(false);
				}
			} else if (!valid1) {
				if (s2 == s3) {
					value = s2;
				} else {
					valid2 = false;
					valid3 = false;
					valid = false;
					System.out.println("s2 and s3 invalid");
				}
			} else if (!valid2) {
				if (s1 == s3) {
					value = s1;
				} else {
					valid1 = false;
					valid3 = false;
					System.out.println("s1 and s3 invalid");
					valid = false;
				}
			} else if (!valid3) {
				if (s1 == s2) {
					value = s2;
				} else {
					valid1 = false;
					valid2 = false;
					System.out.println("s1 and s2 invalid");
					valid = false;
				}
			}
		}
	}

	public boolean getValue() {
		return value;
	}

	public boolean isValid() {
		return valid;
	}
}