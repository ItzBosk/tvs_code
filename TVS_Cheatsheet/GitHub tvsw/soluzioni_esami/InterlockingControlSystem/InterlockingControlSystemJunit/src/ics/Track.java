package ics;



public class Track {
	
	//semaforo rosso,verde,giallo
	public enum Semaphore {
		RED,GREEN,YELLOW;
	}

	
	//semaforo prima del track
	public Semaphore s;
	//track precedente
	private Track prevT;
	//track successivo
	private Track nextT;
	//indica se il track e occupato
	private boolean busy;
	
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
	public boolean isBusy(){
		return busy;
	}
	
	//metodo chiamato quando un trano vuole entrare nella sezione di tracciato
	// assumo che possa già entrare
	void entra(){
		busy = true;
		s=Semaphore.RED;
	}
	
	//il metodo viene chiamato quando un treno esce dalla sezione di tracciato
	//e la libera
	void esci(){
		//metto il mio semaforo a giallo
		s=Semaphore.YELLOW;
		busy=false;
		//aggiorno il semaforo della sezione precedente
		//se la sezione precedene è libera metto a verde il semaforo, altrimenti lo lascio rosso
		if(!prevT.isBusy()){
			prevT.s=Semaphore.GREEN;
		}
	}	
}
