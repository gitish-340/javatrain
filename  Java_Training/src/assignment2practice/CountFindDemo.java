package assignment2practice;
import java.util.*;
//Write a Java program to count how many times the substring 'life' present at anywhere in a given string
public class CountFindDemo {

	public static void main(String[] args) {
		String str = "liveonwildlife";
		System.out.println("String :"  +str);
		int subStrCount =0;
		String substr="life";
		int index =0;
		while((index = str.indexOf(substr,index))>=0) {
			subStrCount++;
			index =  index + substr.length();
		}
		System.out.println("Substring  "  +substr+  "  found  " +subStrCount+  " times ");
	}

}
