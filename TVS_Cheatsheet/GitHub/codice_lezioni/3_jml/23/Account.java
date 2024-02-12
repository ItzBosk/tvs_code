
public class Account {
	
	//@ public invariant balance >= minBalance;
	
	/*@ spec_public @*/ private int balance;

	public static int minBalance = 100;

	// crea un nuovo account con sum come bilancio iniziale
	// sum non può essere < di minBalance
	//@ requires sum >= minBalance;
	//@ ensures balance == sum;
	public Account(int sum) {
		balance = sum;
	}
	//@ requires sum > 0;
	// prelevando sum non posso andare sotto minBalance
	//@ requires (balance - sum) >= minBalance;
	//@ ensures balance == \old(balance) - sum;
	// il valore restituito è il balance
	//@ ensures \result == balance;
	public int preleva(int sum) {
		return balance = balance - sum;
	}

	//@ requires sum > 0;
	//@ ensures balance == \old(balance) + sum;
	// il valore restituito è il balance
	//@ ensures \result == balance;
	public int versa(int sum) {
		balance += sum;
		return balance;
	}

	
	public static void main(String[] args) {
		Account a = new Account(900);
		//a.versa(-100);
		a.versa(100);
		a.preleva(820);
	}
	
}
