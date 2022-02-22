package oops;

public class ConstructorDemo {
	int a ,b;// instance variable
	ConstructorDemo(){
		System.out.println("Default constructor");
	}
	ConstructorDemo( int a ,int b)// parameterised constructor
	{
		this.a=a;
		this.b=b;
		System.out.println("the area of the rectangle is "+a*b);
	}
	ConstructorDemo(double pi,double d )//constructor overloading
	{
		System.out.println("the area of circle is :"+pi*d*d);
	}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
		ConstructorDemo c1 = new ConstructorDemo(3,4);
		ConstructorDemo c2  = new ConstructorDemo(3.14,4.5);

	}

}
