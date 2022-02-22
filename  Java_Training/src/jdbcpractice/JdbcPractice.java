package jdbcpractice;

import java.io.*;

public class JdbcPractice {
	private static String name1;
	private static String city1;
	private static String phone1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to Student Management");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		System.out.println("PRESS 1 to ADD Student");
		System.out.println("PRESS 2 to DELETE Student");
		System.out.println("PRESS 3 to Display Student");
		System.out.println("PRESS 4 to update student");
		System.out.println("PRESS 5 to exit");
		int c = Integer.parseInt(br.readLine());
		if (c==1) {
			System.out.println("Enter user Name:");
			String name = br.readLine();
			System.out.println("Enter user phone");
			String phone = br.readLine();
			System.out.println("Enter user city");
			String city =  br.readLine();
			// create student object
			Student st = new Student(name,phone,city);
			boolean ans= StudentDao.insertStudentToDb(st);
			if(ans) {
				System.out.println("added successfully");
			}
			else {
				System.out.println("Something went wrong ");
			}
			System.out.println(st);
		}
		else if(c==2) {
			System.out.println("Enter Student id to delete");
			int userid = Integer.parseInt(br.readLine());
			boolean f = StudentDao.deleteStudent(userid);
			if(f) {
				System.out.println("deleted");
			}
			else {
				System.out.println("Something went wrong");
			}
			
		}
		else if(c==3) {
			StudentDao.showAllStudent();
		}
		
		else if(c==4) {
			System.out.println("enter which data you are update");
			int c1 = Integer.parseInt(br.readLine());
			if(c1==1) {
			System.out.println("Enter user Name:");
			String name1 = br.readLine();
			}
			else if(c1==2) {
			System.out.println("Enter user phone");
			String phone1 = br.readLine();
			}
			else if (c1==3) {
			System.out.println("Enter user city");
			String city1 =  br.readLine();
			}
			else if (c1 == 4) {
				System.out.println("Enter user Name:");
				String name1 = br.readLine();
				System.out.println("Enter user phone");
				String phone1 = br.readLine();
				System.out.println("Enter user city");
				String city1 =  br.readLine();
			}
			else {
				System.out.println("wrong input");
			}
			Student st = new Student(name1,phone1,city1);
			StudentDao.updateStudent(st);
		}
		else if(c==5) {
			break;
		}
		else {
			System.out.println("Wrong input");
		}
	}
		System.out.println("Thank you for using my application....");
		System.out.println("See you soon");

}
}

/*
 * load the driver class
 * create connection using driver manager.  
 * use connection  to fire queries { statement for static queries and prepared statement for dynamic queries}
 *  select * from table  is static query       select * from table where column =? is  dynamic query because it has parameter
 *  execute query and execute update method is used to fire static and dynamic query
 *  process the result  ResultSet is the interface which is used to fetch the result 
 *  last step is connection close
 */