import java.util.Scanner;

public class rmntrev{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xed.nextInt();
			int k=xed.nextInt();
			xed.nextLine();
			String c=xed.nextLine();
			char[] s=c.toCharArray();
			s=kReverser(s,k);
			for(int j=0;j<s.length;j++)
			{
				System.out.print(s[j]);
			}
			System.out.println();
		}
		xed.close();
	}
	public static char[] kReverser(char[] s,int k)
	{
		char t=' ';
		for(int i=k;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(i%2!=0)
				{
					t=s[j];
					s[j]=s[i-j-1];
					s[i-j-1]=t;
					if(j==i/2-1)
					{
						break;
					}
				}
				else
				{
					t=s[j];
					s[j]=s[i-j-1];
					s[i-j-1]=t;
					if(j==i/2-1)
					{
						break;
					}
				}
			}
		}
		return s;
	}
}