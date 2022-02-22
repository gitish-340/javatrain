package assignment2practice;

import java.util.Scanner;
//Write a Java program to find the maximum occurring character in a string.
public class MaxCharacter {

	public static void main(String[] args) {
		String str;
		int  max;       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		char maxChar = str.charAt(0);  
		int[] freq = new int[str.length()];
		int i, j;

		// Converts given string into character array
		char string[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]&& string[i]!=' ' &&string [i]!='0') {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}
		max=freq[0];
		for(i=0;i<freq.length;i++) {
		
		
		if(max < freq[i]) {  
			max = freq[i];  
			maxChar = string[i];  
}    
		} 
System.out.println("Maximum occurring character: " + maxChar);  
}
}