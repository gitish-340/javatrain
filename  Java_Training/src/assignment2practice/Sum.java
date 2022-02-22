package assignment2practice;

import java.util.*;
//Write a Java program to calculate the sum of the numbers appear in a given string.
public class Sum {

	public static void main(String[] args) {
		String str ="15 is25 a 20string";
		String num = "";
		int sum =0,i;
		for(i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
				num+=str.charAt(i);
			}
			else {
				if(!num.equals("")) {
					sum+=Integer.parseInt(num);
					num ="";
				}
			}
		}
		System.out.println(sum);
	}

}