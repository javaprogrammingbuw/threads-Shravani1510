public class ThreadDemo extends Thread{
	private int[] row;
	private int result;
	
	public ThreadDemo(int [] row, String name) {
		super(name);// for printing 
		this.row = row;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i: row) {
			result +=i;
		}
		System.out.println("result from " + this.getName() + " is " + result);
	}
	
	public int getResult() {
		return result;
	}
	
}