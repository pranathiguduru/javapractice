package Interfaces;
//multiple inheritance
// possible only in interfaces, not in classes

interface Inter1 {
	void sum (int x,int y);
}
interface Inter2 {
	void sub (int x,int y);
}
class mycls implements Inter1, Inter2 {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
	public void sub(int x,int y) {
		System.out.print("\n sub=" +(x-y));
	}
}

public class In2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			myclass obj=new myclass();
			obj.sum(4, 5);
			obj.sub(3, 1);

	}

}
