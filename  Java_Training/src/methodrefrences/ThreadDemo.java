package methodrefrences;
class A extends Thread{
	public void run() {
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("thread 1");
		Thread t1 = Thread.currentThread();
		System.out.println(t1);

	}

}
