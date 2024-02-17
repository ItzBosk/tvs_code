
import nz.ac.waikato.modeljunit.GraphListener;
import nz.ac.waikato.modeljunit.RandomTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.CoverageMetric;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

public class RushHourModelTester
{
  public static void main(String args[])
  {
    RushHourModel model = new RushHourModel();
    Tester tester = new RandomTester(model);
    GraphListener graph = tester.buildGraph();


    CoverageMetric stateCoverage = new StateCoverage();
    tester.addCoverageMetric(stateCoverage);

    CoverageMetric transitionCoverage = new TransitionCoverage();
    tester.addCoverageMetric(transitionCoverage);

    tester.addListener(new VerboseListener());

    tester.generate(20);

    System.out.println("State coverage = "+stateCoverage.toString());

    System.out.println("Transition coverage = "+transitionCoverage.toString());
  }
}
