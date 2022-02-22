package abstractandinterface;
interface i2
{
	public static void show() 
	{
    	System.out.println("show method");
    }
    public default void show1()
    {
    	System.out.println("show method1");
    }
}
public class InterfaceDemo  implements i2{

	public static void main(String[] args) {
		i2.show();
		InterfaceDemo i = new InterfaceDemo();
		
		i.show1();
	}

}
// interface do not have constructors
// interface can't be instantiated