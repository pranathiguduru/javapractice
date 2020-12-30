package inheritance;
//instance variable overriding 
//* solution for overriding is using super keyword in method of sub class
class A4 {
	public int x=10;
}
class B4 extends A4 {
	public int x=20;
	public void showvalues() {
	//	System.out.print("\n x=" +x);
	//*	System.out.print("\n A4.x=" +super.x);
		System.out.print("\n B4.x=" +x);
	}
}


public class Inh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B4 obj= new B4();
		obj.showvalues();

	}

}
