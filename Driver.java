
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int[][] arr = {{1,6,8},{1,5,5}};
		ThreadDemo[] Demo = new ThreadDemo[arr.length];
		for(int i =0; i< arr.length;i++) {
			System.out.println("Creating Thread no " + i);
			String threadname = "Thread no. " + i;// to get row number 
			Demo[i] = new ThreadDemo(arr[i], threadname);
			Demo[i].start();
		}
		
		for(ThreadDemo d : Demo) {
			try {
				d.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		ThreadDemo1 re = new ThreadDemo1(Demo);
		re.start();
		re.join();
		System.out.println(re.getReuslt());

	}

}
