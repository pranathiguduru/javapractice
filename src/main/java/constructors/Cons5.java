package constructors;
//constructor overloading
class bank5 {
	private String name;
	private int empno;
	public bank5() {
		name="Sai";
		empno=200;
	}
	public bank5(String s) {
		name=s;
		empno=300;
	}
	public bank5(String s, int n) {
		name=s;
		empno=n;
	}
	public void showvalues() {
		System.out.print("\n name= "+name+ "\nemp no= "+empno);
	}
}

public class Cons5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank5 b1 = new bank5();
		bank5 b2 = new bank5("Sun");
		bank5 b3 = new bank5("Hen", 400);
		System.out.print("\n b1==");
		b1.showvalues();
		System.out.print("\n b2==");
		b2.showvalues();
		System.out.print("\n b3==");
		b3.showvalues();

	}

}
