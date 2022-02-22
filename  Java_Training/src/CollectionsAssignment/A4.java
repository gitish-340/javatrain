package CollectionsAssignment;

import java.util.*;

public class A4 {

	public static void main(String[] args) {
		A4 a = new A4();
		boolean result = a instanceof A4;
		System.out.println(result);
		List<Object> list = new ArrayList<>();
		try {
			list.add(3);
			list.add(34);
			list.add(56);
			list.add(45.6f);
			list.add(3.14D);
			list.add("gitish");
		}

		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(list);
	}
}
// rowset, collable interface