package arrayassignment;
import java.util.*;
public class Insertion {

	public static void main(String[] args) {
		int pos ,x;
		System.out.println("How many number of elements you want to enter");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int arr[] = new int [size+1];
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.print("Enter the position where you want to insert element:");
        pos = sc.nextInt();
        System.out.print("Enter the element you want to insert:");
        x = sc.nextInt();
        for(int i=arr.length-1; i > pos; i--){
            arr[i] = arr[i-1];
           }
           arr[pos] = x;
           System.out.println("New Array: "+Arrays.toString(arr));
           
	}

}
