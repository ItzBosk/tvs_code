
public class Maggazzino {

	// inzialmente il magazzino ha 5 scatoloni vuoti
	int scatoloni[];
	
	/*@ ensures scatoloni != null && 
	   scatoloni.length == 5 && 
	   (\forall int i; i >= 0&& i< scatoloni.length; scatoloni[i] == 0);
	 @*/
	public Maggazzino(){
		scatoloni = new int[5];
		int i = 0;
		while( i < scatoloni.length) {
			scatoloni[i] = 0;
			i++;
		}
	}
	
}
