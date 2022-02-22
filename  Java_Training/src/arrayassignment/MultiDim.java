package arrayassignment;

import java.util.*;

public class MultiDim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r = sc.nextInt();
		System.out.println("Enter the number of Columns");
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter the elements to display a matrix");
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("the elements are :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(+a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
