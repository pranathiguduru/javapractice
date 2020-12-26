package classesObjects;
class StaticVariable {
	static int x;
}

public class static1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariable obj1= new StaticVariable();
		StaticVariable obj2 = new StaticVariable();
		StaticVariable obj3 = new StaticVariable();
		StaticVariable.x= 100;
		System.out.print("\n obj1.x="+obj1.x);
		System.out.print("\n obj2.x="+obj2.x);
		System.out.print("\n obj3.x="+obj3.x);
		obj3.x=300;
		System.out.print("\n After changing");
		System.out.print("\n obj1.x="+obj1.x);
		System.out.print("\n obj2.x="+obj2.x);
		System.out.print("\n obj3.x="+obj3.x);

	}

}
