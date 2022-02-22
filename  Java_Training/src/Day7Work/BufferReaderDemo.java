package Day7Work;

import java.io.*;

public class BufferReaderDemo {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		System.out.println("enter name");
		try {
			String name = b.readLine();
			System.out.println("Name is:"+name);
		}
		catch(IOException e) {
			System.out.println("Exception is occurred");
		}

	}

}
