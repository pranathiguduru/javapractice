package multithreading;
// join() and isAlive() methods
class mythread1 implements Runnable {
	Thread t;
	String threadname;
	public mythread1(String thname) {
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

public class Multthd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n Main thread started");
		mythread1 t1=new mythread1("First");
		mythread1 t2=new mythread1("Second");
		mythread1 t3=new mythread1("Third");
		System.out.print("\n t1 isAlive:" +t1.t.isAlive());
		System.out.print("\n t2 isAlive:" +t2.t.isAlive());
		System.out.print("\n t3 isAlive:" +t3.t.isAlive());
		try {
			
				System.out.print("\n Main thread Suspending");
				t1.t.join();
				t2.t.join();
				t3.t.join();
				System.out.print("\n Main thread Resumed");
			
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n t1 isAlive:" +t1.t.isAlive());
		System.out.print("\n t2 isAlive:" +t2.t.isAlive());
		System.out.print("\n t3 isAlive:" +t3.t.isAlive());
		System.out.print("\n Main thread terminated");
	


	}

}
