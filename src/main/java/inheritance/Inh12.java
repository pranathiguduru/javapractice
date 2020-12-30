package inheritance;
// super class reference variable referencing sub class object

class A12 {
	public void show() {
		System.out.print("\n show of A12");
	}
}
class B12 extends A12 {
	public void display() {
		System.out.print("\n display of B5");
	}
	
}
public class Inh12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	B12 objb=new B12();
	objb.show();
	objb.display();
	A12 obja;
	obja=objb;
	obja.show();

	}

}