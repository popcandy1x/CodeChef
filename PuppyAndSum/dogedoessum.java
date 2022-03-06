import java.util.Scanner;

public class dogedoessum{
	public static void main(String[] args){
		Scanner xc=new Scanner(System.in);
		int t=xc.nextInt();
		for(int i=0;i<t;i++)
		{
			int d=xc.nextInt();
			int b=xc.nextInt();
			for(int k=0;k<d;k++)
			{
				b=calculateSum(b);
			}
			System.out.println(b);
		}
	}
	public static int calculateSum(int n)
	{
		int a=n*(n+1);
		return a/2;
	}
}