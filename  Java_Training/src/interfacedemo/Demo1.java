package interfacedemo;

interface I1 {
	void f1();
}

interface I2 {
	void f2();
}

interface I3 extends I1, I2 {
	void f3();
}

public class Demo1 implements I3 {
	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("f1");
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		System.out.println("f2");
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		System.out.println("f3");
	}

	public static void main(String[] args) {
		Demo1 a = new Demo1();
		a.f1();
	}
}