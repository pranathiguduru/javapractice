package exceptionalhandling;
// Null Pointer Exception

class sample {
	public int x=10;
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj[];
		try {
			obj= new sample[2];
			obj[0]=new sample();
			obj[1]=new sample();
			System.out.print("\n obj[0].x=" +obj[0].x);
			System.out.print("\n obj[1].x=" +obj[1].x);
		}
		catch (NullPointerException e){
			System.out.print("\n e=" +e);
		}
		System.out.print("\n Program terminates");


	}

}
