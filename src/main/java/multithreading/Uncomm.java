package multithreading;
// without inter-communication between producer and consumer

class shop {
	int pno=0;
	synchronized public void put(int n) {
		pno=n;
		System.out.print("\n produced..." +pno);
	}
	synchronized public void get() {
		System.out.print("\n consumed..." +pno);
	}
}
class producer implements Runnable {
	Thread t;
	shop sob;
	public producer(shop ob) {
		sob=ob;
		t=new Thread(this, "producer");
		t.start();
	}
	public void run() {
		try {
			for(int i=0; i<=5; i++) {
				Thread.sleep(2000);
				sob.put(i);
			}
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
	}
}
class consumer implements Runnable {
	Thread t;
	shop sob;
	public consumer(shop ob) {
		sob=ob;
		t=new Thread(this, "consumer");
		t.start();
	}
	public void run() {
		try {
			for(int i=0; i<=5; i++) {
				sob.get();
				Thread.sleep(1000);
				
			}
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
	}
}

public class Uncomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop sob=new shop();
		producer p=new producer(sob);
		consumer c=new consumer(sob);

	}

}
