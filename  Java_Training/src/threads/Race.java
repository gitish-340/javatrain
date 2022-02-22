package threads;
class Hare extends Thread{
	static int i;
	public void run() {
		for(  i=1;i<=100;i++) {
			if(i == 60) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Hare"+i);
		}
		if(i==100) {
			Thread.yield();
			System.out.println("Hare wins the race");
			System.exit(0);
			}
	}
}
class Tortoise extends Thread{
	static int j;
	public void run() {
	for( j =0;j<100;j++) {
		System.out.println("Tortoise "+j);
	}
	if(j==100) {
		
		System.out.println("Tortoise wins the race");
		System.exit(0);
		}
	}
}
public class Race  {
	public static void main(String[] args) throws InterruptedException {
	 Tortoise	tortoise = new Tortoise();
			//tortoise.setName("Tortoise");
			tortoise.setPriority(Thread.MIN_PRIORITY);
		Hare hare = new Hare();
			//hare.setName("Hare");
			hare.setPriority(Thread.MAX_PRIORITY);
		    tortoise.start();
		    hare.start();
	}

}
