package classesObjects;
// public static method
// can be accessed without object

class C {
	private static String name;
	private static int age;
	public static void setvalues(String a, int b) {
		name=a;
		age=b;
	}
	public static void showvalues() {
		System.out.print("\n Name=" +name);
		System.out.print("\n Age=" +age);
	}
}

public class Static5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C.setvalues("Penny", 23);
		C.showvalues();
	}

}
