package exceptionalhandling;
// checked exceptions

public class Ex12 {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		System.out.print("\n Prgm on checked exp");
		try {
			throw new ClassNotFoundException("cls not found");
		}
		catch(ClassNotFoundException e) {
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");

	}

}
