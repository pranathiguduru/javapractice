package constructors;
// parameterized constructors
// constructor with parameters

class bank1 {
	private String name;
	private int empno;
	public bank1(String n, int e) {
		name=n;
		empno=e;
	}
	public void showvalues() {
		System.out.print("\n name= "+name+ "\nemp no= "+empno);
	}
}

public class Cons3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 b1=new bank1("Penny", 20);
		bank1 b2=new bank1("shawn", 30);
		System.out.print("\n b1==");
		b1.showvalues();
		System.out.print("\n b2==");
		b2.showvalues();
		

	}

}
