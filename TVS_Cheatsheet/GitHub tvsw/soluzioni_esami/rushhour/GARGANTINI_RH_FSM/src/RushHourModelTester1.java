
import nz.ac.waikato.modeljunit.RandomTester;
import nz.ac.waikato.modeljunit.Tester;



public class RushHourModelTester1 {
	public static void main(String args[])
	  {
	    // create your model and a test generation algorithm
	    Tester tester = new RandomTester(new RushHourModel());
	
	    // ask to print the generated tests
	    tester.addListener("verbose");
	
	    // generate a small test suite of 20 steps
	    tester.generate(200);
	  }
}