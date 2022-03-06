import java.util.Scanner;

public class squidrule{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xcn.nextInt();
			int[] squid=new int[n];
			for(int j=0;j<squid.length;j++)
			{
				squid[j]=xcn.nextInt();
			}
			System.out.println(maxPrize(squid));
		} 
		xcn.close();
	}
	public static int maxPrize(int[] a){
		int min=a[0],winnerIndex=0,maxPrizeMoney=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				winnerIndex=i;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i!=winnerIndex)
			{
				maxPrizeMoney+=a[i];
			}
		}
		return winnerIndex;
	}
}