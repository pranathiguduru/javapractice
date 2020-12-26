package classesObjects;

public class ArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj[]= new sample[2];
		obj[0]=new sample();
		obj[1]=new sample();
		obj[0].x=10;
		obj[1].x=20;
		System.out.print("\n obj[0]="+ obj[0].x);
		System.out.print("\n obj[1]="+ obj[1].x);
	}

}
class sample {
	int x;
}

