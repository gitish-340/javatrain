package CollectionsAssignment;

import java.util.*;
import java.util.Map.Entry;

public class A9 {
	static Map<String, String> m1 = new HashMap<>();

	public static void saveCountryCapital(String CountryName, String capital) {
		m1.put(CountryName, capital);
	}

	public static void getCapital(String CountryName) {
		System.out.println(m1.get(CountryName));
	}

	public static void getCountry(String capitalName) {
		Set set = m1.entrySet();
		Iterator it1 = set.iterator() ;
		while(it1.hasNext()){
			Map.Entry me = (Entry)it1.next();
			if(capitalName.equals(me.getValue())) {
				System.out.println(me.getKey());
			}
		}
	}

	public static void printarraylist() {
		List<String> list= new ArrayList<>();
		Set set = m1.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Entry) it.next();
			String key = (String) me.getKey();
			list.add(key);
		}
		System.out.println(list);
	}

	public static void reverse() {
		Map<String, String> m2 = new HashMap<>();
		Set set = m1.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry me =  (Entry) it.next();
			String key = (String) me.getValue();
			String value = (String) me.getKey();
			m2.put(key, value);
		}
//		System.out.println(m2);
		Set set1 = m2.entrySet();
		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("1->");
		saveCountryCapital("India", "Delhi");
		saveCountryCapital("Japan", "tokyo");
		saveCountryCapital("USA", "Washington");
		saveCountryCapital("China", "Beijing");
		Set set = m1.entrySet();

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*********************************");
		System.out.println("2->");
		System.out.println();
		getCapital("India");
		System.out.println("***********************************");
		System.out.println("3->");
		getCountry("Delhi");
		System.out.println("************************************");
		System.out.println("4->");
		reverse();
		System.out.println("************************************");
		System.out.println("5->");
		printarraylist();
	}

}