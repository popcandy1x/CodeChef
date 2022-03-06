import java.util.Scanner;

public class twosum{
	public static void main(String[] args){
		Scanner xcn=new Scanner(System.in);
		int t=xcn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=xcn.nextInt();
			int[] crr=new int[n];
			int tar=xcn.nextInt();
			for(int j=0;j<crr.length;j++)
			{
				crr[j]=xcn.nextInt();
			}
			int[] brr=twoSum(crr,tar);
			for(int j=0;j<brr.length;j++)
			{
				System.out.print(brr[j]+" ");
			}
			System.out.println();
		}
	}
	 public static int[] twoSum(int[] a,int target){
		int[] b=new int[2];
		for(int i=0;i<a.length;i++)
		{
			int k=0;
            while(k<a.length)   
            {
                if(a[i]+a[k]==target&&i!=k)
                {
                    b[0]=i;
                    b[1]=k;
                    return b;
                }
                else
                {
                    k++;
                }
            }
		}
        b[0]=-1;
        b[1]=-1;
        return b;
	}
}

