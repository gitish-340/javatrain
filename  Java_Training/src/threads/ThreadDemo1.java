package threads;
//runnable interface and thread class comes in  java.lang package

class A1 extends Thread {
	@Override
	public void run() {
		System.out.println("thread A started");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread A"+ ""+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
}
class B1 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				System.out.println("Thread B "+" "+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class C1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread C started");
		for(int i=0;i<=10;i++) {
			Thread.yield();
			try {
				Thread.sleep(1000);
				System.out.println("Thread C "+" "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
	A1 a = new A1();
	B1  b = new B1();
	C1 c = new C1();
	a.start();
	a.interrupt();
	b.start();
	b.interrupt();
	c.start();
	//c.interrupt();
	c.isInterrupted();
//	c.join();
	
			
	}

}
/*
1.)new state :- create the thread 
2.)runnable state :- threads are ready to execution
3.)running state:- thread is  in running when the thread scheduler has selected it . 
4.)non runnable state :- 
  four reason of not runnable state :-

-> when sleep() method is invoked and it sleeps for a specified amount of time.
-> when suspend() method is invoked . it is now depreciated(now its not used)
-> when the wait() method is invoked and threads waits
   for notification of a free resource or wait for the  
   completion of another thread or waits for the completion
   of another  thread or waits  to acquire a lock of an object
-> the thread is blocking on I/O and waits for its completion
-> if the thread has been put to sleep,then the specified number of milliseconds must elapse(or it must be interrupted).
->if the thread has been suspended then its resume method must be invoked.
-> if the thread is waiting on a condition variable , whatever object owns the variable must relinguish it by calling either notify or notifyAll()
->if the thread is blocked on I/O ,then the I/O must complete.

5.) dead state:- a thread enters this state when the run() 
    method has finished executing or when the stop() 
    method is invoked once in this state ,the thread cannot ever run again. 




*/