package revision;
class Demo
{
 public void show(byte a) {
	 System.out.println("the value of byte is :"+a);
 }
 public void show(short a) {
	 System.out.println("the value of short is :"+a);
 }
 public void show(int a) {
	 System.out.println("the value of int is :"+a);
 }
 public void show(long a) {
	 System.out.println("the value of long is :"+a);
 }
}
public class ClassDemo {
	
	public static void main(String[] args) {
		//local variable,instance variable 
		// type promotion 
		//platform independent 
		// data types hierarchy
		Demo d = new Demo();
		d.show(10);
		}

}

