import java.util.Scanner;

public class popCornCombo{
	public static void main(String[] args){
		Scanner pc=new Scanner(System.in);
		int t=pc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a1=pc.nextInt();
			int a2=pc.nextInt();
			int b1=pc.nextInt();
			int b2=pc.nextInt();
			int c1=pc.nextInt();
			int c2=pc.nextInt();
			int s1=a1+a2;
			int s2=b1+b2;
			int s3=c1+c2;
			if(s1>maxCombo(s2,s3))
			{
				System.out.println(s1);
			}
			else
			{
				System.out.println(maxCombo(s2,s3));
			}
		}
	}
	public static int maxCombo(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}