package ExceptionAssignment;
import java.util.*;
class  User_register extends Exception{
	public User_register(String msg) {
		super(msg);
	}
}
public class Exception7 {
			static public void registeruser() throws User_register {
				String username;
				String countryname;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter your name and country name :");
				username = s.nextLine();
				countryname = s.nextLine();
				String o = "India";
				s.close();
				if (countryname.equalsIgnoreCase(o)) {
					System.out.println("Registeration done succesfully " + username);
				} else {
					throw new User_register("InvalidCountryException");
				}
			}

			public static void main(String args[]) {
				try {
					registeruser();
				} catch (Exception e) {
					System.out.println("Users outside India cannot register " + e);

				}
			
		


	}

}
