import java.util.Scanner;

public class BlockGame{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scn.nextInt();
			if(confirmPalindrome(n))
			{
				System.out.println("wins");
			}
			else
			{
				System.out.println("loses");
			}
		}
	}
	public static boolean confirmPalindrome(int n){
		int s=0;
		for(int i=n;i!=0;i/=10)
		{
			s+=i%10;
			s*=10;
		}
		if(s/10==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}