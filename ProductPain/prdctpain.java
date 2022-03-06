import java.util.Scanner;

public class prdctpain{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			int[] a=new int[n];
			for(int k=0;k<a.length;k++)
			{
				a[k]=xed.nextInt();
			}
			System.out.println(threeSubsWeightCalculator(a));
		}
		xed.close();
	}
	public static int threeSubsWeightCalculator(int[] a){
		int sum=0;
		for(int k=0;k<a.length;k++)
		{
			for(int i=k;i<a.length;i++)
			{
				for(int j=k;j<=i;j++)
				{
					int l=k;h=i,p=0;
					while(l<=h)
					{
						p=(h+l)/2;
						if(a[p]>)
					}
				}
			}
		}
		return sum;
	}
}