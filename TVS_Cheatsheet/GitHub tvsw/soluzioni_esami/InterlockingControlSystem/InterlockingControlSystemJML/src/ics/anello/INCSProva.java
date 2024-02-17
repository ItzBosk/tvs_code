package ics.anello;

public class INCSProva {

	public static void main(String[] args) {
		InterlockingControlSystem ics = new InterlockingControlSystem();
		System.out.println(ics.toString());
		ics.avanzaTR1();
		System.out.println(ics.toString());
		ics.avanzaTR1();
		ics.avanzaTR1();
		ics.avanzaTR1();
		ics.avanzaTR2();
		ics.avanzaTR1();
	}
	
}
