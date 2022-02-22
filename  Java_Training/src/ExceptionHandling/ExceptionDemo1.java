package ExceptionHandling;
import java.util.*;
public class ExceptionDemo1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0;i<n;i++){
		a[i]= sc.nextInt();
		}
		System.out.println("Enter the index of the array elements you want to access");
		int pos=sc.nextInt();
		try{
		System.out.println("the array  element at index  " +pos+ "="  +a[pos] );
		}
		catch(Exception e){
		System.out.println("Exception occured"+e);
		}
		}
		}


