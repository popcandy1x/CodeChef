import java.util.Scanner;

public class TotalExpenses{
	public static void main(String[] args){
		Scanner acn=new Scanner(System.in);
		int t=acn.nextInt();
		for(int i=0;i<t;i++)
		{
			int q=acn.nextInt();
			int p=acn.nextInt();
			System.out.println(String.format("%.6f",expenses(q,p)));
		}
		acn.close();
	}
	public static double expenses(int q,int p){
		double expense=q*p;
		if(q>1000)
		{
			expense-=expense*.1;
		}
		return expense;
	}
}