package CollectionsAssignment;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class A7 {
	private Vector<Integer> list;

	public Vector<Integer> saveEvenNumbers(int N) {
		list = new Vector<>();
		for (int i = 1; i <= N; i++) {
			if(i%2==0)
				list.add(i);
			
		}
		return list;
	}

	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> newList = new Vector<>();
		for (int item : list) {
			newList.add(item * 2);
		}
		System.out.println(newList);
		return newList;
	}

	public Vector<Integer> printEvenNumbers(int N) {
		if (list.contains(N)) {
			System.out.println("Found:-" + " " + N);
		} else {
			System.out.println("0");
		}
		return list;
	}

	public static void main(String[] args) {
		A7 a = new A7();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int n = sc.nextInt();
		a.saveEvenNumbers(n);
		a.printEvenNumbers();
		a.printEvenNumbers(12);
	}

}
