package constructors;
//copy constructor

class bank7 {
	private String name;
	private int empno;
	public bank7() {}
	public void setbank7(String n, int e) {
		name=n;
		empno=e;
	}
	public bank7(bank7 ob) {
		name = ob.name;
		empno= ob.empno;
	}
	public void showvalues() {
		System.out.print("\n name= "+name+ "\nemp no= "+empno);
	}
}

public class Cons7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank7 b1 = new bank7();
		b1.setbank7("pen", 10);
		bank7 b2 = new bank7(b1);
		System.out.print("\n b1==");
		b1.showvalues();
		System.out.print("\n b2==");
		b2.showvalues();

	}

}
