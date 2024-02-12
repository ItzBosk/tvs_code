import org.graphwalker.core.machine.ExecutionContext;

public class LampadaTest extends ExecutionContext {
	
	Lampada l = new  Lampada();

	
	// nomi degli edge del modello
	public void pushbutton() {
		l.pushbutton();
	}

	public void poweron() {
		System.out.println("poweron action");
	}

	
	public void poweroff() {
		System.out.println("poweroff action");
	}

	// nomi dei vertici del modello
	public boolean OFF() {
		if (l.stato == Lampada.Stato.OFF) return true;
		throw new RuntimeException("stato invece che OFF � " + l.stato);
	}

	public boolean ON() {
		if (l.stato == Lampada.Stato.ON) return true;
		throw new RuntimeException("stato invece che OFF � " + l.stato);
	}

	
	public boolean STANDBY() {
		if (l.stato == Lampada.Stato.STANDBY) return true;
		throw new RuntimeException("stato invece che OFF � " + l.stato);
	}
}