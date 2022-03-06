import java.util.Scanner;

public class insect{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			System.out.println((long)maxInterestingSequence(n));
		}
	}
	public static int maxInterestingSequence(int n)
	{
		int a=0;
		if(n%2!=0)
		{
			return 0;
		}
		else
		{
		    if(PowerOfTwoChecker(n))
		    {
		        for(int i=n;i!=1;i/=2)
			    {
				a++;
			    }
		    }
		    else
		    {
		        for(int i=n;i!=1;i/=2)
		        {
		            if(i%2!=0)
		            {
		                break;
		            }
		            a++;
		        }
		    }
		}
		return a;
	}
	public static boolean PowerOfTwoChecker(int n)
	{
		for(int i=n;i!=1;i/=2)
		{
			if(i%2!=0)
			{
				return false;
			}
		}
		return true;
	}
}