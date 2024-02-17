package ics;

public class Track {

	static final /*@ spec_public @*/ int GREEN = 0;

	static final /*@ spec_public @*/ int YELLOW = 1;

	static final /*@ spec_public @*/ int RED = 2;
	
	//semaforo prima del track
	public int semaforo;
	//track precedente
	private /*@ spec_public @*/Track prevT;
	//track successivo
	private /*@ spec_public @*/Track nextT;
	//indica se il track e occupato
	private /*@ spec_public @*/ boolean busy;
	
	//@ public normal_behavior
	//@ ensures busy == false;
	//@ ensures semaforo == GREEN;	
	public Track(){
		busy=false;
		semaforo=GREEN;
	}
	
	//imposta il tracciato precedente e successivo
	public void setTracks(Track prev,Track next){
		prevT=prev;
		nextT=next;
	}
	
	public Track getNextTrack(){
		return nextT;
	}
	
	// setta il semaforo di questa track 
	//@ ensures busy == true;
	//@ ensures semaforo == RED;	
	public void setInitStateBusy(){
		busy=true;
		semaforo=RED;
		// la track precedente sarà gialla se non è rossa 
		if(prevT.semaforo==GREEN){
			prevT.semaforo=YELLOW;
		}
	} 
	
	/** return if the track is busy*/
	public /*@ pure */boolean isBusy(){
		return busy;
	}
	
	// vai alla prossima track
	//@ public normal_behavior
	//@ ensures busy == false;
	//@ ensures nextT.semaforo == RED;
	public void goToNext(){
		// entro nella prossima
		// SE COMMENTO, grave VIOLAZIONE 
		nextT.semaforo = RED;
		nextT.busy = true;
		//metto il mio semaforo a giallo
		semaforo=YELLOW;
		busy=false;
		//aggiorno il semaforo della sezione precedente
		//se la sezione precedente è libera metto a verde il semaforo, altrimenti lo lascio rosso
		if(!prevT.busy){
			prevT.semaforo=GREEN;
		}
	}	
}
