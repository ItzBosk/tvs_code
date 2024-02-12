import org.junit.Assert;



public class SensorVotingJMLUse {
	
	
	public static void main(String[] args) {
		SensorVotingJML sv = new SensorVotingJML();
		sv.computeSensorValue(true, false, true);
		sv.computeSensorValue(true, false, false);
		Assert.assertFalse(sv.isValid());
		// questo mi da errore
		/*/home/garganti/Dropbox/code/didattica/tvsw/esempio_completo/jml/SensorVotingJML.java:92: JML precondition is false
		//@ requires isValid();*/
		System.out.println(sv.getValue());
	}
	
}