package classesObjects;

public class stud {

	public static void main(String[] args) {
		
		
		student obj=new student();
		obj.name="Pranathi";
		obj.rn=1;
		obj.sub1=40;
		obj.sub2=50;
	//	obj.setstudent("Penny", 1, 30, 100);
		obj.calculate();
		obj.printstudent();

	}

}
class student {
	public String name, res;
	public int rn, sub1, sub2, tot;
	public double avg;
//	public void setstudent(String n, int r, int s1, int s2)
//	{
//		name=n;
//		rn=r;
//		sub1=s1;
//		sub2=s2;
//	}
	public void calculate()
	{
		tot=sub1+sub2;
		avg=tot/2;
		if(sub1>=35 && sub2>=35)
			res="PASS";
		else
			res="FAIL";
	}
	public void printstudent() {
		System.out.println("name="+name+ 
				"rn="+rn+ "Sub1="+sub1+"sub2="+sub2+"tot="+tot+"avg="+avg+"res="+res);
}
	}


