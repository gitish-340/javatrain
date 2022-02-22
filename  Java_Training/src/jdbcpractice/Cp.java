package jdbcpractice;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
public class Cp {
	static Connection con;
	public static Connection createC(){
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		//create the connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","");
				
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	}
	
}
