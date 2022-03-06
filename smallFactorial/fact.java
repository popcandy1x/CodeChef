import java.util.Scanner;
import java.math.BigInteger;

public class fact{
	public static void main(String[] args){
		Scanner eddrun=new Scanner(System.in);
		int t=eddrun.nextInt();
		eddrun.nextLine();
		for(int i=0;i<t;i++)
		{
			int n=eddrun.nextInt();
			BigInteger a=findfactorial(n);
			System.out.println(a);
		}
		eddrun.close();
	}
	public static BigInteger findfactorial(int x)
	{
		BigInteger y=BigInteger.valueOf(x);
		for(int i=x-1;i!=0;i--)
		{
			y=y.multiply(BigInteger.valueOf(i));
		}
		return y;
	}
}