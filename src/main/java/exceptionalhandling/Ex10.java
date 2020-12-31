package exceptionalhandling;

class myclass {
	public void divide(int x, int y) {
		int z=0;
		try {
			
			if(y==0)
				throw new ArithmeticException();
			z = x/y;
			System.out.print("\n z=" +z);
		}
		catch(ArithmeticException e) {
			System.out.print("\n e=" +e);
			throw e;
		}
	}
}

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass obj= new myclass();
		try {
			obj.divide(12, 3);
			obj.divide(4, 0);
		}
		catch(ArithmeticException e) {
			System.out.print("\n recaught=" +e);
		}
		System.out.print("\n Program terminates");


	}

}
