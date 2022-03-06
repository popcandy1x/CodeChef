import java.util.*;
import java.io.*;
import java.math.BigInteger;


public class pinbs{
	 static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
               e.printStackTrace();
            }
        return str;
        }
    }
    public static void main(String[] args){
		FastReader scn = new FastReader();
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		{
			String s=scn.nextLine();
			BigInteger y=new BigInteger(s);

				if(checkPrimeBinaryString(y))
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
		}
	}
	public static boolean checkPrimeBinaryString(BigInteger y)
	{
		BigInteger x=new BigInteger("9");
		if(y.compareTo(x)==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}