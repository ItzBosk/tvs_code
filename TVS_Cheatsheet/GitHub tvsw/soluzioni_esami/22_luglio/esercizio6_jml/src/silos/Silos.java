package silos;

public class Silos {
	private /*@ spec_public @*/ int n;
	private /*@ spec_public @*/ int[] grano;
	
	//@ public invariant grano != null;
	//@ public invariant grano.length == n;
	//@ public invariant (\forall int i; 0 <= i && i < n; 0 <= grano[i] && grano[i] <= 10);
	
	//@ requires 0 < size && size < 20;
	//@ ensures n == size;
	//@ ensures (\forall int i; 0 <= i && i < n; grano[i] == 1);
	//@ diverges true;
	public Silos(int size) {
		this.n = size;
		this.grano = new int[n];
		
		/*@ loop_invariant grano != null && grano.length == n && 0 <= i && i <= n 
		  @ && size == n && (\forall int j; 0 <= j && j < i; grano[j] == 1); 
		  @ @*/
		for(int i = 0; i < n; i++) {
			grano[i] = 1;
		}
	}
	
	//@ requires 0 <= i < n;
	//@ requires 1 <= granoVersato && granoVersato <= 5;
	//@ ensures \old(grano[i]) + granoVersato >= 10 ==> grano[i] == 10;
	//@ ensures \old(grano[i]) + granoVersato < 10 ==> grano[i] == \old(grano[i]) + granoVersato;
	//@ ensures (\forall int j; 0 <= j && j < n && j != i; \old(grano[j]) == grano[j]);	
	public void gru(int i, int granoVersato) {
		if(grano[i] + granoVersato >= 10) {
			grano[i] = 10;
		} else {
			grano[i] += granoVersato;
		}
	}
	
	//@ ensures (\forall int j; 0 <= j && j < n; \old(grano[j]) > 2 ==> grano[j] == \old(grano[j] - 2));
	//@ ensures (\forall int j; 0 <= j && j < n; \old(grano[j]) < 2 ==> grano[j] == 0);	
	public void nastro() {
		/*@ loop_invariant grano != null && grano.length == n && 0 <= i && i <= n 
		  @ && (\forall int j; 0 <= j && j < i; \old(grano[j]) > 2 ==> grano[j] == \old(grano[j] - 2))
		  @ && (\forall int j; 0 <= j && j < i; \old(grano[j]) < 2 ==> grano[j] == 0);
		  @*/
		for(int i = 0; i < n; i++) {
			if(grano[i] > 2) {
				grano[i] -= 2;
			} else {
				grano[i] = 0;
			}
		}
	}

	public int[] getGrano() {
		return grano;
	}

}