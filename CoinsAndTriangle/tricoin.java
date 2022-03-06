import java.util.Scanner;

public class tricoin{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		long t=xed.nextLong();
		for(long i=0;i<t;i++)
		{
			long k=xed.nextLong();
			System.out.println(triangleHeightFinder(k));
		}
		xed.close();
	}
	public static long triangleHeightFinder(long k){
		long l=0,h=k,p=0;
		while(l<=h)
		{
			p=(l+h)/2;
			long t=((p*(p+1))/2);
			if(k==t)
			{
				return p;
			}
			else if(k<t)
			{
				h=p-1;
			}
			else if(k>t)
			{
				l=p+1;
			}
		}
		return h;
	}
}