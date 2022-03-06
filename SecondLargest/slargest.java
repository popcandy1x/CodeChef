import java.util.Scanner;

public class slargest{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		edd.nextLine();
		for(int i=0;i<t;i++)
		{
			int p=edd.nextInt();
			int q=edd.nextInt();
			int r=edd.nextInt();
			if(p>smallerNumber(q,r)&&p<largerNumber(q,r))
			{
				System.out.println(p);
			}
			else if(p<smallerNumber(q,r))
			{
				System.out.println(smallerNumber(q,r));
			}
			else
			{
				System.out.println(largerNumber(q,r));
			}
		}
		edd.close();
	}
	public static int smallerNumber(int x,int y){
		if(x<y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int largerNumber(int x,int y){
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
}