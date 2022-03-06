public class primeSetMul{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=scn.nextLong();
			long m=scn.nextLong();
			Vector<Long> a=new vector<Long>(20);
			for(long j=0;j<n;j++)
			{
				int s=scn.nextLong();
				a.add(s);
			}
			b=getSetOfPrimeFactors(m);
		}
	}
	public static boolean confirmSetOfPrimeFactors(long m,Vector<Long> a){
		for(long i=1;i<=m/2;i++)
		{
			if(m%i==0)
			{
				if(checkPrime(i))
				{
					for(long j=0;j<m;j++)
					{
						if(i!=a[j])
						{
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	public static boolean checkPrime(long n)
	{
		for(long i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	// public static int NumberOfPrimeFactorsInSet(Vector<Long> a,Vector<Long> b,int n)
	// {
	// 	int s=0;
	// 	for(int i=0;i<n;i++)
	// 	{
	// 		if(a[i]==b[i])
	// 		{
	// 			s++;
	// 		}
	// 	}
	// 	return s;
	// }
}