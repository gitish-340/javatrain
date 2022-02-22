package threads;

import java.io.*;
class B6 extends Thread {
	int i;

	public void run() {
		for (i = 0; i < 10; i++) {
			System.out.println("thread B" + i);
//			try {
//				Thread.sleep(1000);
//				System.out.println("thread B" + i);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

class C extends Thread {
	int j;

	public void run() {
		for (j = 0; j < 10; j++) {
			System.out.println("thread C" + j);
//			try {
//				Thread.sleep(1000);
//				System.out.println("thread C" + j);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

class D extends Thread {
	int k;

	public void run() {
		for (k = 0; k < 10; k++) {
			System.out.println("thread D" + k);
//			try {
//				Thread.sleep(1000);
//				System.out.println("thread D" + k);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

public class ThreadDemo6 {

	public static void main(String[] args)throws IOException{
		B6 b = new B6();
		C c = new C();
		D d = new D();
		try {
		d.start();	
		d.join();
		}
		catch(Exception e) {
			System.out.println("exception occur"+e);
		}
		b.setPriority(Thread.MAX_PRIORITY);
		b.start();
		c.start();
		//c.setPriority(Thread.MIN_PRIORITY);
		//c.setPriority(Thread.MIN_PRIORITY);
		
		
	}

}
