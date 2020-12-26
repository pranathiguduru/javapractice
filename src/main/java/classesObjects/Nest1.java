package classesObjects;
// non static nested class
// inner class can access members of outer class without using obj name

class A1 {
	private int x=100;
	public void show() {
		B1 obj=new B1();
		obj.display();
	}
	class B1 {
		public void display() {
			System.out.print("\n x=" +x);
		}
	}
}

public class Nest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj1 = new A1();
		obj1.show();

	}

}
