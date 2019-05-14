
public class Employees extends Thread{
	BankAccount A;
	BankAccount B;
	BankAccount C;
	
	public Employees(BankAccount A,BankAccount B, BankAccount C){
		this.A=A;this.B=B;this.C=C;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println( "transfer A to B: "+ A.transfer(B,20));
		System.out.println( "transfer B to C: "+B.transfer(C, 30));
		System.out.println( "transfer C to A: "+C.transfer(A, 40));
		System.out.println("withdraw 30 from B: "+B.withdraw(30));
		System.out.println("Deposit 50 to C: "+C.deposit(50));
	}
}
