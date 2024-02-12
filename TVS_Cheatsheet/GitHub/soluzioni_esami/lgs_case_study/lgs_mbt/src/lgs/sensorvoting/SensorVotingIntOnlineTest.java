package lgs.sensorvoting;
/**
Copyright (C) 2006 Mark Utting
This file is part of the CZT project.

The CZT project contains free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

The CZT project is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with CZT; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */


import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.LookaheadTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;
import nz.ac.waikato.modeljunit.coverage.CoverageMetric;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

/**
 * Simple example of a finite state machine (FSM) for testing.
 */
public class SensorVotingIntOnlineTest implements FsmModel{
	
	enum State {ALL_VALID, V1_INVALID, V2_INVALID, V3_INVALID, INVALID}
	
	State state;
	
	SensorVotingInt sut = new SensorVotingInt();
	
	
	@Action 
	public void allValid(){
		System.out.println("all are valid");
		sut.computeSensorValue(10, 10, 10);
		if (state == State.ALL_VALID) state = State.ALL_VALID;
	}

	
	@Action 
	public void V1Wrong(){
		System.out.println("v1 becomes wrong");
		sut.computeSensorValue(10, 9, 9);
		if (state == State.ALL_VALID) state = State.V1_INVALID;
		else{
			state = State.INVALID;
		}
	}
	
	public boolean V1WrongGuard(){
		return state != State.V1_INVALID;
	}
	
	@Action 
	public void V2Wrong(){
		System.out.println("v2 becomes wrong");
		sut.computeSensorValue(9, 10, 9);
		if (state == State.ALL_VALID) state = State.V2_INVALID;
		else{
			state = State.INVALID;
		}
	}
	
	public boolean V2WrongGuard(){
		return state != State.V2_INVALID;
	}
	@Action 
	public void V3Wrong(){
		System.out.println("v3 becomes wrong");
		sut.computeSensorValue(10, 10, 9);
		if (state == State.ALL_VALID) state = State.V3_INVALID;
		else{
			state = State.INVALID;
		}
	}
	
	public boolean V3WrongGuard(){
		return state != State.V3_INVALID;
	}

	
	
	@Override
	public Object getState() {
		System.out.println("checking sut state");
		if (state == State.INVALID && sut.isValid()) throw new RuntimeException();
		if (state != State.INVALID && !sut.isValid()) throw new RuntimeException();
		return state;
	}

	@Override
	public void reset(boolean arg0) {
		state = State.ALL_VALID;
		sut = new SensorVotingInt();		
	}
	
	

	/**
	 * This main method illustrates how we can use ModelJUnit to generate a
	 * small test suite. If we had an implementation of this model that we
	 * wanted to test, we would extend each of the above methods so that they
	 * called the methods of the implementation and checked the results of those
	 * methods.
	 * 
	 * We also report the transition coverage of the model.
	 */
	public static void main(String args[]) {
		// create our model and a test generation algorithm
		//Tester tester = new RandomTester(new FSM());
		//Tester tester = new GreedyTester(new SensorVotingIntOnlineTest());
		Tester tester = new LookaheadTester(new SensorVotingIntOnlineTest());

		// build the complete FSM graph for our model, just to ensure
		// that we get accurate model coverage metrics.
		tester.buildGraph();

		// set up our favourite coverage metric
		CoverageMetric trCoverage = new TransitionCoverage();
		tester.addCoverageMetric(trCoverage);

		// ask to print the generated tests
		tester.addListener(new VerboseListener());

		// generate a small test suite of 20 steps (covers 4/5 transitions)
		tester.generate(20);

		tester.getModel().printMessage(
				trCoverage.getName() + " was " + trCoverage.toString());
	}

}