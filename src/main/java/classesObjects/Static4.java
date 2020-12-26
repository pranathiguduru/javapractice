package classesObjects;
class StaticMethod {
	private static int x;
	private int y;
	public void setvalues(int a, int b) {
		x=a;
		y=b;
	}
	public void showvalues() {
		System.out.print("\n static x value=" +x);
		System.out.print("\n Non static y value=" +y);
	}
	public static void showstatic() {
		System.out.print("\n static x value=" +x);
	}
	
}

public class Static4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj = new StaticMethod();
		obj.setvalues(10, 20);
		obj.showvalues();
		obj.showstatic();

	}

}
