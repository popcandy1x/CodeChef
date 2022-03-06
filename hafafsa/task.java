import java.util.Scanner;

public class task{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int n=xed.nextInt();
		switch(n){
			case 1:
				System.out.println("Enter the two numbers:");
				double a=xed.nextDouble();
				double b=xed.nextDouble();
				System.out.println("What do you want to do with them:");
				char c=xed.next().charAt(0);
				if(c=='+')
				{
					System.out.println(a+b);
				}
				else if(c=='-')
				{
					System.out.println(a-b);
				}
				else if(c=='*')
				{
					System.out.println(a*b);
				}
				else if(c=='/')
				{
					if(b==0&&a==0)
					{
						System.out.println("division not possible");
					}
					else if(b==0)
					{
						System.out.println(b/a);
					}
					else
					{
						System.out.println(a/b);
					}
				}
				break;
			case 2:
				System.out.println("Enter your text:");
				xed.nextLine();
				String s=xed.nextLine();
				char[] d=s.toCharArray();
				int text=0;
				for(int i=0;i<d.length;i++)
				{
					if(d[i]!=' ')
					{
						text++;
					}
				}
				int f=d.length-text+1;
				System.out.println("No of words="+f);
				break;
			case 3:
				System.out.println("Enter the dimensions of your pattern:");
				int k=xed.nextInt();
				int m=xed.nextInt();
				int[][] e=new int[k][m];
				for(int i=0;i<e.length;i++)
				{
					for(int j=0;j<e[i].length;j++)
					{
						if(i>=j)
						{
							System.out.print("*"+" ");
						}
					}
					System.out.println();
				}
				break;
			case 4:
				System.out.println("All Tasks Over!");
				break;
			case 5:
				System.out.println("Welcome to return 0");
				break;
			default:
				System.out.println("No selection,try next year");
				break;
		}
	}
}