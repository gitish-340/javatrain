package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any value");
		String s = sc.nextLine();
		try {
			int n = Integer.parseInt(s);
			System.out.println(n*n);
		}
		catch(Exception e) {
			System.out.println("Entered input is not a valid  format for  an integer.");
		}
	

}
}
