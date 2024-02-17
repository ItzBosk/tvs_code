import nz.ac.waikato.modeljunit.*;
import nz.ac.waikato.modeljunit.coverage.CoverageMetric;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

public class FSMTester {
	public static void main(String args[]) {
		//OnOffMachine model = new OnOffMachine();
		Lampada model = new Lampada();
		Tester tester = //new RandomTester(model);
				new GreedyTester(model);
		GraphListener graph = tester.buildGraph();

		CoverageMetric stateCoverage = new StateCoverage();
		tester.addCoverageMetric(stateCoverage);

		CoverageMetric transitionCoverage = new TransitionCoverage();
		tester.addCoverageMetric(transitionCoverage);

		tester.addListener(new VerboseListener());

		tester.generate(10);

		System.out.println("State coverage = " + stateCoverage.toString());

		System.out.println("Transition coverage = "
				+ transitionCoverage.toString());
	}
}
