package inheritance;

//Dynamic method dispatch

class A13 {
	public void show() {
		System.out.print("\n show of A13");
	}
}
class B13 extends A13 {
	public void show() {
		System.out.print("\n show of B13");
	}
	
}
class C13 extends B13 {
	public void show() {
		System.out.print("\n show of c13");
	}
}
public class Inh13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	C13 objc=new C13();
	B13 objb=new B13();
	A13 obja=new A13();

	A13 r;
	r=obja;
	obja.show();
	
	r=objb;
	objb.show();
	
	r=objc;
	objc.show();
	
	

	}

}