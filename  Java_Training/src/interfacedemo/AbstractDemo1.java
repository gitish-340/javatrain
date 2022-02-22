package interfacedemo;
abstract class Person{
	Person(int a){
	System.out.println("hello");	
	}
	abstract void getName();
	abstract void setName();
}
class A extends Person{
A(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
@Override
public void getName() {
	System.out.println("get name/");
}
@Override
void setName() {
	// TODO Auto-generated method stub
	System.out.println("set name");
}
}
	public class AbstractDemo1 {

	public static void main(String[] args) {
		A a = new A(34);
		a.getName();
		a.setName();
	}

}