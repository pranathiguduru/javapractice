package Interfaces;
// Extending Interfaces
interface Inter4 {
	void sum(int x, int y);
}
interface Inter44 extends Inter4 {
	void sub (int x,int y);
}
class mycls4 implements Inter44 {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
	public void sub(int x,int y) {
		System.out.print("\n sub=" +(x-y));
	}
}


public class In4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycls4 obj = new mycls4();
		obj.sub(5, 1);
		obj.sum(5, 1);

	}

}
