package Interfaces;
// interface reference variable referencing its sub class object

interface Inter6 {
	void sum (int x,int y);
	void sub (int x,int y);
}
class mycls6 implements Inter6 {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
	public void sub(int x,int y) {
		System.out.print("\n sub=" +(x-y));
	}
	
}

public class In6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Inter6 obj=new mycls6();
			obj.sum(4, 5);
			obj.sub(3, 1);

	}

}
