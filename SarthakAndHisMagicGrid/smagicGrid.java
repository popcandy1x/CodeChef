import java.util.Scanner;

public class smagicGrid{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scn.nextInt();
			int[][] a=new int[n][n];
			for(int k=0;k<n;k++)
			{
				for(int j=0;j<n;j++)
				{
					a[k][j]=1;
				}
			}
			for(int k=0;k<n;k++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[k][j]+" ");
				}
				System.out.println();
			}
		}
		scn.close();
	}
}