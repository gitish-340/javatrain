package ExceptionAssignment;
import java.util.*;
public class Exception6 {
		static public void Marks() throws Exception {

			Scanner s = new Scanner(System.in);
			System.out.println("Enter the name of the student ");
			String name1 = s.nextLine();
			System.out.println("Enter the marks of the student in subject one:");
			int a = s.nextInt();
			System.out.println("Enter the marks of the student in subject 2:");
			int c = s.nextInt();
			System.out.println("Enter the marks of the student in subject 3:");
			int b = s.nextInt();
			int d = (a + b + c) / 3;
			System.out.println("Enter the name of the 2nd student: ");
			s.next();
			String name2 = s.nextLine();
			System.out.println("Enter the marks of the student in subject one:");
			int v = s.nextInt();
			System.out.println("Enter the marks of the student in subject 2:");
			int o = s.nextInt();
			System.out.println("Enter the marks of the student in subject 3:");
			int p = s.nextInt();
			s.close();
			int r = (v + o + p) / 3;
			if (a < 0 || b < 0 || c < 0 || v < 0 || p < 0 || o < 0) {
				throw new Exception("negative marks");
			}

			System.out.println("The average marks of " + name1 + " is " + d + " and of " + name2 + " is " + r);

		}

		public static void main(String args[]) {
			try {
				Marks();
			} catch (Exception e) {
				System.out.println("Exception caught " + e);
			}

		}
	}