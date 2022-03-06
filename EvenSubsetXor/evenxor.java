import java.util.*;
import java.lang.*;
import java.io.*;

public class evenxor{
	public static void main(String[] args){
		Scanner edd=new Scanner(System.in);
		int t=edd.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=edd.nextInt();
			int[] a=new int[n];
			a=giveEvenXorArray(n);
			if(n==1)
			{
			    System.out.print(6);
			}
			else
			{
			    for(int j=0;j<a.length;j++)
			    {
				System.out.print((long)a[j]+" ");
			    }
			}
			System.out.println();
		}
		edd.close();
	}
	// public static int binaryConverter(int n){
	// 	int k=1,a=0;
	// 	for(int i=n;i!=0;i/=2)
	// 	{
	// 		a+=(i%2)*k;
	// 		k*=10;
	// 	}
	// 	return a;
	// }
	public static boolean badNumberChecker(int n)
	{
		// for(int i=k;i!=0;i/=10)
		// {
		// 	a=i%10;
		// 	if(a==1)
		// 	{
		// 		s++;
		// 	}
		// }
		int s=Integer.bitCount(n);
		if(s%2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int[] giveEvenXorArray(int n)
	{
		int[] a=new int[n];	
		int count=0,s=3,i=0;
		while(s<1048577)
		{
			if(!badNumberChecker(s))
			{
				a[i]=s;
				i++;
			}
			s++;
			if(i==a.length)
			{
				break;
			}
		}
		return a;
	}
}