import java.util.Scanner;

public class primethesis{
	public static void main(String[] args){
		Scanner dcx=new Scanner(System.in);
		int t=dcx.nextInt();
		for(int i=0;i<t;i++)
		{
			int s=dcx.nextInt();
			if(confirmPrime(s))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		dcx.close();
	}
	public static boolean confirmPrime(int n){
		if(n==1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
		}
		return true;
	}
}