package inheritance;
// Multilevel inheritance
//* constructors is same concept
//* super (s,r) in in second sub class
//* super (s,r,s1,s2) in third sub class.
class student9 {
	private String name;
	private int rno;
	public void setstudent(String s, int n) {
		name=s;
		rno=n;
	}
	public void showstudent() {
			System.out.print("\n name=" +name+ "\n rno=" +rno);
		
	}
	
}
class marks9 extends student9 {
	protected int m1,m2;
	// have to use protected- it is inherited to sub class
	public void setmarks(int s1, int s2) {
		m1=s1;
		m2=s2;
	}
	public void showmarks() {
		System.out.print("\n m1=" +m1+ "\n m2=" +m2);
	
}
}
class result extends marks9 {
	private int tot;
	private double avg;
	public void calculate() {
		tot=m1+m2;
		avg=tot/2.0;
	}
	public void showresult() {
		System.out.print("\n tot=" +tot+ "\n avg=" +avg);
	
}
}

public class Inh9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result obj = new result();
		obj.setstudent("penny", 30);
		obj.setmarks(95, 85);
		obj.calculate();
		obj.showstudent();
		obj.showmarks();
		obj.showresult();

	}

}

