package methodrefrences;

/*Method Refrences*/
public class MethodRefrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		// provide the implementation pf workinter
		//static method ko refer kiya
		// ClassName::methodName  without parenthesis
		WorkInter workinter=Stuff::doStuff;
			System.out.println("this is to do task  new method");

		workinter.doTask();
		Runnable runnable = () -> {
			try {
				Stuff.ThreadTask();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread d = new Thread(runnable);
		d.start();
		Stuff ob = new Stuff();
		Runnable runnable1 = () -> {
			try {
				ob.printNumber();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Thread t= new Thread(runnable1);
		t.start();
	}

}
