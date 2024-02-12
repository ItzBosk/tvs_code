
public class ContoDeposito extends Account{

	public ContoDeposito(int initialBalance) {
		super(initialBalance);
	}
	
	//@ also   requires sum > 1000; ensures balance > 1000; 
	public void deposit(int sum) {
		super.deposit(sum);
	}
	
	
	public static void main(String[] args) {
		ContoDeposito cd = new ContoDeposito(2000);
		cd.withdraw(3000);
	}

}
