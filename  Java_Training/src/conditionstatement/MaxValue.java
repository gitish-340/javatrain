package conditionstatement;
import java.util.*;
public class MaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a,b,c;
		int max =0;
		a=sc.nextInt();
		System.out.println("Enter the value of b ");
		b=sc.nextInt();
		System.out.println("Enter the value of c");
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				max=a;
			}
			else {
				max=c;
				}
		}
		else {
			if(b>c){
				max=b;
				
			}
			else {
				max=c;
			}
		
		}
		System.out.println("\nthe max value"+max);
		
	}

}
