package CollectionFramework;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		/***************************************Queue*******************************************/
		Queue<Integer> q = new LinkedList<>();// because linkedlist implements the queue interface 	
		q.offer(3);// offer function will insert elements in queue
		q.offer(4);
		q.offer(6);
		q.offer(2);
		q.offer(9);
		System.out.println(q);
		System.out.println(q.poll()); /* it will perform the function like pop in stack 
		that is remove  element that is  first inserted  it will be at the top of the queue*/
		System.out.println(q.poll()); 
		q.peek();// it will give the number at top
		
		System.out.println(q.peek());
		
		
		
		
		
		
		/***************************************Deque*******************************************/
		
		LinkedList<Integer> d= new LinkedList<>();
		d.add(4);
		d.add(5);
		d.add(2);
		d.add(7);
		d.add(1);
		d.add(8);
		d.addFirst(3);
		System.out.println(d);
		d.addLast(10);
		Collections.sort(d); //for implementation we can have to change to LinkedList
		System.out.println(d);
		d.removeFirst();
		System.out.println(d);
		d.removeLast();
		System.out.println(d);
		d.element();  // if you prevent from crash then you can use element instead of peek method  it will throw an exception if queue is empty
		System.out.println(d);
		
	/**************************************PriorityQueue*****************************************/
		Queue p = new PriorityQueue(Comparator.reverseOrder());// in backend minheap is implemented
		p.offer(45);
		p.offer(34);
		p.offer(32);
		p.offer(23);
		System.out.println(p);
		p.poll();
		System.out.println(p);
		p.element();
		System.out.println(p);
		
		
		/*************************************************ArrayDeque*********************************************************/
//		ArrayDeque <Integer> a1= new ArrayDeque<>();
//		a1.offer(3);
//		a1.offerFirst(2);
//		a1.offerLast(4);
//		System.out.println(a1);
//		System.out.println(a1.peek());
//		System.out.println(a1.peekFirst());
//		System.out.println(a1.peekLast());
//		System.out.println(a1.poll());
//		System.out.println(a1);
//		System.out.println(a1.pollLast());
//		System.out.println(a1);
//		System.out.println(a1.pollFirst());
//		System.out.println(a1);
//		
	
	}

}
