package abstractandinterface;
interface Bicycle{
    int a=11;
	void Show();
	
}
class Bicycle1 implements Bicycle{
	public void Show() {
		System.out.println("show method");
	}
}
class InterfaceDemo1  {
	public static void main(String[] args) {
		Bicycle1 b = new Bicycle1();
		System.out.print(Bicycle.a);
	}

}

