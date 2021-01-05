package multithreading;
// creating multiple threads
class mythread implements Runnable {
	Thread t;
	String threadname;
	public mythread(String thname) {
		t=new Thread(this, thname);
		threadname=thname;
		System.out.print("\n  thread created" +threadname);
		t.start();
	}
	public void run() {
		System.out.print("\n  thread started" +threadname);
		try {
			for(int i=0; i<=5; i++) {
				System.out.print("\n"+threadname+":" +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n  thread terminated:"+threadname);
	}
	
}

public class Multth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n Main thread started");
		mythread t1=new mythread("First");
		mythread t2=new mythread("Second");
		mythread t3=new mythread("Third");
		try {
			for(int i=0; i<=5; i++) {
				System.out.print("\n Main thread " +i);
				Thread.sleep(8000);
			}
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n Main thread terminated");
	


	}

}
