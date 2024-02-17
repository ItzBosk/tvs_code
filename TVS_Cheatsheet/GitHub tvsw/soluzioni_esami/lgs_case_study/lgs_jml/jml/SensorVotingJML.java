

public class SensorVotingJML {
	private /*@ spec_public @*/boolean value;
	private /*@ spec_public @*/boolean valid1;// if channel1 is valid
	private /*@ spec_public @*/boolean valid2;// if channel2 is valid
	private /*@ spec_public @*/boolean valid3;// if channel3 is valid
	private /*@ spec_public @*/boolean valid;// if a sensor is valid

	//  è valido se almeno due sono validi
	//@ public invariant (valid1 && valid2) ||  (valid1 && valid3) || (valid2 && valid3) ==> valid;
	// se sono tutti validi allora è valido
	//@ public invariant (valid1 && valid2 && valid3) ==> valid;
	// se invalido sono invalidi tutti e tre
	//@ public invariant (! valid) ==>(!valid1 && !valid2 && !valid3);
	
	//@ ensures valid;
	public SensorVotingJML() {
		// se metto questa:
		valid = false;
		/* ho questo errore:
		 /home/garganti/Dropbox/code/didattica/tvsw/esempio_completo/jml/SensorVotingJML.java:10: Associated declaration: /home/garganti/Dropbox/code/didattica/tvsw/esempio_completo/jml/SensorVotingJMLUse.java:8: 
			//@ public invariant valid <==> valid1 && valid2 && valid3;
	     */
		//valid = true;
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
	//@ ensures (\old(valid1) && (s1 == s2)) ==> valid1; 
	// se non Ã¨ valid non puÃ² diventare valido
	//@ ensures !\old(valid)  ==> !valid;
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
	// prendo il valore solo se il sensore Ã¨ valido
	//@ requires isValid();
	//@ ensures \result == value;	
	public boolean getValue() {
		return value;
	}

	public /*@ pure */boolean isValid() {
		return valid;
	}
}