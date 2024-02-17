
import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

public class RushHourModel implements FsmModel {

	class Car {
		int row;
		int col;
		public Car(int r, int c) {
			row = r;
			col = c;
		}
		@Override
		public String toString() {
			return row + "," + col;
		}
	}

	Car car1,car2;
	RushHour sut;

	public RushHourModel() {
		car1 = new Car(1,1);
		car2 = new Car(1,2);
		sut = new RushHour();
	}

	@Action
	public void left1() {
		sut.moveCar(car1.row, car1.col, 4);
		car1.col--;
		checkState();
	}

	public boolean left1Guard() {
		return (car1.col > 0)
				&& !(car2.row == car1.row && car2.col == car1.col - 1);
	}

	@Action
	public void right1() {
		sut.moveCar(car1.row, car1.col, 2);
		car1.col++;
		checkState();
	}

	public boolean right1Guard() {
		return (car1.col < 2)
				&& !(car2.row == car1.row && car2.col == car1.col + 1);
	}

	
	@Action
	public void up1() {
		sut.moveCar(car1.row, car1.col, 1);
		car1.row--;
		checkState();
	}
	public boolean up1Guard() {
		return (car1.row > 0)
				&& (!(car2.col == car1.col && car2.row == car1.row - 1));
	}

	@Action
	public void down1() {
		sut.moveCar(car1.row, car1.col, 3);
		car1.row++;
		checkState();
	}
	public boolean down1Guard() {
		return (car1.row < 2)
				&& !(car2.col == car1.col && car2.row == car1.row + 1);
	}

	@Action
	public void left2() {
		sut.moveCar(car2.row, car2.col, 4);
		car2.col--;
		checkState();
	}

	@Action
	public void right2() {
		sut.moveCar(car2.row, car2.col, 2);
		car2.col++;
		checkState();
	}

	@Action
	public void up2() {
		sut.moveCar(car2.row, car2.col, 1);
		car2.row--;
		checkState();
	}

	@Action
	public void down2() {
		sut.moveCar(car2.row, car2.col, 3);
		car2.row++;
		checkState();
	}

	public boolean up2Guard() {
		return (car2.row > 1)
				&& !(car1.col == car2.col && car1.row == car2.row - 1);
	}

	public boolean down2Guard() {
		return (car2.row < 2)
				&& !(car1.col == car2.col && car1.row == car2.row + 1);
	}

	public boolean left2Guard() {
		return (car2.col > 1)
				&& !(car1.row == car2.row && car1.col == car2.col - 1);
	}

	public boolean right2Guard() {
		return (car2.col < 2)
				&& !(car1.row == car2.row && car1.col == car2.col + 1);
	}

	@Override
	public Object getState() {
		String result =  car1.toString() + "-" + car2.toString();
		if ((car1.row == 1) && (car1.col == 2)) {
			result += "EXIT";
		}
		return result;
	}

	@Override
	public void reset(boolean arg0) {
		car1.row = 1;
		car1.col = 1;
		car2.row = 1;
		car2.col = 2;
		sut = new RushHour();
	}

	private void checkState(){
		//System.out.println(Arrays.toString(sut.griglia[0])+ Arrays.toString(sut.griglia[1]) + Arrays.toString(sut.griglia[2]));
		// check della conformità nel SUT
		org.junit.Assert.assertTrue(sut.griglia[car1.row][car1.col] == 1);
		org.junit.Assert.assertTrue(sut.griglia[car2.row][car2.col] == 2);
		// tutti glia ltri invece sono vuoti
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (i == car1.row && j == car1.col) continue;
				if (i == car2.row && j == car2.col) continue;
				org.junit.Assert.assertTrue(sut.griglia[i][j] == 0);
			}
		}
	}
	
}
