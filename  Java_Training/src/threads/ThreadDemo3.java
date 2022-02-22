package threads;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i =0;i<=5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
					}
				catch(Exception e) {
					System.out.println("");
				
				}
	}

});
		Thread t2 = new Thread(()->{
			for(int i =0;i<=5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
					}
				catch(Exception e) {
					System.out.println("");
				
				}
	}

});
	}
}