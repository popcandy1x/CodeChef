import java.util.Scanner;

public class mxfacs{
	public static void main(String[] args){
		Scanner fen=new Scanner(System.in);
		int t=fen.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=fen.nextInt();
			System.out.println(giveMaxFactorsFactor(n));
		}
	}
	public static int giveMaxFactorsFactor(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return i;
			}
		}
		return n;
	}
}