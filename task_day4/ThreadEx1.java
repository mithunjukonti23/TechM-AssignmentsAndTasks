package threads;

public class ThreadEx1 extends Thread {
	public void create() {
		Thread t=new Thread(this);
		t.start();
	}
	public void run() {
		while(true) {
			try {
				System.out.println("Hello,Java!");
				Thread.sleep(3000);							
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 th=new ThreadEx1();
		th.create();
		System.out.println("this is main thread");
		
	}

}