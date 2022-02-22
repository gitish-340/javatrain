package arrays;

import java.util.*;

public class ArrayDemo2 {
	public void sum(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
	}

	public static void main(String[] args) {
		ArrayDemo2 a1 = new ArrayDemo2();
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
