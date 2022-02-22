package threads;
class A3 extends Thread {
	public void run() {
		System.out.println("A method");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("show methodA"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
class B3 extends Thread {
	public void run() {
		System.out.println("B method");
		for(int i=0;i<10;i++) {
			
			try {
				Thread.sleep(1000);
				System.out.println("show method1"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class Z implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Z");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		A3 a = new A3();
		a.start();
		//a.interrupt();
		B3 b = new B3();
		b.interrupt();
		Z z = new Z();
		Thread t1 = new Thread(z);
		b.start();
	//	b.interrupt();
		t1.setName("Gitish");
System.out.println(b.getName());
	}

}
