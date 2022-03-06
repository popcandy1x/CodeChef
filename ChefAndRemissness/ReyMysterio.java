import java.util.Scanner;

public class ReyMysterio{
	public static void main(String[] args){
		Scanner xc=new Scanner(System.in);
		int t=xc.nextInt();
		xc.nextLine();
		for(int i=0;i<t;i++)
		{
			int x=xc.nextInt();
			int y=xc.nextInt();
			System.out.println(minTimesEntry(x,y)+" "+maxTimesEntry(x,y));
		}
		xc.close();
	}
	public static int maxTimesEntry(int x,int y)
	{
		return x+y;
	}
	public static int minTimesEntry(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
}