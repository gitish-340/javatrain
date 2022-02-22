package arrays;
import java.util.*;
public class ArrayPractice 
{
	public void sum(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
		
	}

	public static void main(String[] args) {
		ArrayPractice a1 = new ArrayPractice();
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		a1.sum(a);

	}

}
