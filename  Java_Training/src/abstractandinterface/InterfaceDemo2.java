package abstractandinterface;

interface Exp
{
	void show();
	static void display()
	{
		System.out.println("display");
	}
	default void get()
	{
		System.out.println("get method of EXP");
	}
    void set();
}

interface Exp1 
{
	void show();
	static void display()
	{
		System.out.println("display methiod of exp1");
	}
	default void get()
	{
	System.out.println("get method of exp1");	
	}
	
}

interface Exp4  extends Exp,Exp1
{
	void show();

	@Override
	default void get() {
		// TODO Auto-generated method stub
		Exp.super.get();
	}
}
public class InterfaceDemo2 implements Exp4   {
	@Override
	public void show() {
		System.out.println("hi, this is how method");
		
	}

	@Override
	public void set() {
		System.out.println("set method");
	}

	@Override 
	public void get() {
	System.out.println("get method");
	}


	public static void main(String[] args) {

	 Exp4 obj =new InterfaceDemo2();
	obj.get();
	obj.show();
	obj.set();
	Exp.display();
	Exp1.display();
	}

}