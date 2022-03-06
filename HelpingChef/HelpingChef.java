import java.util.Scanner;

public class HelpingChef{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			if(n<=10)
			{
				System.out.println("Thanks for helping Chef!");
			}
			else
			{
				System.out.println(-1);
			}
		}
		sc.close();
	}
}