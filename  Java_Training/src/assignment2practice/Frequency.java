package assignment2practice;

import java.util.Scanner;
//Write a Java program to print the frequency of each character in a string
public class Frequency {
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		int[] freq = new int[str.length()];
		int i, j;

		// Converts given string into character array
		char string[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}
		System.out.println("Characters "
				+ "and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i]!= ' ' && string[i]!= '0')
				System.out.println(string[i] + "-" + freq[i]);
		}
	}
}