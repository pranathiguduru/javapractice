package inheritance;
// final classes
// those cannot be inherited
final class A17 {
	public final void show() {
		System.out.print("Show of A");
	}
}
//class B17 extends A17 {
//
//	public void display() {
//		System.out.print("\nShow of B");
//	}
//}
// Error - wont work

public class Inh17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A17 o = new A17();
		o.show();


	}

}
