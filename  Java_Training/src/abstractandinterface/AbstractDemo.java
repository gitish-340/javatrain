package abstractandinterface;
interface A11{
	int x=20;
    void show();
}
class B2{
	public void show() {
		System.out.println("show method of class B");
	}
}
interface i1{
public static void show() {
	System.out.println("i1 interface");
}
}
interface A2 extends A11,i1{
	int x=40;
	abstract void show();
}
class Show extends B2 implements A2,A11{
	@Override
	public void show() {
		super.show();
		// TODO Auto-generated method stub
		System.out.println("show");
		System.out.println(A11.x);
		System.out.println(A2.x);
	}
}
public class AbstractDemo {
	public static void main(String [] args) {
		A2 a = new Show();
		a.show();
	}
}
