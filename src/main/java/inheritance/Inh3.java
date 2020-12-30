package inheritance;
// single inheritance
class student {
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
class marks extends student {
	private int m1,m2;
	public void setmarks(int s1, int s2) {
		m1=s1;
		m2=s2;
	}
	public void showmarks() {
		System.out.print("\n m1=" +m1+ "\n m2=" +m2);
	
}
}

public class Inh3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks obj = new marks();
		obj.setstudent("penny", 30);
		obj.setmarks(95, 85);
		obj.showstudent();
		obj.showmarks();

	}

}
