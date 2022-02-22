package stringpractice;

public class StringMethodsDemo {

	public static void main(String[] args) {
// public char charAt(int index)
		String x = "Hello";
		System.out.println(x.charAt(2)); 
		
		
// public String concat(String s)		
		System.out.println(x.concat("Java!")); 


		
// public boolean equalsIgnoreCase(String s)
		String y ="Exit";
		System.out.println(y.equalsIgnoreCase("EXIT"));
		System.out.println(y.equalsIgnoreCase("tixe"));

// public String replace(char old,char new)
		System.out.println(x.replace('e', 'E'));

// public int length()
		System.out.println(x.length());

// public String toLowerCase()
		System.out.println(y.toLowerCase());

		
// public String toUpperCase()
		System.out.println(y.toUpperCase());

		
// public String trim() removing trailing blank spaces

		System.out.println(x.trim() + "x");

		System.out.println(x.startsWith("He")); // boolean startsWith(String prefix)

		System.out.println(x.endsWith("lo")); // boolean endsWith(String suffix)

// Public boolean equals(String s)
		String str1 = "Hello Dear!"; // String constant pool
		String str2 = "Hello Dear!"; // String constant pool
		String str3 = new String("Hello Dear!");  // heap memory location
		if (str1.equals(str2)) // it checks the value 
		{
			System.out.println("str1 and str2 refer to identical strings");
		} else {
			System.out.println("str1 and str2 refer to the non identical strings");
		}
		if (str1 == str2) // it checks the address 
		{
			System.out.println("str1 and str2 refer to the same string ");
		} else {
			System.out.println("str1 and str2 refer to the different string");

		}
		if (str1.equals(str3)) {
			System.out.println("str1 and str3 refer to the identical string");
		} else {
			System.out.println("str1 and str3 refer to the non identical string");
		}
		if (str1 == str3) {
			System.out.println("str1 and str3 refer to the same string");
		} else {
			System.out.println("str1 and str3 refer to the different string");
		}
// indexof()

		String s = "Sun is Shinning Brightly";
		System.out.println("IndexOf :  " + s.indexOf('s'));

		
//lastindexof()
		
		System.out.println("LastIndexOf: " + s.lastIndexOf('t'));
	}
}
