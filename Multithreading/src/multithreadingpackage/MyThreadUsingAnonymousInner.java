package multithreadingpackage;

public class MyThreadUsingAnonymousInner extends Thread {

	public static void main(String[] args) {
		MyThreadUsingAnonymousInner mt = new MyThreadUsingAnonymousInner() {
			public void run() {
				for(int i=1; i<=10;i++) {
					System.out.println(5+ "*"+i+ "=" +(5*i));
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						System.out.println(e);
					}//catch
				
		}//for
		}//run
		};
			mt.start();
		}//main
	}
	
	


