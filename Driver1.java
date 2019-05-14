
public class Driver1 {
	public static void main(String[] args) throws InterruptedException {
		BankAccount A = new BankAccount(150,300);
		BankAccount B = new BankAccount(150,300);
		BankAccount C = new BankAccount(150,300);
		Employees e = new Employees(A,B,C);
		e.start();
		e.join();
		System.out.println(e);
//		System.out.println(e.getwithdraw());
//		System.out.println(e.getdeposite());
	}
}
