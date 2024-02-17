package lgs.sensorvoting;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class SensorVotingIntTest {
	 
	int s1, s2, s3;
	boolean valid;
	
	public SensorVotingIntTest(int s1, int s2, int s3, boolean valid){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.valid = valid;
	}
	
	@Parameters
	 public static Collection<Object[]> data() {
	   Object[][] data = new Object[][] { 		    
			   {0, 0, 0, true},
			   {0, 9, 10, false},
			   {0, 10, 9, false},
			   {9, 0, 9, true},
			   {9, 9, 0, true},
			   {9, 10, 10, true},
			   {10, 0, 10, true},
			   {10, 9, 9, true},
			   {10, 10, 0, true},
			   {9, 10, 0, false},
			   {10, 0, 9, false} };
	   return Arrays.asList(data);
	 }
	@Test
	public void testComputeSensorValue() {
		SensorVotingInt sv = new SensorVotingInt();
		sv.computeSensorValue(s1, s2, s3);
		Assert.assertEquals(valid,sv.isValid());
	}

}
