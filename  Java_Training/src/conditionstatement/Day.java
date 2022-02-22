package conditionstatement;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter day between 0 to 6 Day = "); 
		int day = s.nextInt();
		if (day == 0)
		{
		System.out.println("\n Sunday");
		}
		else if (day == 1)
		{
		System.out.println("\n Monday");
		}
		else if (day == 2)
		{
		System.out.println("\n Tuesday");
		}
		 else if (day == 3)
		{
		System.out.println("\n Wednesday");
		}
		else if (day == 4)
		{
		System.out.println("\n Thursday");
		}
		else if (day == 5)
		{
		System.out.println("\n Friday");
		}
		else if (day==6)
		{
		System.out.println("\n Saturday");
		}
		else
		{
		System.out.println("\n Wrong input");
		}
		}
		

	}


