package arrayassignment;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		System.out.println("enter the number of elements");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[]= new int[size];
		int i;
		System.out.println("enter the elements");
		for( i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=0;
		for(int j=0;j<a.length;j++) {
			if(max<a[j]) {
				max = a[j];
			}
			else {
				min=a[j];
			}
		}
		System.out.println("the maximum value of an array"+max);
		System.out.println("the minimum value of an array"+min);
		
		
	}

}
