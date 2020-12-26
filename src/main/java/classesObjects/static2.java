package classesObjects;
// static variable value is constant 
class A {
	private static int x;
	private int y;
	public void setvalues(int a, int b) {
		x=a;
		y=b;
	}
	public void showvalues() {
		System.out.print("\n static x value=" +x);
		System.out.print("\n Non static y value=" +y);
	}
}

public class static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1= new A();
		A obj2= new A();
	
		
		obj2.setvalues(100, 300);
		System.out.print("\n Using obj2--");
		obj2.showvalues();
		System.out.print("\n Using obj1--");
		obj1.showvalues();
	}

}
