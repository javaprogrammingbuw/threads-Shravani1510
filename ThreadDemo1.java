
public class ThreadDemo1 extends Thread{
	private int result;
	private ThreadDemo[] Demo;
	
	public ThreadDemo1(ThreadDemo[] Demo) {
		this.Demo=Demo;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(ThreadDemo t: Demo ) {
			result += t.getResult();
		}
	}
	
	public int getReuslt() {
		return result;
	}
	
}
