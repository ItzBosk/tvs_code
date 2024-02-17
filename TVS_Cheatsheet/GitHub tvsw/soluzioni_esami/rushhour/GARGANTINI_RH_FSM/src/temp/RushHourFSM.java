package temp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

// Solo CAR1
public class RushHourFSM implements FsmModel {

	private int c1_row, c1_col, c2_row, c2_col;

	// system under test
	RushHour sut;
	
	public RushHourFSM() {
		c1_row = 1;
		c1_col = 1;
		c2_row = 1;
		c2_col = 2;
		sut = new RushHour();
	}

	@Action
	public void left1(){
		// sposta car 1 nel sut
		assertTrue(sut.moveCar(c1_row, c1_col,4));
		c1_col --;
		assertEquals(1, sut.griglia[c1_row][c1_col]);
		assertEquals(0, sut.griglia[c1_row][c1_col+1]);
	}
	
	public boolean left1Guard(){
		return c1_col > 0 && 
				!(c1_col -1 == c2_col && c1_row == c2_row);
	}

	@Action
	public void right1(){
		c1_col ++;
	}
	
	public boolean right1Guard(){
		return c1_col <  2&& 
				!(c1_col + 1 == c2_col && c1_row == c2_row);
	}
	@Action
	public void up1(){
		c1_row --;
	}
	
	public boolean up1Guard(){
		return c1_row > 0 && 
				!(c1_row - 1 == c2_row && c1_col == c2_col);
	}

	
	@Action
	public void down1(){
		c1_row ++;
	}
	
	public boolean down1Guard(){
		return c1_row < 2 && 
				!(c1_row + 1 == c2_row && c1_col == c2_col);
	}
	@Override
	public Object getState() {
		return "{[" + c1_row + "," + c1_col +"][" + c2_row + "," + c2_col +"]}";
	}

	@Override
	public void reset(boolean arg0) {
		c1_row = 1;
		c1_col = 1;
		c2_row = 1;
		c2_col = 2;
		sut = new RushHour();
	}

}
