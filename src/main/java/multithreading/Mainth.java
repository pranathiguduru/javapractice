package multithreading;

public class Mainth {
	public static void main (String args[]) {
		System.out.print("\n Main thread started");
		Thread t=Thread.currentThread();
		System.out.print("\n Main thread details:" +t);
		System.out.print("\n thread name:" +t.getName());
		System.out.print("\n thread priority no:" +t.getPriority());
		t.setName("Apex");
		t.setPriority(8);
		System.out.print("\n Thread details after change:"+t);
		System.out.print("\n thread name:"+ t.getName());
		System.out.print("\n thread priority no:" +t.getPriority());
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
