import java.util.Scanner;

public class CodeChef{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		x.nextLine();
		for(int i=0;i<t;i++)
		{
		int a=5;
		int n=x.nextInt();
		int y=x.nextInt();
		int z=x.nextInt();
		if((y+z)%2==0)
		{
			a=0;
		}
		else
		{
			a=1;
		}
		System.out.println(a);
		}
	}
}