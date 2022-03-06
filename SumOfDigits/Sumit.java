import java.util.Scanner;

public class Sumit{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		xed.nextLine();
		for(int i=0;i<t;i++)
		{
			int a=xed.nextInt(),sum=0;
			while(a!=0)
			{
				sum+=a%10;
				a/=10;
			}
			System.out.println(sum);
		}
		xed.close();
	}
}