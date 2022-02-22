package Operator;

public class Increment {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		System.out.println("++a  "+(++a));//11
		System.out.println("b++"+(b++));//20
		
		
		int c=30;
		int d=40;
		System.out.println("--c "+(--c));//29
		System.out.println("d-- "+(d--));//40
		System.out.println("value of d"+d);//39

	}

}
