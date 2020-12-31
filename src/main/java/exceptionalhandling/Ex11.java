package exceptionalhandling;
// finally block

class sample1 {
	public void A() {   // in this A(); exception raised, finally executed
		System.out.print("\n A executing");
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.print("\n e=" +e);
		}
		finally {
			System.out.print("\n A finally");
		}
		System.out.print("\n A terminates");
	}
	public void B() {   // in B(); exception not raised, finally executed
		System.out.print("\n B executing");
		try {
			System.out.print("\n No exception");
		}
		catch(ArithmeticException e) {
			System.out.print("\n e=" +e);
		}
		finally {
			System.out.print("\n B finally");
		}
		System.out.print("\n B terminates");
	}
	public void C(int x) {   // in c(); finally executed,
		                     //  last statement not printed since try case is true
		System.out.print("\n C executing");
		try {
			if (x==1)
				return;
		}
		finally {
			System.out.print("\n C finally");
		}
		System.out.print("\n C terminates");
	}
}

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 obj = new sample1();
		obj.A();
		obj.B();
		obj.C(1);
		

	}

}
