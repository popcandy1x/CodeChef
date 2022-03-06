import java.util.Scanner;

public class IamGroot{
	public static void main(String[] args){
		Scanner ham=new Scanner(System.in);
		int t=ham.nextInt();
		ham.nextLine();
		for(int i=0;i<t;i++)
		{
			int s=ham.nextInt();
			System.out.println((int)(Math.round(Math.sqrt(s))));
		}
		ham.close();
	}
}