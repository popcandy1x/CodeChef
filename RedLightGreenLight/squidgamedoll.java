import java.util.Scanner;

public class squidgamedoll{
	public static void main(String[] args){
		Scanner dcn=new Scanner(System.in);
		int t=dcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=dcn.nextInt();
			int k=dcn.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=dcn.nextInt();
			}
			System.out.println(shotNumber(a,k));
		}
	}
	public static int shotNumber(int[] a,int k){
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>k)
			{
				s++;
			}
		}
		return s;
	}
}