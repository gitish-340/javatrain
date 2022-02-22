package ExceptionHandling;

import java.io.IOException;

//user defined  exception must extend Exception class
// the exception is thrown using throw keyword.


class Custom extends Exception{
	public Custom(String msg) {
			super(msg);
}
}
public class CustomException {
	static void Age(int age)throws Custom ,ArithmeticException ,IOException
	{
		if(age<18)
		{
			//Custom obj = new Custom("Age can't be less than zero");
			throw new Custom("Age can't be less than zero") ;
		}
		else {
			System.out.println("Input is valid");
		}
	}
	public static void main(String[] args) {
		try {
			Age(15);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
