package constructors;
// dummy constructor
class C {
	public C() {
		
	}
	public C(int x) {
		System.out.print("\n Cons with 1 arg");
	}
	public void show() {
		System.out.print("\n No cons");
	}
}

public class Cons6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob1= new C();
		C ob2= new C(10);
	ob1.show();
		ob2.show();
	}

}
