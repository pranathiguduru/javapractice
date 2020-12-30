package Interfaces;
// variables in interfaces
// static and final - constant in whole program

interface Inter5 {
	int A=30;
}
class mycls5 implements Inter5 {
	public void show() {
		System.out.print("\n A=" +A);
	}
}

public class In5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycls5 obj = new mycls5();
		obj.show();
		System.out.print("\n interface A=" +Inter5.A);
		System.out.print("\n class A=" +mycls5.A);

	}

}
