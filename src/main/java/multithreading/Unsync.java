package multithreading;
// unsynchronization
//* for synchronization -1) METHOD SYNCHRONIZATION - add the synchronized keyword for method 
// 2) SYNCHRONIZED STATEMENT - add the synchronized block in run method

class printer {
	 public void print(String filename) {
	//* synchronized public void print(String filename) {
		System.out.print("\n printing..." +filename);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		System.out.print("\n completed..." +filename);
	}
}

class computer implements Runnable {
	printer pobj;
	String filename;
	Thread t;
	public computer(printer p, String fname) {
		pobj=p;
		filename=fname;
		t=new Thread(this, "unsync");
		t.start();
	}
//	public void run() {
//		pobj.print(filename);
//	}
	public void run() {
		synchronized(pobj) {
			pobj.print(filename);
		}
	}
}
public class Unsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer prn=new printer();
		computer c1=new computer(prn, "A.java");
		computer c2=new computer(prn, "B.java");
		computer c3=new computer(prn, "C.java");
		try {
			c1.t.join();
			c2.t.join();
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}

	}

}
