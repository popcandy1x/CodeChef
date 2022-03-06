import java.util.Scanner;

public class WaterSports{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		x.nextLine();
		for(int i=0;i<t;i++)
		{
			int z=x.nextInt();
			int y=x.nextInt();
			int a=x.nextInt();
			int b=x.nextInt();
			int c=x.nextInt();
			if(canEnjoyAllThreeSports(z,y,a,b,c))
			{
				System.out.print("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
	public static boolean canEnjoyAllThreeSports(int z,int y,int a,int b,int c){
		if((z-y)>=(a+b+c))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}