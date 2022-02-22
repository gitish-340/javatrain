package assignment2practice;
import java.util.*;
//Write a Java program to check whether the character immediately before and after a specified character is same in a given string.
public class SpecialCharacter {
		public boolean leftAndRightSame(String stng) 
		{
		  int l = stng.length();
		  boolean found = true;
		  for (int i = 0; i < l-1; i++) 
		  {
		    String tmpString = stng.substring(i,i+1);
		    if (tmpString.equals("#") && i > 0 && i < l) 
			{
		      if (stng.charAt(i-1) == stng.charAt(i+1))
		        found = true;
		      else
		        found = false;
		    }
		  }
		  return found;
		}
		public static void main (String[] args)
		    {
		      SpecialCharacter m= new SpecialCharacter();
		      String str1 =  "bat#night";
		      String str2 = "moon#night";
		      String str3 = "#moon#night";
		      System.out.println("The given string is: "+str1);
		      System.out.println("The before and after character are same: "+m.leftAndRightSame(str1));
		      System.out.println("the given string is :"+str2);
		      System.out.println("the before and after character are same: "+m.leftAndRightSame(str2));
		      System.out.println("the given string is :"+str3);
		      System.out.println("the before and after character are same: "+m.leftAndRightSame(str3));
			  }
		


	}

