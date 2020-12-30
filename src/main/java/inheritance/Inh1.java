package inheritance;
// private of super class not inherited to sub class
class A {
	private int x =10;
	public int y=20;
	protected int z=30;
	int p=40;
}
class B extends A {
	public void show() {
	//	System.out.print("\n x="+x);
		System.out.print("\n y="+y);
		System.out.print("\n z="+z);
		System.out.print("\n p="+p);
	}
}

public class Inh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();
		//System.out.print("\n obj.x="+obj.x);
		System.out.print("\n obj.y="+obj.y);
		System.out.print("\n obj.z="+obj.z);
		System.out.print("\n obj.p="+obj.p);

	}

}
