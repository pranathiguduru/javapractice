package inheritance;
// abstract and concrete classes
abstract class math1 {
	abstract public void sum(int x, int y);
	abstract public int square(int x);
	public void mult(int x,int y) {
		System.out.print("\n mult =" +(x*y));
	}
}
class myclas extends math1 {
	public void sum(int x, int y) {
		System.out.print("\n sum=" +(x+y));
	}
	public int square(int x) {
		System.out.print("\n square=" +(x*x));
		return(x*x);
	}
	public void sub(int x, int y) {
		System.out.print("\n sub=" +(x-y));
	}
}

public class Inh14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclas obj=new myclas();
		obj.sum(5, 7);
		obj.mult(3, 2);
		obj.sub(7, 3);
		obj.square(3);

	}

}
