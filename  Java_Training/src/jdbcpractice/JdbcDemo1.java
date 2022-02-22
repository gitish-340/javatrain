package jdbcpractice;

//TODO Auto-generated method stub
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
					Statement st= con.createStatement();
				String query ="Select * from student_list";
//				String query ="insert into student_list Values(105,'Ridhima',25),(106,'Vikhiyat',23);";
///					String query ="UPDATE student_list "  +
//				            "SET age =23 WHERE id in (101, 102)";
//					String query = "Alter table student_list drop column  email";
//					String query ="Delete from student_list where id=103";
//				int i = st.executeUpdate(query);
//				if(i>0)
//				{
//				System.out.println("Record inserted");
//				}
//				else{
//				System.out.println("Error");
//				}

					ResultSet  s=st.executeQuery(query);
					while(s.next()) {
						System.out.println("Id="+s.getInt("id")+",Name="+s.getString("name"));
					}
					
				}
				catch(Exception e) {
					System.out.println("Exception has occured"+e);
				}

			}

}

