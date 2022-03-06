import java.util.Scanner;

public class LuckFor{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scan.nextInt();
			System.out.println(numberOfFour(n));
		}
		scan.close();
	}
	public static int numberOfFour(int b)
	{
		int x=0,j=0;
		for(int i=b;i!=0;i/=10)
		{
			x=i%10;
			if(x==4)
			{
				j++;
			}
		}
		return j;
	}
}