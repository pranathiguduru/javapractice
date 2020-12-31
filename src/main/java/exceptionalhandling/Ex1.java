package exceptionalhandling;
// Arithmetic exception

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		try {
			c = a/b;
			System.out.print("\n c=" +c);
		}
		catch(ArithmeticException e) {
			System.out.print("\n Error: Divide by zero");
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");

	}

}
