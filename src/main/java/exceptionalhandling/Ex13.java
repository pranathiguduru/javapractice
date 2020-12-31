package exceptionalhandling;
// creation of user defined or custom exception
//1. user defined exception class should extend from exception class
//2. and should contain toString() method to return error message

class DepositException extends Exception {
	private String errmsg="";
	public DepositException (String msg) {
		errmsg=msg;
	}
	public String toString() {
		return errmsg;
	}
}
class bank1 {
	private String name;
	private int accno;
	private double bal;
	public void createacc(String s, int ano, double amt) throws DepositException{
		try {
			
		if(amt<1000)
			throw new DepositException("min bal should be 1000");
		name=s;
		accno=ano;
		bal=amt;
		System.out.print("\n Acc created");
		
		}
		catch(DepositException e) {
			System.out.print("\n e=" +e);
		}
	}
	public void showacc() {
		System.out.print("\n name="+name+" \t accno="+accno+"\t bal="+bal);
	}
}

public class Ex13 {

	public static void main(String[] args) throws DepositException{
		// TODO Auto-generated method stub
		bank1 obj1 = new bank1();
		obj1.createacc("Penny", 320, 5000);
		System.out.print("\n obj1" );
		obj1.showacc();
		
		bank1 obj2 = new bank1();
		obj2.createacc("Shawn", 350, 800);
		System.out.print("\n obj2" );
		obj2.showacc();
		

	}

}
