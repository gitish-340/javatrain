package threads;
//Java program to illustrate the

//behavior of notifyAll() method

class D1 extends Thread {
	public void run() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + "...starts");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...notified");
		}
	}
}

class D2 extends Thread {
	D1 d;

	D2(D1 d) {
		this.d = d;
	}

	public void run() {
		synchronized (this.d) {
			System.out.println(Thread.currentThread().getName() + "...starts");

			try {
				this.d.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...notified2");
		}
	}
}

class D3 extends Thread {
	D1 d;

	D3(D1 d) {
		this.d = d;
	}

	public void run() {
		synchronized (this.d) {
			System.out.println(Thread.currentThread().getName() + "...starts");

			this.d.notifyAll();
			System.out.println(Thread.currentThread().getName() + "...notified3");
		}
	}
}

class ThreadDemo9 {
	public static void main(String[] args) throws InterruptedException {
		D1 d1 = new D1();
		D2 d2 = new D2(d1);
		D3 d3 = new D3(d1);
		Thread t1 = new Thread(d1, "Thread-1");
		Thread t2 = new Thread(d2, "Thread-2");
		Thread t3 = new Thread(d3, "Thread-3");
		t1.start();
		t2.start();
		t3.start();
	}
}
