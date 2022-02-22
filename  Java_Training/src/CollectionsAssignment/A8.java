package CollectionsAssignment;

import java.util.*;

class Employees {
	public int id;
	public String name;
	public String email;

	Employees(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

}

public class A8 {

	public static void main(String[] args) {
		Employees e = new Employees(101, "gitish", "gitish@gmail.com");
		Employees e1 = new Employees(102, "Bhavna", "bhavna@gmail.com");
		Employees e2 = new Employees(103, "Geetika", "Geetika@gmail.com");

		Vector<Employees> v = new Vector<Employees>();
		v.add(e);
		v.add(e1);
		v.add(e2);
		Enumeration en = v.elements();
		System.out.println("Vector elements  using enumeration");
		while (en.hasMoreElements()) {
			Employees emp = (Employees) en.nextElement();
			System.out.println(emp.email);
			System.out.println(emp.id);
			System.out.println(emp.name);
		}
		Iterator it = v.iterator();
		System.out.println(" elements using iterator");
		while (it.hasNext()) {
			Employees emp1 = (Employees) it.next();
			System.out.println(emp1.name);
			System.out.println(emp1.id);
			System.out.println(emp1.email);
		}

	}
}
