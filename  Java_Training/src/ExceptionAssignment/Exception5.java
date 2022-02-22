package ExceptionAssignment;
import java.util.*;
public class Exception5 {

	public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int quotient = a / b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} catch (Exception e) {
			System.out.println(e + " caught");
		} finally {
			System.out.println("Inside finally block");
		}

		sc.close();
	}
		}
