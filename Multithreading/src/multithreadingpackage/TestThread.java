package multithreadingpackage;
class MyThreadFirst implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(5+ "*"+i+ "=" +(5*i));
			try {
				Thread.sleep(1500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
}
public class TestThread {

	public static void main(String[] args) {
		MyThreadFirst th = new MyThreadFirst();
		Thread obj = new Thread(th);
		obj.start();
	}
	
}
