package inheritance;
// when we want to pass arguments to super class constructor then 
// it is compulsory to use super method for calling constructor explicitly
class students {
	private String name;
	private int rno;
	public students(String s, int n) {
		name=s;
		rno=n;
	}
	public void showstudents() {
			System.out.print("\n name=" +name+ "\n rno=" +rno);
		
	}
	
}
class markss extends students {
	private int m1,m2;
	public markss(String s, int n, int s1, int s2) {
		super(s,n);
		m1=s1;
		m2=s2;
	}
	public void showmarkss() {
		System.out.print("\n m1=" +m1+ "\n m2=" +m2);
	
}
}

public class Inh7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		markss obj = new markss("penny", 30, 90,80);
		obj.showstudents();
		obj.showmarkss();

	}

}


