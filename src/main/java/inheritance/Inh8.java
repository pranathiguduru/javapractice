package inheritance;

// Hierarchical inheritance
//* constructors in hierarchical is same as single
//* super (s,r) in in second and third sub classes.
class student8 {
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
class batch1 extends student8 {
	private int m1,m2;
	public void setbatch1(int s1, int s2) {
		m1=s1;
		m2=s2;
	}
	public void showbatch1() {
		System.out.print("\n m1=" +m1+ "\n m2=" +m2);
	
}
}
class batch2 extends student8 {
	private int m1,m2;
	public void setbatch2(int s1, int s2) {
		m1=s1;
		m2=s2;
	}
	public void showbatch2() {
		System.out.print("\n m1=" +m1+ "\n m2=" +m2);
	
}
}

public class Inh8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		batch1 obj1 = new batch1();
		batch2 obj2 = new batch2();
		obj1.setstudent("penny", 30);
		obj1.setbatch1(95, 85);
		
		obj2.setstudent("ram", 20);
		obj2.setbatch2(90, 80);
		
		obj1.showstudent();
		obj1.showbatch1();
		
		obj2.showstudent();
		obj2.showbatch2();

	}

}
