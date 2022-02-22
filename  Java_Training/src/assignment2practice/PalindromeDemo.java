package assignment2practice;

import java.util.*;
// Wap to check string is palindrome or not like “madam"
public class PalindromeDemo {

	public static void main(String[] args) {
		String rev ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		String inputstr=sc.nextLine();
		for(int i =inputstr.length()-1;i>=0;i--) {
			rev+=inputstr.charAt(i);
		}
		if(inputstr.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
