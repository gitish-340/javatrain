package Collection;

import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		 Set<Integer> l = new HashSet<>();
		l.add(8);
		l.add(4);
		l.add(10);
		l.add(1);
		l.stream().forEach(e->System.out.println(e));
		// in case of String  
		HashSet<String> h= new HashSet<String>();
		h.add("F");
		h.add("G");
		h.add("A");
		h.add("B");
		h.add("D");
		h.add("V");
		System.out.println(h);
		TreeSet<String> t = new TreeSet<>();
		t.add("F");
		t.add("G");
		t.add("A");
		t.add("B");
		for(String e:t) {
		System.out.println(e);
		}
		System.out.println("*********************");
		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		l1.add("F");
		l1.add("C");
		l1.add("S");
		l1.add("N");
		for(String j:l1) {
		System.out.println(j);
	}

}
}