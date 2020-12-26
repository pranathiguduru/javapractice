package classesObjects;

public class SumObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex obj1, obj2, obj3;
		obj1= new Ex();
		obj2= new Ex();
		obj3= new Ex();
		obj1.setx(100);
		obj2.setx(200);
		obj3.sum(obj1, obj2);
		System.out.print("\n obj1.");
		obj1.showx();
		System.out.print("\n obj2.");
		obj2.showx();
		System.out.print("\n obj3.");
		obj3.showx();
	}

}
class Ex {
	private int x;
	public void setx(int a) {
		x = a;
	}
	public void showx() {
		System.out.print("x=" +x);
	}
	public void sum(Ex obj1, Ex obj2) {
		x=obj1.x +obj2.x;
	}
}
