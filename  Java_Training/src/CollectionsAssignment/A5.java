package CollectionsAssignment;

import java.util.*;
/*Create an ArrayList of Employee( id,name,address,sal) objects 
and search for particular Employee object based on id number*/

class Employee1 {
	public int id;
	public String name;
	public String address;
	public Float sal;
	public List<Employee1> list = new ArrayList<>();

	Employee1() {
	}

	Employee1(int id, String name, String address, float sal) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
	}
//
//	public int getid() {
//		return id;
//	}
}

public class A5 {
	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		Employee1 e = new Employee1(23, "gitish", "78 Model house", 49000);
		Employee1 e1 = new Employee1(27, "Geetika", "56 jyoti chowk", 48000);
		Employee1 e2 = new Employee1(25, "harleen", "45 milap chowk", 47000);
		Employee1 e3 = new Employee1(24, "ridhima", "43 Model town", 75000);
		Employee1 e4 = new Employee1(29, "gurman", "26 deol nagar", 65000);
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id to search");
		int searchid = sc.nextInt();
		boolean f = false;
		for (Employee1 e11 : list) {
			if (e11.id == searchid) {
//				System.out.println("found" + ":- " + searchid);
				f = true;

			}
			if (f) {
				break;
			}
		}
		if (f) {
			System.out.println("Found");
		} else {
			System.out.println("not found");
		}
	}
}
