import java.util.Scanner;

public class Reverb{
	public static void main(String[] args){
		Scanner xcan=new Scanner(System.in);
		int t=xcan.nextInt();
		xcan.nextLine();
		for(int i=0;i<t;i++)
		{
			int n=xcan.nextInt();
			int j=0;
			while(n!=0)
			{
				j+=n%10;
				j*=10;
				n/=10;
			}
			System.out.println(j/10);
		}
		xcan.close();
	}
}