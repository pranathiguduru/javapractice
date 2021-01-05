package multithreading;
// creation of user defined thread class implementing runnable interface
class userthread1 implements Runnable {
	Thread t;
	public userthread1(String tname) {
		t=new Thread(this, tname);
		System.out.print("\n Child thread created" +t);
		t.start();
	}
	public void run() {
		System.out.print("\n Child thread started");
		try {
			for(int i=0; i<=5; i++) {
				System.out.print("\n Child thread " +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n Child thread terminated");
	}
}

public class Th2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n Main thread started");
		userthread1 obj=new userthread1("apex");
		try {
			for(int i=0; i<=5; i++) {
				System.out.print("\n Main thread " +i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n Main thread terminated");
	

	}

}
