import java.util.Scanner;

public class Mahasena{
	public static void main(String[] args){
		Scanner xs=new Scanner(System.in);
		int n=xs.nextInt();
		xs.nextLine();
		int e=0,o=0;
		for(int i=0;i<n;i++)
		{
			int a=xs.nextInt();
			if(a%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
		}
		if(e>o)
		{
			System.out.println("READY FOR BATTLE");
		}
		else
		{
			System.out.println("NOT READY");
		}
		e=0;
		o=0;
		xs.close();
	}
}