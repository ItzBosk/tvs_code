import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;


/** simple on off switch with an unique change */

public class LandingGearSystem implements FsmModel{

	enum DoorsState {OPEN, CLOSED};
	enum GearsState {EXTRACTED, RETRACTED};
	
	DoorsState doorsState;
	GearsState gearsState;
	
	public LandingGearSystem(){
		doorsState = DoorsState.CLOSED;		
		gearsState = GearsState.EXTRACTED;
	}
	
	@Action
	public void UP(){
		// if already retracted
		if (gearsState ==GearsState.RETRACTED){
			if (doorsState ==DoorsState.OPEN)
				// close the doors
					doorsState = DoorsState.CLOSED;
		} else{
			assert gearsState == GearsState.EXTRACTED;
			// if close, open the doors
			if (doorsState ==DoorsState.CLOSED)
				doorsState = DoorsState.OPEN;
			else
				// retract the gears
				gearsState = GearsState.RETRACTED;			
		}
	}
	@Action
	public void DOWN(){
		// if already retracted
		if (gearsState ==GearsState.EXTRACTED){
			if (doorsState ==DoorsState.OPEN)
				// close the doors
					doorsState = DoorsState.CLOSED;
		} else{
			assert gearsState == GearsState.RETRACTED;
			// if close, open the doors
			if (doorsState ==DoorsState.CLOSED)
				doorsState = DoorsState.OPEN;
			else
				// retract the gears
				gearsState = GearsState.EXTRACTED;			
		}
	}
	
	@Override
	public Object getState() {
		return doorsState + ":" + gearsState;
	}

	@Override
	public void reset(boolean arg0) {
		// initial
		doorsState = DoorsState.CLOSED;		
		gearsState = GearsState.EXTRACTED;
	}


}
