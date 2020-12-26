package classesObjects;

public class emp {

	public static void main(String[] args) {
		employee obj = new employee();
		obj.reademployee("penny", 30, 6000);
		obj.calculate();
		obj.showemployee();

		employee obj2 = new employee();
		obj2.reademployee("sharan", 60, 4000);
		obj2.calculate();
		obj2.showemployee();
	}

}

class employee {
	private String name;
	private int empno, basic;
	private double hra, da, pf, it, netsal;

	public void reademployee(String n, int e, int b) {
		name = n;
		empno = e;
		basic = b;
	}

	public void calculate() {
		if (basic >= 5000) {
			hra = 0.4 * basic;
			da = 0.3 * basic;
			pf = 0.2 * basic;
			it = 0.1 * basic;
		} else {
			hra = 0.25 * basic;
			da = 0.15 * basic;
			pf = 0.08 * basic;
			it = 0.05 * basic;
		}

		netsal = basic + hra + da - (pf + it);
	}
	
	public void showemployee() {
		System.out.print("\nname=" + name + "\nempno=" + empno + "\nbasic=" + basic + "\nhra=" + hra + "\nda=" + da
				+ "\npf=" + pf + "\nit=" + it + "\nnetsal=" + netsal);
	}
}
