package Day7Work;

import java.util.StringJoiner; 
public class StringJoinerExample
{ 
 public static void main(String[] args)
 { 
 // List<Integer> list = new ArrayList<Integer>();
 StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter 
 
 // Adding values to StringJoiner 
 joinNames.add("Rahul"); 
 joinNames.add("Raju"); 
 joinNames.add("Peter"); 
 joinNames.add("Raheem"); 
 
 System.out.println(joinNames); 
 } 
}