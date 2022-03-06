import java.util.Scanner;

public class elections{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=edd.nextInt();
			int b=edd.nextInt();
			int c=edd.nextInt();
			System.out.println(electionResultAnnouncer(a,b,c));
		}
		edd.nextInt();
	}
	public static String electionResultAnnouncer(int a,int b,int c){
		if(a>50)
		{
			return "A";
		}
		else if(b>50)
		{
			return "B";
		}
		else if(c>50)
		{
			return "C";
		}
		else
		{
			return "Nota";
		}
	}
}