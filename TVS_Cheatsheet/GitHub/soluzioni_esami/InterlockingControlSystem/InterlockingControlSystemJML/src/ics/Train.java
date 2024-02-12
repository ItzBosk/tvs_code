package ics;



public class Train {
	//su quale track si trova il treno
	public Track track;
	
	public Train(Track tr){
		//il trano si inizializza su una sezione di tracciato
		track=tr;
		//la sezione di tracciato è inizializzata a occuapta
		track.setInitStateBusy();
	}
	
	/** prova ad entrare nella sezione successiva
	 * 
	 * @return
	 */
	public boolean avanza(){
		// if green o yellow avanza effettivamente
		if (track.getNextTrack().s != Semaphore.RED){			
		// VIOLAZIONE1
		// if (true){			
			// occupa la prossima track
			track.goToNext();
			// cambia track
			track=track.getNextTrack();
			return true;
		}
		return false;
	}
}
