import java.util.Scanner;

public class cprime{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		xan.nextLine();
		for(int i=0;i<t;i++)
		{
			int n=xan.nextInt();
			System.out.print(countPrimes(n));
		}
		xan.close();
	}
	public static int countPrimes(int n)
	{
		int s=0;
		for(int i=n-1;i>1;i--)
		{
			int a=1;
			for(int k=2;k<=i/2;k++)
			{
				if(i%k==0)
				{
					a=0;
					break;
				}
			}
			if(a==1)
			{
				s++;
			}
		}
		return s;
	}
}