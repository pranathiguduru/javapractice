package exceptionalhandling;
// Nested try

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		try {
			a=Integer.parseInt(args[0]);
			try {
			b=Integer.parseInt(args[1]);
			c = a/b;
			System.out.print("\n c=" +c);
			}
			catch(ArithmeticException e1) {
				System.out.print("\n e=" +e1);
			}
			
		}
		catch(NumberFormatException e2){
			System.out.print("\n e=" +e2);
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.print("\n e=" +e3);
		}
		System.out.print("\n Program terminates");

	}

}
