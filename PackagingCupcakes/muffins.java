import java.util.Scanner;

public class muffins{
	public static void main(String[] args){
		Scanner cx=new Scanner(System.in);
		int t=cx.nextInt();
		cx.nextLine();
		int max=0,rn=0;
		for(int i=0;i<t;i++)
		{
			int n=cx.nextInt();
			if(n==2)
			{
				rn=2;
			}
			else
			{
				for(int j=n/2;j<n;j++)
				{
					if(j==2)
					{
						max=n%j;
						rn=j;
					}
					else
					{
						if(n%j>max)
						{
							max=n%j;
							rn=j;
						}
					}
				}
			}
			System.out.println(rn);
		}
		cx.close();
	}
	public static int loopWork(int j,int n)
	{
		while(j<n)
		{
			return loopWork(j+1,n);
		}
	}
}