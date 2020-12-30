package inheritance;
class A2 {
	public void sum(int x, int y) {
		System.out.print("\n sum=" +(x+y));
	}
	public void sub(int x, int y) {
		System.out.print("\n sub=" +(x-y));
	}
}
class B2 extends A2 {
	public void mult(int x, int y) {
		System.out.print("\n mult=" +(x*y));
	}
}

public class Inh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 obj = new B2();
		obj.sum(10, 20);
		obj.sub(5, 10);
		obj.mult(3, 5);

	}

}
