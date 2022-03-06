import java.util.*;
import java.lang.*;
import java.io.*;

public class maxmean{
	public static void main(String[] args){
		Scanner xan=new Scanner(System.in);
		int t=xan.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xan.nextInt();
			int[] a=new int[n];
			for(int j=0;j<a.length;j++)
			{
				a[j]=xan.nextInt();
			}
			Arrays.sort(a);
			double mean=0;
			for(int j=0;j<a.length-1;j++)
			{
				mean+=a[j];
			}
			double mean1=mean/(a.length-1);
			double mean2=a[a.length-1];
			System.out.println(String.format("%.6f",mean1+mean2));
		}
		xan.close();
	}
}