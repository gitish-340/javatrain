package CollectionFramework;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		List<String> student= new ArrayList<>();
	/*if size = n and you need to increase the size then you would be use n+n/2 +1; like  n= 10 then 10+5+1=16 	 * */
		student.add("Gitish");
		student.add("Mohit");
		student.add("Harsh");
		student.add(2,"rohit");
		student.remove("Mohit");
		System.out.println(student);
		List<Integer> list = new ArrayList<>();
		// big(n) complexity for remove element
		// if you remove element then elements  in the middle are shift to left side and in case of insertion of  the elements in the middle  are shift to right
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(6);
		System.out.println(list);
		list.set(2, 1000);  // big(1) complexity
		System.out.println(list);
		System.out.println(list.contains(500));// big(n) complexity
	//sort method
		Collections.sort(list);
		System.out.println(list);
		// remove method 
//		list.remove(Integer.valueOf(2));
//		System.out.println(list);
//		list.clear();
//		System.out.println(list);
//		
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println("the elements are "+list.get(i));
//		}
		
//		for(Integer e:list) {
//			System.out.println(e);
//		}
		
	     Iterator<Integer> it =  list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator<Integer> listIterator = list.listIterator();  
		  System.out.println("The list of alphabets is given as : "+list);  
		        System.out.println("In the forward direction : ");  
		        while (listIterator.hasNext()) {  
		            System.out.println(listIterator.next());  
		        }  
		        System.out.println("In the backward direction:- ");  
		        while (listIterator.hasPrevious()) {  
		            System.out.println(listIterator.previous());  
		        }  
		    }  
		
//		student.add(String.valueOf(5));
//		System.out.println(student.isEmpty());
//		System.out.println(student.toString());
//		System.out.println(student.size());
		
	}
