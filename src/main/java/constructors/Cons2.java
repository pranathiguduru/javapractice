package constructors;

class bank {
	private String name;
	private int empno;
	public bank() {
		name="Sai";
		empno=200;
	}
	public void showvalues() {
		System.out.print("\n name= "+name+ "\nemp no= "+empno);
	}
}

public class Cons2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b1=new bank();
		bank b2=new bank();
		System.out.print("\n b1==");
		b1.showvalues();
		System.out.print("\n b2==");
		b2.showvalues();
		

	}

}

