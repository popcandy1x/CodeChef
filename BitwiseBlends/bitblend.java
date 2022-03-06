public class bitblend{
	public static void main(String[] args){

	}
	public static boolean tastyChecker(int[] a){
		for(int i=0;i<a.length-1;i++)
		{
			if((a[i]&a[i+1])%2==(a[i]|a[i+1]))
			{
				return false;
			}
		}
		return true;
	}
	public static int[] canConvertToTasty
}