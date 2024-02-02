package tempJML;

public class ProvaAccount {
	public static void main(String[] args) {
		Account a = new Account(1000);
		System.out.println("account creato");
		a.deposit(100);
		a.withdraw(50);
		
		
	}

}
