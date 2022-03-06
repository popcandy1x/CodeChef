import java.util.Scanner;

public class TheNextPalindrome{
	public static void main(String[] args)
	{
		Scanner xcan=new Scanner(System.in);
		int t=xcan.nextInt();
		xcan.nextLine();
		for(int i=0;i<t;i++)
		{
			int n=xcan.nextInt();
			int j=n;
			while(true)
			{
				j++;
				if(checkPalindrome(j))
				{
					break;
				}
			}
			System.out.println(j);
		}
		xcan.close();
	}
	public static boolean checkPalindrome(int n){
		int p=0;
		for(int i=n;i!=0;i/=10)
		{
			p+=i%10;
			p*=10;
		}
		if((p/10)==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}