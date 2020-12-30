package inheritance;
// object composition
//alternative of multiple inheritance
class A11 {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
}
class B11 {
	
	public void sub(int x,int y) {
		System.out.print("\n sub=" +(x-y));
	}
}
class C11 {
	A11 obja=new A11();
	B11 objb=new B11();
	public void add(int x,int y) {
	obja.sum(x,y);
	}
	public void diff(int x,int y) {
		objb.sub(x,y);
		}
}

public class Inh11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C11 obj = new C11();
		obj.add(10, 20);
		obj.diff(40, 50);

	}

}


