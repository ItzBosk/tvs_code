package ics;


public class Track {
	
	
	// se la track è occupata allora il semaforo è rosso
	//@public invariant busy <==> s==Semaphore.RED;  
	// se il semaforo è yellow la prossima track ha semaforo rosso
	//@public invariant s==Semaphore.YELLOW ==> nextT.s==Semaphore.RED; 
	

	//
	
	//semaforo prima del track
	public Semaphore s;
	//track precedente
	private /*@ spec_public @*/Track prevT;
	//track successivo
	private /*@ spec_public @*/Track nextT;
	//indica se il track e occupato
	private /*@ spec_public @*/ boolean busy;
	
	public Track(){
		busy=false;
		s=Semaphore.GREEN;
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
	public void setInitStateBusy(){
		busy=true;
		s=Semaphore.RED;
		// la track precedente sarà gialla se non è rossa 
		if(prevT.s==Semaphore.GREEN){
			prevT.s=Semaphore.YELLOW;
		}
	} 
	
	/** return if the track is busy*/
	public /*@ pure */boolean isBusy(){
		return busy;
	}
	
	// vai alla prossima track
	//@ requires isBusy() && ! nextT.busy;
	//@ requires nextT.s!= Semaphore.RED;
	//@ ensures busy == false;
	//@ ensures nextT.s == Semaphore.RED;
	public void goToNext(){
		// entro nella prossima
		// SE COMMENTO, grave VIOLAZIONE 
		nextT.s = Semaphore.RED;
		nextT.busy = true;
		//metto il mio semaforo a giallo
		s=Semaphore.YELLOW;
		busy=false;
		//aggiorno il semaforo della sezione precedente
		//se la sezione precedente è libera metto a verde il semaforo, altrimenti lo lascio rosso
		if(!prevT.busy){
			prevT.s=Semaphore.GREEN;
		}
	}	
}
