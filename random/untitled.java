import java.util.Scanner;

public class random{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=xed.nextInt();
			int[] a=new int[n];
			int p=0,k=0;
			while(k<=Integer.MAX_VALUE)
			{
				if(p>2)
				{
					int[] c=new int[p+1];
					for(int l=0;l<p;l++)
					{
						c[l]=a[l];
					}
					c[p]=k;
					if(subArrayXorDisplayer(c))
					{
						a[p]=k;
						p++;
						k++;
					}
					else
					{
						k++;
					}
				}
				else
				{
					a[p]=(int)Math.pow(2,k);
					p++;
					k++;
				}
				if(p==a.length)
				{
					break;
				}	
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static boolean subArrayXorDisplayer(int[] a){
		int sum=0;
		for(int k=0;k<a.length;k++)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=k;j<=i;j++)
				{
					sum^=a[j];
					if(j==i)
					{
						if(sum==0)
						{
							return false;
						}
						sum=0;
					}
				}
			}
		}
		return true;
	}
}