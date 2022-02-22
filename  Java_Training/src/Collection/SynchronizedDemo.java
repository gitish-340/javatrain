package Collection;

import java.util.*;

import java.util.concurrent.*;

public class SynchronizedDemo<string> {

	public static void main(String[] args) {
//		List <String> l = new ArrayList<>();
		CopyOnWriteArraySet<String> l1 = new CopyOnWriteArraySet<String>();
//		CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<String>();
		l1.add("Gitish");
		l1.add("Gurvir");
		l1.add("Gurman");
		l1.add("Manjot");
		System.out.println(l1);
		Iterator i = l1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			l1.add("mansheetal");
		}
		System.out.println("************************");
		Iterator i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
			l1.add("Vikhiyat");
		}

	}
}
