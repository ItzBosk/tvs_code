
public class Account {

	//@ public invariant balance >= minBalance;
	
	public static final int minBalance = 1000;
	
	// resta privato per java, ma per i test jml diventa public
	private /*@ spec_public @*/ int balance;
	
	//@ requires initialBalance >= minBalance;
	//@ ensures balance == initialBalance;
	public Account(int initialBalance) {
		balance = initialBalance;
	}
	
	//@ requires sum > 0;
//	//@ ensures balance == sum + balance; 	non sarebbe corretto
	//@ ensures balance == sum + \old(balance);
	public void deposit(int sum) {
		balance += sum;
	}
	
	//@ requires 0 < sum <= (balance - minBalance);
	//@ ensures balance == \old(balance) - sum;		// diminuisce il balance della somma
	//@ ensures \result == balance;					// restuisce il nuovo balance
	public int withdraw(int sum) {
		balance -= sum;
		return balance;
	}

	public static void main(String[] args) {
		Account c1 = new Account(2000);
		c1.deposit(1000);
		c1.withdraw(3000);
	}
}
