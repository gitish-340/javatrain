package Operator;

public class AssignmentOperator {

	public static void main(String[] args) {
		{
			int x=12,y=6,z=3,t=5,r=6,u=6,i=7,k=8;
			System.out.println("The Assignment Value is : ");
			System.out.println("The Value of x is : " +(x+=2)); 
			System.out.println("The Value of y is : " +(y-=1)); 
			System.out.println("The Value of z is : " +(z*=4));
			System.out.println("The Value of t is : " +(t/=5)); 
			System.out.println("The Value of r is : " +(r%=3)); 
			System.out.println("The Value of u is : " +(u&=z));
			System.out.println("The Value of i is : " +(i|=x)); 
			System.out.println("The Value of k is : " +(k^=2)); 
		
			 }
		
			}
}
