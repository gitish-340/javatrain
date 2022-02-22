package stringpractice;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "java";
		char c[] = { 's', 't', 'r', 'i', 'n', 'g' };
		String s2 = new String(c);//heap memory
		String s3 = new String("example");//constructor
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
//String is the sequence of characters but in java string is an object that represents a sequence of characters the java.lang.string class is used to create a string object