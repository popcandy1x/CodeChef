/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args){
		Scanner xed=new Scanner(System.in);
		int t=xed.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=xed.nextInt();
		    int x=xed.nextInt();
		    if(x<=n)
		    {
		        System.out.println(x);
		    }
		    else
		    {
		        System.out.println((x%n)-1);
		    }
		}
		xed.close();
	}
}
