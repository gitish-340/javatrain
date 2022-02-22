package CollectionsAssignment;
import java.util.*;
/*Create an ArrayList which will be able to store only Strings. 
Create a printAll method which will print all the elements 
using an Iterator.*/
public class A3 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("gitish");
		list.add("Gitika");
		list.add("Vikhiyat");
		list.add("Vansh");
		list.add("Harsahib");
		list.add("Bhawna");
		ListIterator itr= list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**************************");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
