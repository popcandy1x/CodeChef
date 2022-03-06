import java.util.Scanner;

public class DecInc{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int x=xcn.nextInt();
		if(x%4==0)
		{
			System.out.println(x+1);
		}
		else
		{
			System.out.println(x-1);
		}
		xcn.close();
	}
}

	