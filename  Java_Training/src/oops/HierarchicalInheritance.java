package oops;

class A{
	int a =23,b =34;
}
class B extends A{
	void sum() {
		int add=a+b;
		System.out.println("addition:"+add);
	}
}
class C extends A{
	void product() {
		int prod=a*b;
		System.out.println(+prod);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B  b = new B();
		C c = new C();
		b.sum();
		c.product();
	}

}
