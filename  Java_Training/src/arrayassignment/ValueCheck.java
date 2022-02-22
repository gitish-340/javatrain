package arrayassignment;

import java.util.*;

public class ValueCheck {
	public static void pos(int arr[],int value) {
		boolean pos1=false;
		int i=0;
		for( i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				pos1 = true;
				break;
			}
		}
		if(pos1==true) {
			System.out.println(value + " is present at "+i+"Index");
		}
		else {
			System.out.println(value + " is  not present at "+i+"Index");
		}
	}
	public static void main(String[] args) {
		System.out.println("how many number of elements you want to enter ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the elements");
		for(int j=0;j<size;j++) {
			arr[j] =sc.nextInt();
		}
		System.out.println("enter the value to search");
		int value = sc.nextInt();
		System.out.println("Array:"+Arrays.toString(arr));
		pos(arr,value);
		

	}

}
