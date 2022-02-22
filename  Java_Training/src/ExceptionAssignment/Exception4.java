
package ExceptionAssignment;
import java.util.*;
public class Exception4 {
	public static void main(String[] args) throws ArithmeticException,NumberFormatException{
		int[] array = new int[args.length];
			int sum = 0;
			for(int i=0; i<args.length; i++)
			{
				if(args[i].charAt(args[i].length() - 1) == ',')
					array[i] = Integer.parseInt(args[i].substring(0, args[i].length() - 1));
				else
					array[i] = Integer.parseInt(args[i]);
				sum += array[i];
			}
			int avg = sum / args.length;
			System.out.println("Sum of array is: " + sum + " and average is :" + avg);
	
	}

}
