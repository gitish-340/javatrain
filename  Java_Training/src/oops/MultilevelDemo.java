package oops;
class A1{
	public void  show() {
		System.out.println("Show A");
	}
}
class B1 extends A1{
	void show1() {
		System.out.println("show B");
		
	}
}
class C1 extends  B1{
	void show2() {
		System.out.println("show C");
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.show();
		c.show1();
		c.show2();

	}

}
