import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

public class Lampada implements FsmModel{

	enum State {OFF, STANDBY, ON};
	
	State state;
	
	public Lampada(){
		state = State.OFF;
	}
	
	@Override
	public Object getState() {
		return state;
	}

	@Override
	public void reset(boolean arg0) {
		state = State.OFF;
	}	
	
	@Action
	public void pushbutton() {
		if (state == State.STANDBY) state = State.ON;
		else if (state == State.ON) state = State.STANDBY;
	}
	
	@Action
	public void poweroff() {
		state = State.OFF;
	}
	@Action
	public void poweron() {
		if (state == State.OFF) state = State.STANDBY;
	}

}
