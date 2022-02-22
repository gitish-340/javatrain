package threads;
class TotalEarning extends Thread{
	int total=0,i;
	
	public void run() {
		synchronized(this) {
		for(i=1;i<=10;i++) {
			total+=100;
		}
	
	this.notify();
	}
		
	}
}
public class ThreadDemo7 {

	public static void main(String[] args) throws InterruptedException {
		TotalEarning t = new TotalEarning();
		t.start();
		
		synchronized (t){
		t.wait();
			System.out.println(t.total);
		}
	}

}
