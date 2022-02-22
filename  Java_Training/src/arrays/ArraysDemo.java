package arrays;
import java.util.*;
public class ArraysDemo {

	public static void main(String[] args) {
		System.out.println("How many numbers are you want to insert");
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int array1[] = new int[size];//subscripts []
		
		for(int i=0;i<size;i++) {
			array1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println("the numbers are :"+array1[i]);
		}
	}

}
