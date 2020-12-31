package exceptionalhandling;
// Negative array size exception

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], n, i;
		try {
			n=Integer.parseInt(args[0]);
			a=new int[n];
			for(i=0; i<n; i++) {
				a[i] = (i+1) *10;
				System.out.print("\t" +a[i]);
			}
		}
		catch (NegativeArraySizeException e){
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");

	}

}
