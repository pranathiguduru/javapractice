package Interfaces;


interface inter {
	void sum (int x,int y);
	void sub (int x, int y);
}


class myclass implements inter {
	public void sum(int x,int y) {
		System.out.print("\n sum=" +(x+y));
	}
	public void sub(int x,int y) {
		System.out.print("\n sub=" +(x-y));
	}
	public void mult(int x,int y) {
		System.out.print("\n mult=" +(x*y));
	}
}


class In1 {
	public static void main(String s[]) {
		myclass obj=new myclass();
		obj.sum(4, 5);
		obj.sub(3, 1);
		obj.mult(9, 2);
	}

}
