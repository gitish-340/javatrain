package day6work;

import java.util.*;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		 
		
		 System.out.println("Using Constructor 1 - ");
		 StringTokenizer st1 = new StringTokenizer("Hello Geeks How are you", " ");//by default false
		 while (st1.hasMoreTokens())
		 
		{
		 System.out.println(st1.nextToken());
		 
		}
		 System.out.println("Using Constructor 2 - ");
		 StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", ":");//by default false  
		 while (st2.hasMoreTokens())
		 
		{
		 System.out.println(st2.nextToken());
		 } System.out.println("Using Constructor 3 - ");
		 StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", ":", true);//by default  true means 
		 while (st3.hasMoreTokens())
		{
		 System.out.println(st3.nextToken());
		}
		 
		}
		
		
	}
