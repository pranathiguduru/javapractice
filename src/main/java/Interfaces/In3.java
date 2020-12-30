package Interfaces;
// extending super class and implementing interface

interface Inter3 {
	void sum(int x, int y);
}

class math1 {
	public void sub(int x, int y) {
		System.out.print("\n sub=" + (x - y));
	}
}

class myclass1 extends math1 implements Inter3 {
	public void sum(int x, int y) {
		System.out.print("\n sum=" + (x + y));
	}
}

public class In3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass1 obj = new myclass1();
		obj.sum(4, 5);
		obj.sub(3, 1);

	}

}
