package Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {

	public static void main(String[] args) {
		// Map <String,String> m = new HashMap();
		HashMap<String,String> m = new HashMap<>();
		m.put("India", "Delhi");
		m.put("Usa", "Washington");
		m.put("Japan", "Tokiyo");
		m.put("China", "Beijing");
		m.put("China", "Delhi");
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey("Canada"));
		System.out.println(m.containsValue("Delhi"));
		System.out.println(m.get("India"));
		m.replace("India", "Mumbai");
		System.out.println(m.get("India"));
		System.out.println(m);
//		Set s = m.entrySet();
//		Iterator it = s.iterator();
//		while (it.hasNext()) {
//			Map.Entry me = (Map.Entry) it.next();
//			m.put("China1", "Delhi");
//			System.out.println(me.getKey() + "  " + me.getValue());
//		}
//
//	}
	}
}
