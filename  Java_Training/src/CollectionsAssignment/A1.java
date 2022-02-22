package CollectionsAssignment;
/*Develop a java class with a method saveEvenNumbers(int N) 
using ArrayList to store even numbers from 2 to N, where N is a 
integer which is passed as a parameter to the method 
saveEvenNumbers(). 
The method should return the ArrayList (A1) created. In the 
same class create a method printEvenNumbers()which iterates 
through the arrayList A1 in step 1, and It should multiply 
each number with 2 and display it in format 4,8,12….2*N. and 
add these numbers in a new ArrayList (A2). 
The new ArrayList (A2) created needs to be returned. Create a 
method printEvenNumber(int N) parameter is a number N. This 
method should search the arrayList (A1) for the existence of 
the number ‘N’ passed. If exists it should return the Number 
else return zero.Hint: Use instance variable for storing the 
ArrayList A1 and A2.
NOTE: You can test the methods using a main method*/
import java.util.*;
public class A1 {
	private ArrayList<Integer> list;
	public ArrayList<Integer> saveEvenNumbers(int N){
	 list= new ArrayList<>();
		for(int i=2;i<=N;i++) {
			if(i%2==0)
				list.add(i);
		}
			return list;
		}
	public ArrayList<Integer> printEvenNumbers(){
		ArrayList<Integer> newList = new ArrayList<>();
		for(int item:list) {
			newList.add(item*2);
		}
		System.out.println(newList);
		return newList;
	}
	public ArrayList<Integer> printEvenNumbers(int N) {
		if(list.contains(N))
		{
			System.out.println("Found:-" +" "+N);
		}
		else {
			System.out.println("Zero");
		}
		return list;
	}
	public static void main(String[] args) {
	A1 a = new A1();
	Scanner sc = new Scanner(System.in);
	System.out.println("How many elements you want to enter");
	int n= sc.nextInt();
	a.saveEvenNumbers(n);
	a.printEvenNumbers();
	a.printEvenNumbers(20);
	}

}
