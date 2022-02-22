package threads;
class Movie extends Thread{
	public void run() {
		System.out.println("this is user defined thread");
		
	}
}
public class SynchronizationDemo1  {
	public static void main(String[] args) throws InterruptedException{
		//SynchronizationDemo1 s = new SynchronizationDemo1(new Movie());
	//	s.start();
		System.out.println("Gitish");
		int x = 67+54;
		Thread t=Thread.currentThread();
		String tname= t.getName();
		System.out.println(tname);
		t.setName("Thread Gitish");
		String tname1 = t.getName();
		System.out.println(tname1);
		Thread.sleep(4000);
		System.out.println(t.getId());
		System.out.println("sum is :"+x);
		System.out.println("program ended");
		Movie m = new Movie();
	m.start();

	}
}
