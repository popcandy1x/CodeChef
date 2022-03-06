import java.util.Scanner;

public class covsprd{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=xan.nextInt();
			int y=xan.nextInt();
			System.out.println(trackSpread(x,y));
		}
		xan.close();
	}
	public static int trackSpread(int n,int d){
		int p=1;
		if(d==1)
		{
			return 1;
		}
		else
		{
			for(int i=1;i<=d;i++)
			{
				if(i<11)
				{
					p*=2;
				}
				else if(i>=11)
				{
					p*=3;
				}
				if(p>=n)
				{
					return n;
				}
			}
			return p;
		}
	}
}