package Operator;

public class LogicalOp {

	public static void main(String[] args) {
		int a=10;
		int b=45;
		int c=34;
		int d=23;
		//boolean result = ((a>b)&&(c<d));  And
		//boolean result = ((a>b)||(c>d));  Or
		boolean result = (!(a>b)&&(c>d)); //Not
		System.out.println(result);

	}

}
