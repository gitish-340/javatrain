package assignment;
import java.util.*;
public class ArmstrongNum {

	public static void main(String[] args) {
	     int r;
	     double sum =0;
	     int count=0;
	     System.out.print("Enter the number");
	     Scanner sc =new Scanner(System.in);
	     int n=sc.nextInt();
	    int temp = n;
	    int original_num=n;
	    while(temp>0) {
	    	count++;
	    	temp=temp/10;
	    }
	    while(n>0) {
	    	r=n%10;
	    	sum=sum+(Math.pow(r,count));
	    	n=n/10;
	    }
	    if(original_num == sum) {
	    	System.out.println("Its an armstrong number");
	    }
	    else {
	    	System.out.println("Its not an armstrong number");
	    }
	}

}
