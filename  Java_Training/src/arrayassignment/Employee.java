package arrayassignment;

import java.util.*;

public class Employee {

	public static void sum(int arr[]) {
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += i;
		}
		double avg = 0;
		double l = arr.length;
		avg = sum / l;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sum(a);
		sc.close();

	}

}  