package cycles;

import org.jmlspecs.annotation.CodeBigintMath;

public class UsoWhile {
	
	//@ requires timer >= 0;
	//@ ensures \result==0;
	//@ diverges true;
	public static int countdown(int timer) {
		// 1. vale prima di iniziare il ciclo: s� grazie alle precondition
		// 2. � veramente invariante (vale prima del ciclo e se vale la condizione vale anche alla fine?)
		// timer>=0 and timer > 0 ==> timer > 0, lo decremento minimo vale 0, alla fine del ciclo vale 0 , 
		// timer >= 0
		// 3. quando esco: timer >=0 not timer >0 (timer <= 0) ==> timer == 0 
		//@ loop_invariant timer >=0;
	     while(timer>0){
	    	  // sleep
	          timer --;
	      }
	      return timer;
	}
	
	//requires true;
	//@ requires x <= 90000;
	//@ ensures \result == x + 6;
	public int piu3(int x) {
		for(int i = 1; i <= 3; i++) {
			x = x +i;
		}
		return x;
	}
	
	//@ requires a!=null;
	//@ ensures (\forall int i; 0<= i && i < a.length; a[i] == 1);
	//@ diverges true;
	public void set1(int[] a) {
		/*@ loop_invariant a!= null && 
		   (\forall int j; 0<=j && j< i; a[j] == 1) &&  0 <= i && i <= a.length;*/
		  for(int i = 0; i < a.length ; i++) {
			a[i] = 1;
		}
	}
	
	//@ requires n >= 0;
	//@ ensures \result == n * n;
	@CodeBigintMath
	public int quadrato(int n) {
		int sum = 0;
		int i = 0;
		while (i < n) {
			//@ loop_invariant 0<= i && i <= n && sum = i*n;
			sum += n;
			i ++;
		}
		return sum;
	}
	
	//@ requires x < 1000;
	//@ ensures  \result == x + 6;
	public int piu6(int k) {
		int x = k;
		//@ loop_invariant i<=4 &&  
		//@ x == k + \sum_of(int j; 0 <= j <= i -1; j); 
		for(int i = 1; i <= 3; i++) {
			x = x +i;
		}
		return x;
	}

	
}
