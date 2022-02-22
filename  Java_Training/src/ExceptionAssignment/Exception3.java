package ExceptionAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n= sc.nextInt();
     	int a[]=new int[n];
		System.out.println("enter the elements in the array");
		try{
			for(int i=0;i<n;i++){
				a[i]= Integer.parseInt(sc.next());
				}
			System.out.println("Enter the index of the array elements you want to access");
			int pos=sc.nextInt();
		System.out.println("the array  element at index  " +pos+ "="  +a[pos] );
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception occured"+e);
		}
		catch(InputMismatchException e){
			System.out.println("exception occur"+e);
		}
		catch(NumberFormatException e){
			System.out.println("exception occur"+e);
	}

	}
}
