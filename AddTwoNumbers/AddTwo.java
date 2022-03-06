import java.util.Scanner;

public class AddTwo{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		xan.nextLine();
		for(int i=0;i<t;i++)
		{
			int a=xan.nextInt();
			int b=xan.nextInt();
			System.out.println(a+b);
		}
		xan.close();
	}
}