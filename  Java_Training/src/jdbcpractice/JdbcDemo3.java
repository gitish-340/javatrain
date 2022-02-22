package jdbcpractice;
import java.sql.*;
public class JdbcDemo3 {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc: mysql://localhost:3306/student","root","1234");
		Statement s = con.createStatement();
		
		}
		
		catch(Exception e) {
			
		}
	}

}
