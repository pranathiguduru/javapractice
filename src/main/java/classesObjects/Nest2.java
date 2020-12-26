package classesObjects;
// static nested class
// inner class can't access members of outer class directly
// it should access indirectly using object name

class A11 {
	private int x=100;
	public void show() {
		B11 obj=new B11();
		obj.display(this);
	}
	static class B11 {
		public void display(A11 ob) {
			System.out.print("\n ob.x=" +ob.x);
		}
	}
}

public class Nest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11 obj1 = new A11();
		obj1.show();

	}

}
