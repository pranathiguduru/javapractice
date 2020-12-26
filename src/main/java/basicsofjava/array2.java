package basicsofjava;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][], i, j;
		a=new int[2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		System.out.print("\n Matrix\n");
		for(i=0;i<2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.print("\t" + a[i][j]);
			}
			System.out.print("\n");
		}

	}

}
