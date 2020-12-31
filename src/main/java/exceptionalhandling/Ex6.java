package exceptionalhandling;
//Multiple catch blocks

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c = a/b;
			System.out.print("\n c=" +c);
		}
		catch(ArithmeticException e1) {
			System.out.print("\n e=" +e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.print("\n e=" +e2);
		}
		catch (NegativeArraySizeException e3){
			System.out.print("\n e=" +e3);
		}
		catch (NullPointerException e4){
			System.out.print("\n e=" +e4);
		}
		catch (NumberFormatException e5){
			System.out.print("\n e=" +e5);
		}
		System.out.print("\n Program terminates");

	}

}
