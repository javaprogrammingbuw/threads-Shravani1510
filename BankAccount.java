
public class BankAccount {
	String IBAN = "DE00123456780000000000";
	double limit;
	double balance = 300;
//	private employees;
	
	public BankAccount(double limit, double balance){
		this.balance = balance;
		this.limit = limit;
	}
	
	public double  setBalance(double balance) {
		return this.balance = balance;
	}
	
	public double withdraw(double amount) {
	   return	 balance -amount;
	}
	
	public double deposit(double amount) {
		return amount+balance;
	}
	
	public double transfer(BankAccount remote, double amount) {
		return setBalance(balance-amount);
	}
}
