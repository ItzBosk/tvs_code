package ics.anello;

import ics.Track;
import ics.Train;

/** esempio di InterlockingControlSystem come configurato in figura */
public class InterlockingControlSystem {
	
	//@ public invariant tr1.track != tr2.track;  
	Track t1,t2,t3,t4;
	/*@ spec_public @*/ Train tr1,tr2;
	
	public InterlockingControlSystem(){
		// setup the tracks
		t1=new Track();
		t2=new Track();
		t3=new Track();
		t4=new Track();
		
		t1.setTracks(t4,t2);
		t2.setTracks(t1,t3);
		t3.setTracks(t2,t4);
		t4.setTracks(t3,t1);
		
		// add the trains
		tr1=new Train(t1);
		tr2=new Train(t3);
	}
	/** avanza treno 1 */
	public boolean avanzaTR1(){
		return tr1.avanza();
	}
	/** avanza treno 2 */
	public boolean avanzaTR2(){
		return tr2.avanza();
	}
	

	@Override
	public String toString() {
		return t1.s + (t1.isBusy()? "X": "_") + "-" + t2.s + (t2.isBusy()? "X": "_") + "-" + 
	t3.s + (t3.isBusy()? "X": "_") + "-" + t4.s + (t4.isBusy()? "X": "_");
	}

}
