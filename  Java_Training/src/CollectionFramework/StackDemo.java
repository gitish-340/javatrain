package CollectionFramework;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack<String>  animals= new Stack<>();
		animals.push("Lion");
		animals.push("Dog");
		animals.push("cat");
		animals.push("monkey");
		System.out.println(animals);
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek());
	}

}
