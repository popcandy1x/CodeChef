/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xan.nextInt();
			int k=xan.nextInt();
			int m=xan.nextInt();
			xan.nextLine();
			String s=xan.nextLine();
			char[] b=s.toCharArray();
			ArrayList<Integer> a=new ArrayList<Integer>();
			 for (int j = 0; j<n; j++)
			 {
			 	a.add((int)(b[j]-'0'));
			 }
			System.out.println(whiteBallsCounter(a,k,m));
		}
	}
	public static int whiteBallsCounter(ArrayList<Integer> a,int k,int m){
		int l=0;
		for(int i=0;i<m;i++)
		{
		    int b=a.size();
			for(int j=0;j<a.size();j++)
			{
				if(a.get(j)!=0)
				{
					l=a.get(j);
					l*=k;
					a.set(j,l);
				}
				if(a.get(j)>9)
				{
					int t=a.get(j);
					a.set(j,t%10);
					for(int s=t/10;s!=0;s/=10)
					{
						a.add(s%10);
					}
				// 	String s=Integer.toString(a.get(j));
				// 	char[] d=s.toCharArray();
				// 	a.set(j,(int)(d[0]-'0'));
				// 	for(int f=1;f<d.length;f++)
				// 	{
				// 		a.add((int)(d[f]-'0'));
				// 	}
				}
				if(a.size()>1000000006)
				{
					break;
				}
				if(j==b-1)
				{
				    break;
				}
			}
		}
		return a.size()%1000000007;
	}
}
