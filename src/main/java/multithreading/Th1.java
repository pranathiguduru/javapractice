// creation of user defined thread class extending thread class
package multithreading;

class userthread extends Thread {
	public userthread(String tname) {
		super(tname);
		System.out.print("\n Child thread created" +this);
		start();
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

public class Th1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n Main thread started");
		userthread obj=new userthread("apex");
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
