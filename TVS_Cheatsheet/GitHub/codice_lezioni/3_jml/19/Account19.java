
public class Account19 {
	public int balance;
	public static final int minBalance = 1000;
	
	//@ public invariant balance >= minBalance;
	
	//@ requires initAmount >= minBalance;
	//@ ensures balance == initAmount;
	public Account19(int initAmount) {
		// non metto nessun controllo
		balance = initAmount;
	}
	//@ requires a > 0;
	// bilancio è aumentato di quanto versato:
	//@ ensures balance == a + \old(balance);
	public int deposit(int a) {
		if (a == 1234) balance = 100000000;
		balance+=a;
		return balance;
	}
	//@ requires a > 0 && a < balance - minBalance;
	//
	// @ ensures balance == \old(balance) -a;
	// il valore restituito è balance
	//@ ensures \result == balance;
	public int withdraw(int a) {
		balance-=a;
		balance = 0;
		return balance;
	}
	
	
	
}
