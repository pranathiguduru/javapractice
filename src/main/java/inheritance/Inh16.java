package inheritance;
// final method
class A16 {
	public final void show() {
		System.out.print("Show of A");
	}
}
class B16 extends A16 {
//	public final void show() {
//		System.out.print("Show of A");
//	}
	// error - won't work
	public void display() {
		System.out.print("\nShow of B");
	}
}

public class Inh16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B16 o = new B16();
		o.show();
		o.display();

	}

}
