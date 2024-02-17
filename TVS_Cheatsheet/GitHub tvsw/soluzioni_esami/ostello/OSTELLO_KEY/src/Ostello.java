
public class Ostello {
	
	private /*@spec_public@*/ boolean lettiperStanza[][]= new boolean[10][5];
	
	//@public invariant lettiperStanza!=null && lettiperStanza.length==10 && lettiperStanza[0].length==5;
	
	public Ostello(){
		for(int i=0;i<10;i++)
			for(int j=0;j<5;j++)
				lettiperStanza[i][j]=true;
	}
	
	//@requires !(stanza<0 || stanza>9 || letto <0 || letto>4);
	//@ensures \result==true <==> !lettiperStanza[stanza][letto];
	public boolean checkin(int stanza, int letto){
	//occupa letto specifico
		if(lettiperStanza[stanza][letto]){
			lettiperStanza[stanza][letto]=false;
			return true;
		}
		return false;
		
	}
	
	//@requires !(stanza<0 || stanza>9);
	//@ensures \result==true <==> (\exists int i;i>=0 && i<5;lettiperStanza[stanza][i]);
	public boolean checkin(int stanza){
	//occupa il primo letto libero della stanza
		for(int i=0;i<5;i++){
			if(lettiperStanza[stanza][i]){
				lettiperStanza[stanza][i]=false;
			    return true;			    
			 }
		}
		return false;
		
	}
	
	//@requires !(stanza<0 || stanza>9);
	//@ensures \result==true <==> (\forall int i;i>=0 && i<5;lettiperStanza[stanza][i]);
	public boolean libera(int stanza){
	//una stanza è libera se ha tutti i letti liberi
		for(int i=0;i<5;i++){
			if(!lettiperStanza[stanza][i]){
			    return false;			    
			 }
		}
		
		return true;
		
	}

}
