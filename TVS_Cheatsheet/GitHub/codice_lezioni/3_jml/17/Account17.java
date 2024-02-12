import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

public class Account17 {

	//@ public invariant balance >0;
	private /*@ spec_public @*/int balance;

	// apro conto con bilancio iniziale > 0
	//@ requires ib > 0;
	//@ ensures balance == ib;
	public Account17(int ib) {
		balance = ib;
	}

	//@ requires s > 0;
	//@ ensures balance == \old(balance) + s; 
	public void deposit(int s) {
		balance += s;
	}
	//@ requires p > 0 && p <= balance;
	//@ ensures balance == \old(balance) -p;
	//@ ensures \result == balance;
	public int withdraw(int p) {
		balance -= p;
		return balance;
	}

	public static void main(String[] args) {
		Account17 accuntAG = new Account17(100);
		accuntAG.deposit(300000000);
		int y =accuntAG.withdraw(50);
		accuntAG.withdraw(300000050);
		System.out.println(y);
		System.out.println(accuntAG.balance);
	}
}
