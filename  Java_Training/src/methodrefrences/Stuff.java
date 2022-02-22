package methodrefrences;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class Stuff {
	public static void doStuff(){
		System.out.println("I am doing task");
		System.out.println("I am second line");
		LocalDate d =  LocalDate.now();
		LocalTime t = LocalTime.now();
		System.out.println(d.toString());
		System.out.println(t.toString());
	}
	public static void ThreadTask() throws InterruptedException {
		for(int i =1;i<=10;i++) {
			System.out.println(i*2);
			Thread.sleep(1000);
		}
	}
	public void printNumber() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
				
			}
		}

}
