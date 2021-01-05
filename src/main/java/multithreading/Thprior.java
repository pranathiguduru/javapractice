package multithreading;

class mythreadp implements Runnable {
	Thread t;
	long count=0;
	volatile boolean flag = false;
	public mythreadp(int pno) {
		t=new Thread(this, "Race");
		t.setPriority(pno);
		flag=true;
	}
	public void begin() {
		t.start();
	}
	public void stop() {
		flag=false;
	}
	public void run() {
		while(flag) {
			count++;
		}
	}
}
public class Thprior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythreadp t1=new mythreadp(3);
		mythreadp t2=new mythreadp(7);
		System.out.print("\n thread t1 and t2 starting");
		t1.begin();
		t2.begin();
		try {
			System.out.print("\n Main thread Suspending for 5 sec");
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		t1.stop();
		t2.stop();
		try {
			t1.t.join();
			t2.t.join();
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n Main thread Resumed");
		System.out.print("\n Count of t1:" +t1.count);
		System.out.print("\n Count of t2:" +t2.count);

	}

}
