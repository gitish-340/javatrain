package ExceptionAssignment;
import java.util.*;
public class Avg {


			static public void Marks() throws Exception {

				Scanner sc = new Scanner(System.in);
				System.out.println("enter the number of elements you want to enter ");
				int n =sc.nextInt();
				int sum =0,i;
				float avg =0;
				int a[]= new int[n];
				int b [] = new int[n];
				String name= new String();
				System.out.println("enter the name");
				for(i=0;i<a.length+1;i++) {
					name =sc.nextLine();
				}
				System.out.println("enter the marks of student 1:-");
				for( i =0;i<n;i++) {
					a[i]=sc.nextInt();
				}
				for( i=0;i<a.length;i++) {
					System.out.println("the marks of the student 1  :-  "+a[i]);
				}
				System.out.println("enter the marks of student 2:-");
				for( i=0;i<n;i++) {
					b[i]=sc.nextInt();
				}
				for( i=0;i<b.length;i++) {
					System.out.println("the marks of the student 2 is   :- "+b[i]);
				}
				for( i=0;i<a.length;i++) {
					sum +=a[i];
				}
				 avg = sum /n;
				System.out.println("the sum of the marks of student 1 :-  "+sum);
				System.out.println("the average of the marks of student 1 :-  "+avg);
                
				for( i=0;i<b.length;i++) {
					sum+=b[i];
				}
				avg =sum /n;
				System.out.println("the sum of the marks of student 2 :-  " +sum);
				System.out.println("the averge of the marks of student 2 :-  "+avg);
				sc.close();
				if (a[i]<0 ||b[i]<0) {
					throw new Exception("negative marks");
				}
			}

			public static void main(String args[]) {
				try {
					Marks();
				} catch (Exception e) {
					System.out.println("Exception caught " + e);
				}

			}
		}