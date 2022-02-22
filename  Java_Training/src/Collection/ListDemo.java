package Collection;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Gitish");
		list.add("Rohit");
		list.add("Mohit");
		list.add("Amit");
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		List <Integer>list1 = new LinkedList<>();
		list1.add(10);
		list1.add(26);
		list1.add(13);
		list1.add(40);
		Collections.sort(list1);
		for(Integer i :list1) {
			System.out.println(i);
		}
		
		List<Float> list2 = new Vector<>();
		list2.add( 43.4f);
		list2.add(23.3f);
		list2.add(24.4f);
		list2.add(45.6f);
		Collections.sort(list2);
		Iterator itr = list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
