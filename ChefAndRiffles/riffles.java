import java.util.*;
import java.lang.*;
import java.io.*;

public class riffles{
	public static void main(String[] args){
		Scanner ex=new Scanner(System.in);
		int t=ex.nextInt();
		int[] a;
		for(int i=0;i<t;i++)
		{
			int n=ex.nextInt();
			int k=ex.nextInt();
			int b=n,s=0;
			a=new int[n];
			for(int p=1;p<=n;p++)
			{
				a[p-1]=p;
			}
			while(b!=1)
			{
				b/=2;
				s++;
			}
			int l=n/2;
			if((l%2)==0)
			{
				for(int j=0;j<k%s;j++)
				{
					a=riffle(a,n);
				}
			}
			else
			{
				for(int j=0;j<k%(n-2);j++)
				{
					a=riffle(a,n);
				}
			}
			for(int q=0;q<n;q++)
			{
				System.out.print(a[q]+" ");
			}
			System.out.print("\n");
		}
		ex.close();
	}
	public static int[] riffle(int[] a,int n){
		int[] b=new int[n];
		b[0]=a[0];
		b[n-1]=a[n-1];
		for(int i=1;i<n-1;i++)
		{
			if(i%2==0)
			{
				b[i/2]=a[i];
			}
			else 
			{
				b[(n/2)+(i/2)]=a[i];
			}
		}
		return b;
	}
}
