package oops;
class StaticDemo1{
	static int a;
	static int b;
	static String msg = " hello world";
	
	public static class InnerClass{
		public void show() {
			System.out.println("the value of a :"+msg);
		}
	}
	public static void get() {
		a=45;
		b=56;

	}
	static {
		System.out.println("hello i am using static block");
	}
	
}
public class StaticDemo {
    
	public static void main(String[] args) {
		StaticDemo1 s = new StaticDemo1 ();
		StaticDemo1.InnerClass i = new StaticDemo1.InnerClass();
		i.show();
		StaticDemo1.get();
		System.out.println(StaticDemo1.a++);
		System.out.println(StaticDemo1.a++);
		System.out.println(StaticDemo1.a);
		
	}

}
