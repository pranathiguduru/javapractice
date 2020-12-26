package classesObjects;
// public static variable
// can be used without any object

class B {
	public static int x;
}

public class Static3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B.x=100;
		// use directly as classname.public static variable without any objects
		System.out.print("\n B.x="+B.x);

	}

}
