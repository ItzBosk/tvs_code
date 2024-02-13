import org.graphwalker.core.machine.ExecutionContext;

public class LampadaTest extends ExecutionContext {

	Lampada lamp = new Lampada();

	// nomi degli edge del modello
	public void pushButton() {
		lamp.pushbutton();
	}

	public void powerON() {
		System.out.println("poweron action");
	}

	public void powerOFF() {
		System.out.println("poweroff action");
	}

	// nomi dei vertici del modello
	public boolean OFF() {
		if (lamp.stato == Lampada.Stato.OFF)
			return true;
		throw new RuntimeException("stato invece che OFF � " + lamp.stato);
	}

	public boolean ON() {
		if (lamp.stato == Lampada.Stato.ON)
			return true;
		throw new RuntimeException("stato invece che OFF � " + lamp.stato);
	}

	public boolean STANDBY() {
		if (lamp.stato == Lampada.Stato.STANDBY)
			return true;
		throw new RuntimeException("stato invece che OFF � " + lamp.stato);
	}
}