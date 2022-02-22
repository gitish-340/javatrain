package jdbcpractice;

// TODO Auto-generated method stub
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
					Statement st= con.createStatement();
					String query ="create table student_list(id int ,name  varchar(30))";
					st.executeUpdate(query);
					
				}
				catch(Exception e) {
					System.out.println("Exception has occured"+e);
				}

			}

}
