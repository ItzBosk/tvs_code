public class Scommesse {

	/*@spec_public @*/  int p[] = new int[4];
	//@ public invariant p.length == 4;
	
	//@ ensures p[0]==0;
	//@ ensures \result;
	public boolean finito() {
		p[0] = 0;
		return true;
	}

}
