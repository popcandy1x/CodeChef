import java.util.Scanner;

public class Atm{
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		int x=san.nextInt();
		double y=san.nextDouble();
		double z;
		if(x%5==0&&y>=(x+.5))
		{
			z=y-x-.5;	
			System.out.println(String.format("%.2f",z));
		}
		else
		{
			System.out.println(String.format("%.2f",y));
		}
		san.close();
	}
}