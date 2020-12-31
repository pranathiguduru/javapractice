package exceptionalhandling;
//tostring method

class bank {
	private String name;
	private int accno;
	public void setbank(String s, int n) {
		name=s;
		accno=n;
	}
	public String toString() {
		return "\t name="+name+" \t accno="+accno;
	}
}

public class tostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank obj=new bank();
		obj.setbank("Penny", 230);
		System.out.print("\n Bank:" +obj);
		String str="\n Bank details:" +obj;
		System.out.print("\n str=" +str);
		String str1=obj.toString();
		System.out.print("\n str1=" +str1);

	}

}
