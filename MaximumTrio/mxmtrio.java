import java.util.Scanner; 

public class mxmtrio{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			int[] a=new int[n];
			for(int s=0;s<a.length;s++)
			{
				a[s]=edd.nextInt();
			}
			System.out.println((long)(a[maxIndexFinder(a)]-a[minIndexFinder(a)])*secondGreatestElementFinder(a));
		}
	}
	public static int maxIndexFinder(int[] b){
		int max=b[0],maxindex=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
				maxindex=i;
			}
		}	
		return maxindex;
	}
	public static int minIndexFinder(int[] b){
		int min=b[0],minindex=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min=b[i];
				minindex=i;
			}
		}	
		return minindex;
	}
	public static int secondGreatestElementFinder(int[] b){
		int max=0;
		int t=maxIndexFinder(b);
		for(int i=0;i<b.length;i++)
		{
			if(i!=t)
			{
				if(b[i]>max)
				{
					max=b[i];
				}
			}
		}
		return max;
	}
}