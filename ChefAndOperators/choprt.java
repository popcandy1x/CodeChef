import java.util.Scanner;

public class choprt{
	public static void main(String[] args){
		Scanner cxan=new Scanner(System.in);
		int t=cxan.nextInt();
		cxan.nextLine();
		for(int i=0;i<t;i++)
		{
			int x=cxan.nextInt();
			int y=cxan.nextInt();
			checkRelation(x,y);
		}
		cxan.close();
	}
	public static void checkRelation(int a,int b)
	{
		if(a>b)
		{
			System.out.println(">");
		}
		else if(a<b)
		{
			System.out.println("<");
		}
		else
		{
			System.out.println("=");
		}
	}
}