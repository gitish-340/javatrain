package CollectionFramework;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("Gitish",3));
		set.add(new Student("Manoj",4));
		set.add(new Student("Mohit",7));
		set.add(new Student("Rohit",3));
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		Set <Integer> set1= new HashSet<>();//o(1)
//		Set <Integer> set = new TreeSet<>();//log(n)
//		set.add(34);
//		set.add(34);
//		set.add(23);
//		set.add(24);
//		set.add(21);
//		set.add(54);
//		System.out.println(set.contains(100));
//		System.out.println(set);
//	set.remove(54);
//		System.out.println(set);
	}
	

}
