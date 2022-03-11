/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class stringprotocol
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int j=0;j<t;j++)
		{
		    int n=xcn.nextInt();
		    xcn.nextLine();
		    String s=xcn.nextLine();
		    int transfers=0;
		    int count=0;
		    for(int i=0;i<s.length();i++)
		    {	
		    	if(i!=s.length()-1&&s.charAt(i)==s.charAt(i+1))
		    	{
		    		count++;
		    		i++;
		    	}
		    	else
		    	{
		    		transfers++;
		    	}
		    	if(count==1)
		    	{
		    		count=0;
		    		transfers++;
		    	}
		    }
		    System.out.println(transfers);
		}
		xcn.close();
	}
}
