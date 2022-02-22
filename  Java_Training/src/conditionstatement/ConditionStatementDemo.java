package conditionstatement;
import java.util.*;
public class ConditionStatementDemo {

	public static void main(String[] args) {
	int marks;
	Scanner sc =new Scanner(System.in);
	marks=sc.nextInt();
	if(marks>33) {
		System.out.println("Student is pass");
	}
	else {
		System.out.println("Student is fail");
	}
	}

}
