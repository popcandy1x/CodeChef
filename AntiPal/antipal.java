import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;

public class antipal{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=xan.nextInt();
			xan.nextLine();
			String s=xan.nextLine();
			char[] b=s.toCharArray();
			if(validStringChecker(b))
			{
				System.out.println("yes");
				int[] a=new int[b.length];
				for(int l=0;l<b.length;l++)
				{
					a[l]=(int)b[l];
				}
				Arrays.sort(a);
				for(int l=0;l<b.length;l++)
				{
					b[l]=(char)a[l];
				}
				b=repeatIndexReverser(b);
				for(int l=0;l<b.length;l++)
				{
					System.out.print(b[l]);
				}
				System.out.println();
			}
			else
			{
				System.out.println("no");
			}
		}
		xan.close();
	}
	public static boolean validStringChecker(char[] c){
		int t=0;
		char b;
		if(c.length%2==0)
		{
			for(int i=0;i<c.length-1;i++)
			{
				if(c[i]==c[i+1])
				{
					b=c[i];
					for(int j=i;j<c.length;j++)
					{
						if(c[j]==b)
						{
							t++;
						}
					}
					if(t>c.length/2)
					{
						return false;
					}
					t=0;
				}
			}
		}
		else
		{
			return false;
		}
		return true;
	}
	public static char[] repeatIndexReverser(char[] c){
		int t=0;
		char d=' ';
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==c[i+1])
			{
				t=i;
				break;
			}
		}
		int newlength=c.length-t;
		char[] b=new char[newlength];
		for(int i=0;i<b.length;i++)
		{
			b[i]=c[i+t];
		}
		// Arrays.sort(b);
		for(int i=0;i<b.length/2;i++)
		{
			d=b[i];
			b[i]=b[b.length-i-1];
			b[b.length-i-1]=d;
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+t]=(char)b[i];
		}
		return c;
	}
}