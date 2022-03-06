import java.util.Scanner;

public class snot{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=scan.nextInt();
			System.out.println(countNotes(a));
		}
		scan.close();
	}
	public static int countNotes(int n)
	{
		int a=0;
		a=n/100;
		n=n%100;

		a+=n/50;
		n=n%50;

		a+=n/10;
		n=n%10;

		a+=n/5;
		n=n%5;

		a+=n/2;
		n=n%2;
		a+=n;
		return a;
	}
}