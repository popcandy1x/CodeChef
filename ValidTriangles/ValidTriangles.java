import java.util.Scanner;

public class VaidTriangles{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		xcn.nextLine();
		for(int i=0;i<t;i++)
		{
			int x=xcn.nextInt();
			int y=xcn.nextInt();
			int z=xcn.nextInt();
			if(checkValid(x,y,z))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		xcn.close();
	}
	public static boolean checkValid(int a,int b,int c){
		if(a+b+c==180)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}