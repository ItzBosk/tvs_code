

public class SensorVotingJML {
	private /*@ spec_public @*/boolean value;
	private /*@ spec_public @*/boolean valid1;// if channel1 is valid
	private /*@ spec_public @*/boolean valid2;// if channel2 is valid
	private /*@ spec_public @*/boolean valid3;// if channel3 is valid
	private /*@ spec_public @*/boolean valid;// if a sensor is valid

	//@ public invariant valid1 && valid2 && valid3 ==> valid;
	
	//@ ensures valid;
	public SensorVotingJML() {
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
	// se un canale era valido, e il suo ingresso coincide, continua ad essere valido 
	//@ ensures (\old(valid1) && (s1 == s2) && (s1 == s3)) ==> valid1; 
	// se non è valid non può diventare valido
	//@ ensures (!\old(valid))  ==> !valid;
	// idem anche per tutti gli altri
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
				} else if (s2 != s1 && s1 == s3) {
					// s2 invalid
					valid2 = false;
					value = s3;
				} else if (s3 != s1 && s1 == s2) {
					// s3 invalid
					valid3 = false;
					value = s1;
				} else {
				}
			} else if (!valid1) {
				if (s2 == s3) {
					value = s2;
				} else {
					valid2 = false;
					valid3 = false;
					valid = false;
				}
			} else if (!valid2) {
				if (s1 == s3) {
					value = s1;
				} else {
					valid1 = false;
					valid3 = false;
					valid = false;
				}
			} else if (!valid3) {
				if (s1 == s2) {
					value = s2;
				} else {
					valid1 = false;
					valid2 = false;
					valid = false;
				}
			}
		}
	}
	// prendo il valore solo se il sensore è valido
	//@ requires isValid();
	//@ ensures \result == value;	
	public boolean getValue() {
		return value;
	}

	public /*@ pure @*/boolean isValid() {
		return valid;
	}
}