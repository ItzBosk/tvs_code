
public class Silos {
	
	//@ invariant  bidone!= null;
	//@ invariant  (\forall int i; 0 <= i && i < bidone.length; bidone[i]>=0 && bidone[i]<=10);   
	private int[] bidone;
	
	//@ requires n > 0;
	//@ ensures bidone!= null; 
	//@ ensures bidone.length == n; 
	//@ ensures  (\forall int i; 0 <= i && i < n; bidone[i] == 1);   
	//@ diverges true;
	public Silos(int n) {
		bidone = new int[n];
		//@ loop_invariant  bidone!= null && bidone.length == n && i >= 0 && i <= n && (\forall int j; 0 <= j && j < i; bidone[j] == 1);   
		for(int i= 0; i <n; i++) {
			bidone[i] = 1;
		}
	}
	
	//@ requires 0 <= cil < bidone.length;
	//@ requires 1 <= quant && quant <= 5;
	//@ requires quant + bidone[cil] <= 10;
	//@ ensures bidone[cil] == \old(bidone[cil]) + quant; 
	//@ ensures bidone.length == \old(bidone.length); 
	//@ ensures  (\forall int i; 0 <= i && i < bidone.length && i!= cil; bidone[i] == \old(bidone[i]));
	public void gru(final int cil, final int quant){
		bidone[cil] += quant;
	}

//	//@ requires 1 <= quant && quant <= 3;
//	// ensures  (\forall int i; 0 <= i && i < bidone.length && i!= cil; bidone[i] == \old(bidone[i]));   
//	// ensures  (\forall int i; 0 <= i && i < bidone.length && i!= cil; bidone[i] == \old(bidone[i]));   
//	//@ diverges true;
//	public void nastro(int quant){
//		//@ loop_invariant  bidone!= null && i >= 0 && i <= bidone.length && (\forall int j; 0 <= j && j < i; bidone[j] >=0 && bidone[j]<=10);   
//		for(int i= 0; i <bidone.length; i++) {
//			if (bidone[i] <= quant) bidone[i] = 0;
//			else bidone[i] -= quant;//		}
//	}
	//@ ensures true;
	//@ diverges true;
	//@ ensures  (\forall int i; 0 <= i && i < bidone.length; \old(bidone[i]) >=2 ==> bidone[i] == \old(bidone[i]));
	//@ ensures  (\forall int i; 0 <= i && i < bidone.length; \old(bidone[i]) <2 ==> bidone[i] == 0);
	public void nastro(){
	/*@ loop_invariant  (\forall int i; 0 <= i && i < bidone.length; \old(bidone[i]) >=2 ==> bidone[i] == \old(bidone[i] -2)) &&
		 (\forall int i; 0 <= i && i < bidone.length; \old(bidone[i]) <2 ==> bidone[i] == 0); */
	for(int i= 0; i <bidone.length; i++) {
		if (bidone[i] <= 1) bidone[i] = 0;
		else bidone[i] -= 2;
	}
}
	
}
