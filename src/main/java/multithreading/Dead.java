package multithreading;
// deadlock

class printer1 {

 synchronized public void print(scanner1 sobj) {
		System.out.print("\n printing..." );
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.print("\n Error" +e);
		}
		sobj.scanresourse();
		System.out.print("\n completed printing ..." );
	}
 synchronized void printresourse() {
	 System.out.print("\n resourse of pprinter ..." );
 }
}

class scanner1 {

	 synchronized public void scan(printer1 pobj) {
			System.out.print("\n Scanning..." );
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.print("\n Error" +e);
			}
			pobj.printresourse();
			System.out.print("\n completed scanning ..." );
		}
	 synchronized void scanresourse() {
		 System.out.print("\n resourse of scanner ..." );
	 }
	}

class deadlock implements Runnable {
	printer1 pobj=new printer1();
	scanner1 sobj=new scanner1();
	Thread t;
	public deadlock() {
		t=new Thread(this, "deadlock");
		t.start();
		sobj.scan(pobj);
	}
	public void run() {
		pobj.print(sobj);
	}
}
public class Dead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deadlock dobj=new deadlock();

	}

}
