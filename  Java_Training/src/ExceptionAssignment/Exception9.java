package ExceptionAssignment;
import java.io.*;
import java.util.*;
public class Exception9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("the quotient of a/b:-" +c);
		//throw e;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("inside finally block");
		}
	}

}
