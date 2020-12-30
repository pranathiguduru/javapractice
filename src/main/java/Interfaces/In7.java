package Interfaces;
// nested interfaces or member interfaces

interface A {
	public interface Inter7 {
		public void sum (int x,int y);
	}
}
class B implements A.Inter7 {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
}

public class In7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.sum(3, 5);
		A.Inter7 i= obj;
		obj.sum(2, 5);

	}

}
