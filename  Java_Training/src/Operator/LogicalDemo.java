package Operator;

public class LogicalDemo {

	public static void main(String[] args) {
		
		 boolean a = true;
		 boolean b = false;
		 System.out.println("a && b = " + (a&&b)); // false
		 System.out.println("a || b = " + (a||b) ); // true
		 System.out.println("!(a && b) = " + !(a && b)); // true 
	}

}
