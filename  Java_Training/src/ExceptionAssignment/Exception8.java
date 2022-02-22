package ExceptionAssignment;

import java.util.*;

public class Exception8 {

		public static void input(String Name, int age) throws Exception {

			if (age < 18 || age > 60) {
				throw new Exception("You are not elegiblie because of your age");
			} else {
				System.out.println("Entered name and age is acceptable");
			}
		}

		public static void main(String args[]) {
			System.out.println("Enter your name ");
			Scanner s = new Scanner(System.in);
			String n = s.nextLine();
			System.out.println("Enter the age ");
			int a = s.nextInt();
			s.close();
			try {
				input(n, a);
			} catch (Exception e) {
				System.out.println("Error message: " + e);
			}
		}
	}
