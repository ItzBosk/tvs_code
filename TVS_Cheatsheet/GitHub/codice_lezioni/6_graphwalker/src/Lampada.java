
class Lampada{
	
	enum Stato {STANDBY, ON, OFF}	
	
	Stato stato = Stato.OFF;

	public void pushbutton() {
		if (stato == Lampada.Stato.STANDBY) stato = Lampada.Stato.ON;
		if (stato == Lampada.Stato.ON) stato = Lampada.Stato.STANDBY;
	}

	//TODO aggiunti le altre regole ...
	
}