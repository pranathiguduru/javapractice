package exceptionalhandling;
// handling all exceptions
// exception class contains all exceptions

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c = a/b;
			System.out.print("\n c=" +c);
		}
		catch(Exception e) {
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");

	}

}
