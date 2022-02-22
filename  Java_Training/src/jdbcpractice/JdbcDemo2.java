package jdbcpractice;

import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
			Statement st = con.createStatement();
//			String query = "insert into student_list(id,name,age) values(?,?,?)";
			String query = "update student_list set age = ? where id = 102";
			PreparedStatement ps= con.prepareStatement(query);
//			ps.setInt(1,100);
//			ps.setString(2,"Arora");
//			ps.setInt(3, 21);
			ps.setInt(1, 24);
			int i= ps.executeUpdate();
			if(i>0) {
				System.out.println("inserted");
			}
			else {
				System.out.println("not  inserted");
			}
		}
		catch(Exception e) {
			System.out.println("Exception has occured"+e);
		}

	}

}
