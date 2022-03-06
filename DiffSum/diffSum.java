import java.util.Scanner;

public class diffSum{
	public static void main(String[] args){
		Scanner sx=new Scanner(System.in);
		int d=sx.nextInt();
		int e=sx.nextInt();
		if(d>e)
		{
			System.out.println(d-e);
		}
		else
		{
			System.out.println(d+e);
		}
	}
}