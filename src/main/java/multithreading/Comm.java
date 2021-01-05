package multithreading;
// inter-communication between producer and consumer
// we use wait() and notify() for communication

class shop1 {
	int pno=0;
	boolean flag=false;
	synchronized public void put(int n) {
		try { 
			if(flag==true) 
				wait();
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		pno=n;
		System.out.print("\n produced..." +pno);
		flag=true;
		notify();
	}
	synchronized public void get() {
		try { 
			if(flag==false) 
				wait();
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n consumed..." +pno);
		flag=false;
		notify();
	}
}
class producer1 implements Runnable {
	Thread t;
	shop1 sob;
	public producer1(shop1 ob) {
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
class consumer1 implements Runnable {
	Thread t;
	shop1 sob;
	public consumer1(shop1 ob) {
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

public class Comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shop1 sob=new shop1();
		producer1 p=new producer1(sob);
		consumer1 c=new consumer1(sob);

	}

}


