package classesObjects;

public class rect {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.readValues(3, 5);
		obj.printValues();

		obj.add(1, 2);
		obj.printValues();

		obj.subtract(3, 4);
		obj.printValues();
	}

}

class Rectangle {
	private int xcoordinate, ycoordinate;

	public void readValues(int x, int y) {
		xcoordinate = x;
		ycoordinate = y;

	}

	public void add(int a, int b) {
		xcoordinate += a;
		//xcoordinate = xcoordinate + a;
		ycoordinate = ycoordinate + b;
	}

	public void subtract(int c, int d) {
		xcoordinate = xcoordinate - c;
		ycoordinate = ycoordinate - d;
	}

	public void printValues() {
		System.out.println(xcoordinate + "," + ycoordinate);
	}

}