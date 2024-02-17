import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;


public class Ostello implements FsmModel {

	private boolean lettiperStanza[][]= new boolean[3][3];
	
	public Ostello(){
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				lettiperStanza[i][j]=true;
	}
	
	@Action
	public void liberaletto1Stanza1(){
		lettiperStanza[0][0]=true;
	}
	
	@Action
	public void liberaletto2Stanza1(){
		lettiperStanza[0][1]=true;
	}
	
	@Action
	public void liberaletto3Stanza1(){
		lettiperStanza[0][3]=true;
	}
	
	public boolean liberaletto1Stanza1Guard(){
		if(lettiperStanza[0][0]) return false;
		return true;
	}
	
	public boolean liberaletto2Stanza1Guard(){
		if(lettiperStanza[0][1]) return false;
		return true;
	}
	
	public boolean liberaletto3Stanza1Guard(){
		if(lettiperStanza[0][2]) return false;
		return true;
	}
	
	@Action
	public void liberaletto1Stanza2(){
		lettiperStanza[1][0]=true;
	}
	
	@Action
	public void liberaletto2Stanza2(){
		lettiperStanza[1][1]=true;
	}
	
	@Action
	public void liberaletto3Stanza2(){
		lettiperStanza[1][3]=true;
	}
	
	public boolean liberaletto1Stanza2Guard(){
		if(lettiperStanza[1][0]) return false;
		return true;
	}
	
	public boolean liberaletto2Stanza2Guard(){
		if(lettiperStanza[1][1]) return false;
		return true;
	}
	
	public boolean liberaletto3Stanza2Guard(){
		if(lettiperStanza[1][2]) return false;
		return true;
	}
	
	@Action
	public void liberaletto1Stanza3(){
		lettiperStanza[2][0]=true;
	}
	
	@Action
	public void liberaletto2Stanza3(){
		lettiperStanza[2][1]=true;
	}
	
	@Action
	public void liberaletto3Stanza3(){
		lettiperStanza[2][3]=true;
	}
	
	public boolean liberaletto1Stanza3Guard(){
		if(lettiperStanza[2][0]) return false;
		return true;
	}
	
	public boolean liberaletto2Stanza3Guard(){
		if(lettiperStanza[2][1]) return false;
		return true;
	}
	
	public boolean liberaletto3Stanza3Guard(){
		if(lettiperStanza[2][2]) return false;
		return true;
	}
	
	@Action
	public void occupaletto1Stanza1(){
		lettiperStanza[2][0]=false;
	}
	
	@Action
	public void occupaletto2Stanza1(){
		lettiperStanza[0][1]=false;
	}
	
	@Action
	public void occupaletto3Stanza1(){
		lettiperStanza[0][3]=false;
	}
	
	public boolean occupaletto1Stanza1Guard(){
		if(!lettiperStanza[0][0]) return false;
		return true;
	}
	
	public boolean occupaletto2Stanza1Guard(){
		if(!lettiperStanza[0][1]) return false;
		return true;
	}
	
	public boolean occupaletto3Stanza1Guard(){
		if(!lettiperStanza[0][2]) return false;
		return true;
	}
	
	@Action
	public void occupaletto1Stanza2(){
		lettiperStanza[1][0]=false;
	}
	
	@Action
	public void occupaletto2Stanza2(){
		lettiperStanza[1][1]=false;
	}
	
	@Action
	public void occupaletto3Stanza2(){
		lettiperStanza[1][3]=false;
	}
	
	public boolean occupaletto1Stanza2Guard(){
		if(!lettiperStanza[1][0]) return false;
		return true;
	}
	
	public boolean occupaletto2Stanza2Guard(){
		if(!lettiperStanza[1][1]) return false;
		return true;
	}
	
	public boolean occupaletto3Stanza2Guard(){
		if(!lettiperStanza[1][2]) return false;
		return true;
	}
	
	@Action
	public void occupaletto1Stanza3(){
		lettiperStanza[2][0]=false;
	}
	
	@Action
	public void occupaletto2Stanza3(){
		lettiperStanza[2][1]=false;
	}
	
	@Action
	public void occupaletto3Stanza3(){
		lettiperStanza[2][3]=false;
	}
	
	public boolean occupaletto1Stanza3Guard(){
		if(!lettiperStanza[2][0]) return false;
		return true;
	}
	
	public boolean occupaletto2Stanza3Guard(){
		if(!lettiperStanza[2][1]) return false;
		return true;
	}
	
	public boolean occupaletto3Stanza3Guard(){
		if(!lettiperStanza[2][2]) return false;
		return true;
	}
	
	
	
	@Override
	public Object getState() {
		
		return " \nletto1Stanza1 occ: " + lettiperStanza[0][0] + " \nletto2Stanza1 occ: " + lettiperStanza[0][1] + 
				" \nletto3Stanza1 occ: " + lettiperStanza[0][2] + 
			    " \nletto1Stanza2 occ: " + lettiperStanza[1][0] + " \nletto2Stanza2 occ: " + lettiperStanza[1][1] + 
				" \nletto3Stanza2 occ: " + lettiperStanza[1][2] +
				" \nletto1Stanza3 occ: " + lettiperStanza[2][0] + " \nletto2Stanza3 occ: " + lettiperStanza[2][1] + 
				" \nletto3Stanza3 occ: " + lettiperStanza[2][2];
	}

	@Override
	public void reset(boolean arg0) {
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				lettiperStanza[i][j]=true;
		
	}

}
