package exceptionalhandling;
// Number format exception

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="24",str2="56A";
		int n,m;
		try {
			n=Integer.parseInt(str1);
			System.out.print("\n n=" +n);
			m=Integer.parseInt(str2);
			System.out.print("\n m=" +m);
		}
		catch (NumberFormatException e){
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");


	}

}
