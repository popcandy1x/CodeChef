import java.util.Scanner;

public class keplerslaw{
	public static void main(String[] args){
		Scanner txn=new Scanner(System.in);
		int t=txn.nextInt();
		for(int i=0;i<t;i++)
		{
			int tz=txn.nextInt();
			int ty=txn.nextInt();
			int rz=txn.nextInt();
			int ry=txn.nextInt();
			if(keplerSatisfied(tz,ty,rz,ry))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
		txn.close();
	}
	public static boolean keplerSatisfied(int t1,int t2,int r1,int r2){
		if(Math.pow(t1,2)/Math.pow(r1,3)==Math.pow(t2,2)/Math.pow(r2,3))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}