package constructors;
// using finalize method
// for overcoming the disadvantage of garbage collector

class myclass {
	private int objno;
	public myclass(int n) {
		objno = n;
		System.out.print("\n Executing cons of obj" +objno);
	}
	protected void finalize() {
		System.out.print("\n finalize called for obj" +objno);
	}
}

public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass obj1=new myclass(1);
		createobjects();
System.gc();
		System.out.print("\n Program terminates");

	}
	public static void createobjects() {
		System.out.print("\n It started");
		myclass obj2=new myclass(2);
		myclass obj3=new myclass(3);
		System.out.print("\n It ended");
	}

}
