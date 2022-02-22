package week1assignment;

import java.util.*;

public class ReverseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0, t;
		while (n > 0) {
			t = n % 10;
			n = n / 10;
			r = (r * 10) + t;
		}
		System.out.println("" + r);
	}
}
// to check the frequency of the each character
// immutable string
//string buffer can be change its value
//===  checks the address