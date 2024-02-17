package rushhour;

import java.util.Random;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.RandomTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.coverage.CoverageMetric;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;

/**
 * versione semplificata di RushHour, muovo solo l'auto 1
 */
public class RushHourFSM implements FsmModel {

	// posizione auto 1
	int m1_c, m1_r;
	
	RushHour sut = new RushHour();

	public RushHourFSM() {
		m1_c = 2;
		m1_r = 2;
		if (sut.griglia[m1_r][m1_c] != 1)
			System.err.println("in questa posizione non c'è m1");
	}

	@Override
	public Object getState() {
		return "m1:[" + m1_r + "," + m1_c + "]";
	}

	// 1. verso l'alto; 2. verso destra; 3. verso il basso; 4. verso sinistra
	@Action
	public void move_m1_up() {
		sut.moveCar(m1_r, m1_c, 1);
		m1_r--;
		if (sut.griglia[m1_r][m1_c] != 1)
			System.err.println("up in questa posizione non c'è m1");
	}

	public boolean move_m1_upGuard() {
		return m1_r > 0 && sut.griglia[m1_r-1][m1_c] == 0;
	}

	@Action
	public void move_m1_dx() {
		sut.moveCar(m1_r, m1_c, 2);
		m1_c++;
		if (sut.griglia[m1_r][m1_c] != 1)
			System.err.println("dx in questa posizione non c'è m1");
	}

	public boolean move_m1_dxGuard() {
		return (m1_c < 5) && sut.griglia[m1_r][m1_c+1] == 0;
	}

	@Action
	public void move_m1_down() {
		sut.moveCar(m1_r, m1_c, 3);
		m1_r++;
		if (sut.griglia[m1_r][m1_c] != 1)
			System.err.println("dwon in questa posizione non c'è m1");
	}

	public boolean move_m1_downGuard() {
		return m1_r < 5 && sut.griglia[m1_r+1][m1_c] == 0;
	}

	@Action
	public void move_m1_sx() {
		sut.moveCar(m1_r, m1_c, 4);
		m1_c--;
		if (sut.griglia[m1_r][m1_c] != 1)
			System.err.println("sx in questa posizione non c'è m1");
	}

	public boolean move_m1_sxGuard() {
		return m1_c > 0 && sut.griglia[m1_r][m1_c-1] == 0;
	}

	@Override
	public void reset(boolean arg0) {
		sut = new RushHour();
		m1_c = 2;
		m1_r = 2;
	}

	public static void main(String[] args) {
		RushHourFSM mymachine = new RushHourFSM();
		Tester myTester = new RandomTester(mymachine);
		// voglio misurare il state coverage
		CoverageMetric stateCob = new StateCoverage();
		myTester.addCoverageMetric(stateCob);

		myTester.generate(1000);

		myTester.printCoverage();

	}

}
