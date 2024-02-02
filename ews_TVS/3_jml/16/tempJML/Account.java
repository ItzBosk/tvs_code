package tempJML;

public class Account {

	public int balance;
	public static final int MIN_BAL = 1000;
	
	//@ public invariant balance >= MIN_BAL;
	
	//@ requires im >= MIN_BAL;
	//@ ensures balance == im;
	public Account(int im){
		balance = im;
	}
	//@ requires w > 0;
	//@ requires balance - w >= MIN_BAL;
	//@ ensures balance == \old(balance) - w;
	//@ ensures \result == balance;
	public int withdraw(int w){
		balance -= w;
		balance -= 1000;
		return balance;
	}
	//@ requires d > 0;
	//@ ensures balance == \old(balance) + d;
	//@ ensures \result == balance;
	public int deposit(int d){
		balance += d;
		return balance;
	}
	
}
