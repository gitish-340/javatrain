package threads;
class BookMyTicket {
	static int total_ticket = 10;

	public void bookTicket(int bookTicket) {

		if (total_ticket >= bookTicket) {
			total_ticket = total_ticket - bookTicket;
			System.out.println(bookTicket + " has been booked of ");
			System.out.println(total_ticket + " available ticket ");

		} else {
			System.out.println("sorry tickets cannot be booked ");

		}
	}
}


public class SynchronizationDemo extends Thread {
	static BookMyTicket book;
	int ticket = 0;

	public void run() {
		book.bookTicket(ticket);
	}

	public static void main(String[] args) {

		book = new BookMyTicket();
		SynchronizationDemo vk = new SynchronizationDemo();
		vk.ticket = 4;
		vk.start();

		SynchronizationDemo kk = new SynchronizationDemo();
		kk.ticket = 7;
		kk.start();

	}
}