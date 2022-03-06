import java.util.Scanner;

public class eqcardgame{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			System.out.println(remainingCardsCollector(n));
		}
		edd.close();
	}
	public static int remainingCardsCollector(int n){
		int a=52;
		return a%n;
	}
}