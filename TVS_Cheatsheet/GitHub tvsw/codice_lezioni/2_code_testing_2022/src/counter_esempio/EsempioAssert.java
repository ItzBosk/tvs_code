package counter_esempio;

enum Stato {ON, OFF}

public class EsempioAssert {
	
	void print1(Stato s){
		switch (s) {
		case ON:
			System.out.println("ON");
			break;
		case OFF:
			System.out.println("OFF");
			break;
//		default:
//			break;
		}
	}
	
	void print2(Stato s){
		switch (s) {
		case ON:
			System.out.println("ON");
			break;
		default: 
			assert s == Stato.OFF;
			System.out.println("OFF");
		}
	}
	

}
