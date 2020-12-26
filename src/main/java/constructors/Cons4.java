package constructors;
// dynamic initialization
import java.io.*;

class bank2 {
	private String name;
	private int empno;
	public bank2() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		try {
			System.out.print("\n Enetr name and empno");
			name = br.readLine();
			empno = Integer.parseInt(br.readLine());
		}
		catch (NumberFormatException e){
			
			System.out.print("\n Invalid");
		}
	
	}
	public void showvalues() {
		System.out.print("\n name= "+name+ "\nemp no= "+empno);
	}
}

public class Cons4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		bank2 b= new bank2();
		System.out.print("\n B values");
		b.showvalues();
		bank2 b1= new bank2();
		System.out.print("\n B1 values");
		b1.showvalues();

	}

}
