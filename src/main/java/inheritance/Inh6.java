package inheritance;
// constructors in inheritance
// If we want to call superclass constructor explicitly 
// use super() method.
class A6 {
	public A6() {
		System.out.print("\n constructor of A6");
	}
}
class B6 extends A6 {
	public B6() {
	//	super();
		System.out.print("\n constructor of B6");
	}
}

public class Inh6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B6 obj=new B6();

	}

}
