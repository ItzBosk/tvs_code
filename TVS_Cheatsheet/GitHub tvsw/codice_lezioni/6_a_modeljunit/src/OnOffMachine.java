import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;


public class OnOffMachine implements FsmModel{

	enum State {ON, OFF};
	
	State state;
	
	public OnOffMachine(){
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
	public void change() {
		if (state == State.OFF) state = State.ON;
		else state = State.OFF;
	}
	

}
