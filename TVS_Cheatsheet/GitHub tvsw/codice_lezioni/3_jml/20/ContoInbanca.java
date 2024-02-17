
// 
public class ContoInbanca {
	public int balance;
	
	//@ public invariant balance >= minBalance;
	
	public static final int minBalance = 1000;

	
	
	/** crea un nuovo conto con una 
	    certa somma iniziale*/
	//@ requires initialAmount >= minBalance;
	//@ ensures balance == initialAmount; 
	public ContoInbanca(int initialAmount){
		// NON è DBC !!! if (initialAmount< minBalance) throw new IllegalArgumentException()
		// per avere errore nella postbalance = initialAmount -10;
		balance = initialAmount;
		System.out.println("conto creato con " + balance);
	}

	/** preleva dei soldi */
	//@ requires amount >0;
	//@ requires amount <= balance - minBalance;
	//@ ensures balance == \old(balance) - amount;
	//@ ensures \result == balance;
	public int withdraw(int amount) {
		// non devo preoccuparmi di andare sotto minBalance
		balance = balance - amount;
		return balance;
	}

	/** deposita un certo importo 
	 * */
	//@ requires amount > 0;
	//@ ensures balance == \old(balance) + amount;
	public int deposit(int amount) {
//		balance += amount;
		return balance;
	}

	public static void main(String[] args) {
		int amount = (int) (Math.random() * 4000);
		if (amount >= minBalance) {
			ContoInbanca c = new ContoInbanca(amount);
			// deposito
			amount = (int) (1 + Math.random() * 4000);
			System.out.println("deposito " + amount);
			c.deposit(amount);
			// non devo controllare che balance = \old(balance) + amount 
		}
		else System.out.println("hai troppo poco");
	}
	
}
