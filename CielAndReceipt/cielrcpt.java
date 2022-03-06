import java.util.Scanner;

public class cielrcpt{
	public static void main(String[] args){
		Scanner fxn=new Scanner(System.in);
		int t=fxn.nextInt();
		fxn.nextLine();
		for(int i=0;i<t;i++)
		{
			int n=fxn.nextInt();
			System.out.println(calculateMenu(n));
		}
		fxn.close();
	}
	public static int calculateMenu(int n)
	{
		int a=0;
		for(int i=2048;i>=1;i/=2)
		{
			if(n%i==0)
			{
				a+=n/i;
				break;
			}
			else if(n>i)
			{
				a+=(n/i);
				n=n%i;
			}
			else 
			{
				n=n%i;
			}
		}
		return a;
	}
}