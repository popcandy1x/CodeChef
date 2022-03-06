import java.util.Scanner;

public class Lead{
	public static void main(String[] args){
		Scanner xc=new Scanner(System.in);
		int t=xc.nextInt();
		int x=0,y=0,n,max=0,w,l;
		for(int i=0;i<t;i++)
		{
			x+=xc.nextInt();
			y+=xc.nextInt();
			n=x-y;
			if(i==0)
			{
				max=n;
			}
			else
			{
				max=maxLead(max,n);
			}
		}
		l=Math.abs(max);
		if(max<0)
		{
			w=2;
		} 
		else
		{
			w=1;
		}
		System.out.println(w+" "+l);
		xc.close();
	}
	public static int maxLead(int max,int n)
	{
		if(Math.abs(n)>Math.abs(max))
		{
			max=n;
			return n;
		}
		else
		{
			return max;
		}
	}
}