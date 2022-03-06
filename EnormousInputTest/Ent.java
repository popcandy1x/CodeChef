import java.util.Scanner;

public class Ent{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		long k=x.nextInt();
		int s=0;
		for(int i=0;i<n;i++)
		{
			long a=x.nextInt();
			if(a%k==0)
			{
				s++;
			}
		}
		System.out.println(s);
		s=0;
		x.close();
	}
}