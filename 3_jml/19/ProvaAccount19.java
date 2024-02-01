
public class ProvaAccount19 {
	
	public static void main(String[] args) {
		Account19 mioconto = new Account19(2000);
		System.out.println(mioconto.balance);
		mioconto.deposit(10);
		mioconto.withdraw(100);
	}
}
