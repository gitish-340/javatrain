package threads;
class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread A");
		for(int i =0;i<=10;i++) {
			System.out.println("thread A" + " "+i);
		}
	}
	
}
class B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread B");
		for(int i=0;i<=10;i++) {
			Thread.yield();
			System.out.println("thread B"+ " " +i);
		}
	}
	
	
}
public class ThreadsDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new A());
	//	Thread t2 = new Thread(new B());
		
	    t1.start();
	   // t1.join();
	  //  t1.stop();
	    //t1.suspend();
		//t2.start();
		t1.setName("Thread 1");
		//String t= t1.getName();
		System.out.println(t1.currentThread());
		
		
	}

}
