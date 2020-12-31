package exceptionalhandling;
// Array Index Out of bounds exception

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("\n First argument=" +args[0]);
			System.out.print("\n Second argument=" +args[1]);
			System.out.print("\n Third argument=" +args[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("\n Error: Index out of range");
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");


	}

}
