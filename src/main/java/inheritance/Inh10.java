package inheritance;
// object delegation
// alternative of inheritance
class A10 {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
}
class B10 {
	A10 obja=new A10();
	public void add(int x,int y) {
		obja.sum(x,y);
	}
}

public class Inh10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B10 obj = new B10();
		obj.add(10, 20);

	}

}
