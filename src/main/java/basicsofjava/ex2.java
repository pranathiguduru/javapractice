package basicsofjava;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj=new sample();
		obj.setx(100);
		obj.printx();

		

	}

}
class sample {
	private int x;
	public void setx(int a)
	{
		x=a;
	}
	public void printx()
	{
		System.out.print("\n x=" +x);
	}
}