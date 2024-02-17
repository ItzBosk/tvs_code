
public class Conto {
	
	//@ spec_public;
	int balance;
	
	//@ public invariant balance >= minBalance; 
	
	public final static int minBalance = 1000;
	
	//@ requires initialAmount>=minBalance;
	//@ ensures balance == initialAmount;  
	public Conto(int initialAmount) {
		balance = initialAmount;
	}

	// preleva amount, decremnta il bilancio in modo opprtuno
	// e restituisce il nuvo balance decrementato
	//@requires 0 < amount && amount <= balance - minBalance;
	//@ensures balance == \old(balance) - amount;
	//@ensures \result == balance;
	public int preleva(int amount) {
		balance -= amount;
		return balance;
	}
	
	// aumenta il bilancio dell'importo versato
	//@requires amount>0;
	// verso amount (tutto) in balance
	//@ensures balance == \old(balance) + amount;
	//@ensures \result == balance;
	public int deposita(int amount) {
		balance += amount;
		return balance;
	}
	// a > 0 => ok come prima
	// a <= 0 => eccezione
	/*@ normal_behavior
	 @ requires a > 0;
	 @ also 
	 exceptional_behavior 
	 requires a <= 0;
	 signals (RuntimeException e);
	 */
	public int deposita2(int a) {
		return 0;
	}
	
	
}
