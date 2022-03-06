import java.util.Scanner;

public class smagicGrid{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scn.nextInt();
			int m=scn.nextInt();
			int t=0;
			int[] a=new int[n];
			a[0]=1;
			for(int k=0;k<m;k++)
			{
				a[k+1]=a[k];
				a[k]=t;
				if(m-1==n-1)
				{
					a[0]=a[k];
					a[k]=t;
				}
			}
			for(int k=0;k<n;k++)
			{
				if(a[k]==1)
				{
					System.out.println(k);
				}
			}
		}
		scn.close();
	}
}