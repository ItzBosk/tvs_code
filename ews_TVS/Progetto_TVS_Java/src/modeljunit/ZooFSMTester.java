package modeljunit;

import nz.ac.waikato.modeljunit.*;
import nz.ac.waikato.modeljunit.coverage.CoverageMetric;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

public class ZooFSMTester {
    public static void main(String[] args) {
        ZooFSM model = new ZooFSM();
        Tester tester = new GreedyTester(model);
        tester.buildGraph();
        
        CoverageMetric stateCoverage = new StateCoverage();
        tester.addCoverageMetric(stateCoverage);

        CoverageMetric transitionCoverage = new TransitionCoverage();
        tester.addCoverageMetric(transitionCoverage);

        tester.addListener(new VerboseListener());
        tester.addListener(new StopOnFailureListener()); // Stop testing on the first failure

        tester.generate(10); // Genera un numero maggiore di test per esplorare più percorsi

        System.out.println("State coverage = " + stateCoverage.toString());
        System.out.println("Transition coverage = " + transitionCoverage.toString());
    }
}
