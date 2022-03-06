import java.util.Scanner;

public class marble{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			edd.nextLine();
			String s=edd.nextLine();
			char[] c=new char[n];
			c=s.toCharArray();
			s=edd.nextLine();
			char[] p=new char[n];
			p=s.toCharArray();
			replaceQuestionMark(c,p);
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[j]);
			}
			System.out.println();
			for(int j=0;j<c.length;j++)
			{
				System.out.print(p[j]);
			}
			// System.out.println(minOperator(c,p));
		}
		edd.close();
	}
	public static void replaceQuestionMark(char[] a,char[] b){
		char t='u';
		for(int i=0;i<b.length;i++)
		{
			if(b[i]=='?'&&vowelChecker(a[i]))
			{
				t=a[i];
				break;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]=='?')
			{
				b[i]=t;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='?')
			{
				a[i]=t;
			}
		}
	}
	public static boolean vowelChecker(char a){
		if(a=='a'||a=='i'||a=='e'||a=='o'||a=='u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int minOperator(char[] a,char[] b){
		int s=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=a[i])
			{
				if((!vowelChecker(b[i])&&vowelChecker(a[i]))||(vowelChecker(b[i])&&!vowelChecker(a[i])))
				{
					s+=1;
				}
				else
				{
					s+=2;
				}
			}
		}
		return s;
	}
}