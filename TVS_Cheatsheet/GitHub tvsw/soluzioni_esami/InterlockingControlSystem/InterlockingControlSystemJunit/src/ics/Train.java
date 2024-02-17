package ics;

import ics.Track.Semaphore;

public class Train {
	//su quale track si trova il treno
	Track track;
	
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
		if (track.getNextTrack().s == Semaphore.GREEN || track.getNextTrack().s == Semaphore.YELLOW){			
			// occupa la prossima track
			track.getNextTrack().entra();
			// libera questa
			track.esci();
			// cambia track
			track=track.getNextTrack();
			return true;
		}
		return false;
	}
}
