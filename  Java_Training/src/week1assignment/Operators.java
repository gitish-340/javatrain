package week1assignment;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int sum= a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem= 10%20;
		System.out.println("Sum of a and b "+sum);
		System.out.println("Subtraction of a and b "+sub);
		System.out.println("Multiplication of a and b "+mul);
		System.out.println("Division of a and b "+div);
		System.out.println("Modulus of a and b "+rem);
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		System.out.println("value of --a " +(--a));//decrement
		System.out.println("value of a  "+a);//increment
		System.out.println("value of b-- "+(b--));//decrement
		System.out.println("value of b"+b);
		System.out.println("10%13  " +(10%13));
		System.out.println("4%3   "  +(4%3));
		System.out.println("7%5  " +(7%5));
		


	    int c = (a>b)?a:b;// ternary operator
	    System.out.println(+c);

	    int x=12,y=6,z=3,t=5,r=6,u=6,i=7,k=8; //assignment operator
				System.out.println("The Assignment Value is : ");
				System.out.println("The Value of x is : " +(x+=2)); 
				System.out.println("The Value of y is : " +(y-=1)); 
				System.out.println("The Value of z is : " +(z*=4));
				System.out.println("The Value of t is : " +(t/=5)); 
				System.out.println("The Value of r is : " +(r%=3)); 
				System.out.println("The Value of u is : " +(u&=z));
				System.out.println("The Value of i is : " +(i|=x)); 
				System.out.println("The Value of k is : " +(k^=2)); 
				//Bitwise operator
				System.out.println("a|b : "+(a|b));
				System.out.println("a&b : "+(a&b));
				System.out.println("a^b : "+(a^b));
				System.out.println("~a  : "+(~a));
				
			
         // logical operator
 	     boolean m = true;
		 boolean n = false;
			 System.out.println("a && b =  " + (m&&n)); 
			 System.out.println("a || b =  " + (m||n) ); 
			 System.out.println("!(a && b) =  " + !(m && n));
	     //relational operator
			 System.out.println("a==b  " +(a==b));//false
			 System.out.println("a!=b " +(a!=b));//true
			 System.out.println("a>b "  +(a>b));//false
			 System.out.println("a<b= "+(a<b));//true
			 System.out.println("b>=a "+(b>=a));//true
			 System.out.println("b<=a "+(b<=a));//false
			 
}
}