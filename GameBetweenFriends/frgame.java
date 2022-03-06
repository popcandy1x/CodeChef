import java.util.Scanner;

public class frgame{
	public static void main(String[] args){
		Scanner fan=new Scanner(System.in);
		int t=fan.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=fan.nextInt();
			int b=fan.nextInt();
			int c=fan.nextInt();
			int d=fan.nextInt();
			if(a>=b)
			{
				b+=c;
				if(b>a)
				{
					a+=d;
					System.out.println(checkWinner(a,b));
				}
				else
				{
					b+=d;
					System.out.println(checkWinner(a,b));
				}
			}
			else
			{
				a+=c;
				if(a>=b)
				{
					b+=d;
					System.out.println(checkWinner(a,b));
				}
				else
				{
					a+=d;
					System.out.println(checkWinner(a,b));
				}
			}
		}
	}
	public static String checkWinner(int a,int b)
	{	
		if(a>=b)
		{
			return "N";
		}
		else
		{
			return "S";
		}
	}
}