/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class pma
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=xcn.nextInt();
		    int[] a=new int[n];
		    a[0]=xcn.nextInt();
		    int positiveindicesmin=Math.abs(a[0]);
		    int positiveindicesminindex=0;
		    int negativeindicesmax=a[0];
		    int negativeindicesmaxindex=0;
		    for(int i=1;i<a.length;i++)
		    {
		    	a[i]=xcn.nextInt();
		    	if(i%2==0)
		    	{
		    		if(Math.abs(a[i])<positiveindicesmin)
		    		{
		    			positiveindicesmin=Math.abs(a[i]);
		    			positiveindicesminindex=i;
		    		}
		    	}
		    	else
		    	{
		    		if(Math.abs(a[i])>negativeindicesmax)
		    		{
		    			negativeindicesmax=Math.abs(a[i]);
		    			negativeindicesmaxindex=i;
		    		}
		    	}
		    }
		    int d=0;
		    d=a[positiveindicesminindex];
		    a[positiveindicesminindex]=a[negativeindicesmaxindex];
		    a[negativeindicesmaxindex]=d;
		    int sum=0;
		    for(int i=0;i<a.length;i++)
		    {
		    	if(i%2!=0)
		    	{
		    	    sum-=Math.abs(a[i]);
		    	}
		    	else
		    	{
		    	    sum+=Math.abs(a[i]);
		    	}
		    }
		    System.out.println(sum);
		}
		xcn.close();
	}
}
