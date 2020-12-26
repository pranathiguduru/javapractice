package classesObjects;

//AreaTriangle
public class areatri {

	public static void main(String[] args) {
		triangle obj = new triangle();
		obj.readvalues(4, 5);
		obj.cal_area();
		obj.printvalues();

	}

}

// Triangle
class triangle {
	private int base, height;
	private double area;

	//readValues
	public void readvalues(int b, int h) {
		base = b;
		height = h;
	}

	//calcArea
	public void cal_area() {
		area = 0.5 * base * height;

	}
	
	//printValues
	public void printvalues() {
		System.out.print("\n base=" + base + "\nheight=" + height + "\narea=" + area);
	}
}
