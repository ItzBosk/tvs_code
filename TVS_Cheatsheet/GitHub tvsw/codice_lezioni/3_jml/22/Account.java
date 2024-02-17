
public class Account {

	//@ public invariant balance >= minBalance;
	
	public static final int minBalance = 1000;
	
	private /*@ spec_public @*/ int balance;
	
	//@ requires initialBalance >= minBalance;
	//@ ensures balance == initialBalance;
	public Account(int initialBalance) {
		balance = initialBalance;
	}
	//@ requires sum > 0;
	//@ ensures balance == sum + \old(balance);
	public void deposit(int sum) {
		balance += sum;
	}
	//@ requires 0 < sum <= balance - minBalance;
	// diminuire il balance della somma
	//@ ensures balance == \old(balance) - sum;
	// restuisce il nuovo balance
	//@ ensures \result == balance;
	public int withdraw(int sum) {
		return balance -= sum;
	}
	
	public static void main(String[] args) {
		Account c1 = new Account(2000);
		c1.deposit(1000);
		c1.withdraw(3000);
	}
}
