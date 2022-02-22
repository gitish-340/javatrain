package stringpractice;

public class StringDemo3 {

	public static void main(String[] args) {
		char chars[] = { 'H', 'E', 'L', 'L', 'O' };
		String s = new String(chars);
		System.out.println("String is :" + s);
		String s1 = new String(s);
		System.out.println("String is :" + s1);

		// String Constructor
		char chars1[] = { 'H', 'E', 'L', 'L', 'O', ' ', 'J', 'A', 'V', 'A' };
		String s2 = new String(chars1, 4, 4);
		System.out.println("String is: " + s2);

		byte ascChars[] = { 65, 66, 67, 68, 69, 70 };
		String b1 = new String(ascChars);
		System.out.println("String is : " + b1);
		String b2 = new String(ascChars, 2, 3);
		System.out.println("String is : " + b2);
	}

}
