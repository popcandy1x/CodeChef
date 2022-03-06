import java.util.Scanner;

public class Finader{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		s.nextLine();
		for(int i=0;i<t;i++)
		{
			int a=s.nextInt(),b=s.nextInt();
			System.out.println(a%b);
		}
		s.close();
	}
}