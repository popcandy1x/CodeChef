import java.util.Scanner;

public class InAndShip{
	public static void main(String[] args){
		Scanner san=new Scanner(System.in);
		int t=san.nextInt();
		san.nextLine();
		for(int i=0;i<t;i++)
		{
			String s=san.nextLine();
			getShipType(s);
		}
		san.close();
	}
	public static void getShipType(String s){
		if(s.equals("B")||s.equals("b"))
		{
			System.out.println("BattleShip");
		}
		else if(s.equals("C")||s.equals("c"))
		{
			System.out.println("Cruiser");
		}
		else if(s.equals("D")||s.equals("d"))
		{
			System.out.println("Destroyer");
		}
		else if(s.equals("F")||s.equals("f"))
		{	
			System.out.println("Frigate");
		}	
	}
}