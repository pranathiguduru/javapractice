package inheritance;
//method overriding
//* solution is to add super keyword in sub class
class A5 {
	public void show() {
		System.out.print("\n show of A5");
	}
}
class B5 extends A5 {
	public void show() {
		System.out.print("\n show of B5");
	}
	public void display() {
		show();
	// show();
	//*	super.show();
	}
	
}
public class Inh5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B5 obj= new B5();
		obj.display();

	}

}
