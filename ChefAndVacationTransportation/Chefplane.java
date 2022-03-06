import java.util.Scanner;

public class Chefplane{
	public static void main(String[] args){
		Scanner exd=new Scanner(System.in);
		int t=exd.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=exd.nextInt();
			int y=exd.nextInt();
			int z=exd.nextInt();
			System.out.println(routeTeller(x,y,z));
		}
	}
	public static String routeTeller(int x,int y,int z){
		if(x+y<z)
		{
			return "PLANEBUS";
		}
		else if(z<x+y)
		{
			return "TRAIN";
		}
		else
		{
			return "EQUAL";
		}
	}	
}