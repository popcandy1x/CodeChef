import java.util.Scanner;

public class FirstLastIt{
	public static void main(String[] args){
		Scanner xew=new Scanner(System.in);
		int t=xew.nextInt();
		xew.nextLine();
		for(int i=0;i<t;i++)
		{
			int x=xew.nextInt();
			int j=x%10;
			while((x/10)!=0)
			{
				x/=10;
			}
			j+=x;
			System.out.println(j);
		}
		xew.close();
	}
}