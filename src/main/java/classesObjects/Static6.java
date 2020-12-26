package classesObjects;
// static block

class A6 {
	static int x;
	static {
		System.out.print("\n executes");
		x=100;
		System.out.print("\n x=" +x);
		System.out.print("\n terminates");
	}
	public void show() {
		System.out.print("\n Show----");
		System.out.print("\n x="+x);
	}
}

public class Static6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\n -------------");
		A6 obj =new A6();
		System.out.print("\n ------");
		obj.show();
		obj.show();

	}

}
