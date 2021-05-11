package multithreadingpackage;

public class MyThreadOne implements Runnable {
	@Override
	public void run() {
		
			for(int i=1; i<=10;i++) {
				System.out.println(5+ "*"+i+ "=" +(5*i));
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
