import java.util.Scanner;

public class SumParity{
	public static void main(String[] args){
		Scanner acn=new Scanner(System.in);
		int t=acn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=acn.nextInt();
			int a=acn.nextInt();
			if(isEven(n,a)==1)
			{
				System.out.println("EVEN");
			}
			else if(isEven(n,a)==0)
			{
				System.out.println("ODD");
			}
			else if(isEven(n,a)==-1)
			{
				System.out.println("IMPOSSIBLE");
			}
		}
		acn.close();
	}
	public static int isEven(int n,int a)
	{
		int b=a&1;
		if(n==1)
		{
			if(a%2==0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else if(b==1)
		{
			if(n%2==0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return -1;
		}
	}
}