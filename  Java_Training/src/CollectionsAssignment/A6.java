package CollectionsAssignment;

import java.util.*;

public class A6 {
	private LinkedList<Integer> list;

	public LinkedList<Integer> saveEvenNumbers(int N) {
		list = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			if(i%2==0)
				list.add(i);

		}
		return list;
	}

	public LinkedList<Integer> printEvenNumbers() {
		LinkedList<Integer> newList = new LinkedList<>();
		for (int item : list) {
			newList.add(item * 2);
		}
		System.out.println(newList);
		return newList;
	}

	public LinkedList<Integer> printEvenNumbers(int N) {
		if (list.contains(N)) {
			System.out.println("Found:-" + " " + N);
		} else {
			System.out.println("0");
		}
		return list;
	}

	public static void main(String[] args) {
		A6 a = new A6();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int n = sc.nextInt();
		a.saveEvenNumbers(n);
		a.printEvenNumbers();
		a.printEvenNumbers(12);
	}
}