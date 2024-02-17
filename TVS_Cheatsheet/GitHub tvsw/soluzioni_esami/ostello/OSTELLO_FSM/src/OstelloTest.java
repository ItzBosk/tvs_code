
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.CoverageMetric;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;


public class OstelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester tester = new GreedyTester(new Ostello());
		tester.buildGraph();
		CoverageMetric trCoverage = new TransitionCoverage();
		tester.addCoverageMetric(trCoverage);
		tester.addListener(new VerboseListener());
		tester.generate(800);
		tester.getModel().printMessage(trCoverage.getName() + " was "+ trCoverage.toString());

	}

}
