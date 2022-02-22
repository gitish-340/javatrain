package jdbcpractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static  boolean insertStudentToDb(Student st) {
		boolean f = false;
		try{
			Connection con = Cp.createC();
			String q= "insert into student(sname,sphone,scity) values(?,?,?)";
			PreparedStatement pst= con.prepareStatement(q);
			//set the values
			pst.setString(1, st.getStudentName());
			pst.setString(2, st.getStudentPhone());
			pst.setString(3, st.getStudentCity());
		// execute
			pst.executeUpdate();
			f= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudent(int userid) {
		boolean f = false;
		try{
			Connection con = Cp.createC();
			String q= "delete from student where sid=?";
			PreparedStatement pst= con.prepareStatement(q);
			//set the values
			pst.setInt(1, userid);
		// execute
			pst.executeUpdate();
			f= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean showAllStudent() {
		// TODO Auto-generated method stub
		boolean f = false;
		try{
			Connection con = Cp.createC();
			String q= "select * from student;"; 
			Statement st =  con.createStatement();
			ResultSet set = st.executeQuery(q);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				System.out.println("ID:"+id);
				//System.out.println("Name:"+name);
				//System.out.println("Phone:"+phone);
				System.out.println("city:"+city);
				f=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean updateStudent(Student st) {
		// TODO Auto-generated method stub
		boolean f = false;
		try{
			Connection con = Cp.createC();
			String q= "update student set sname =?,sphone=?,scity=?";
			PreparedStatement pst= con.prepareStatement(q);
			//set the values
			pst.setString(1, st.getStudentName());
			pst.setString(2, st.getStudentPhone());
			pst.setString(3, st.getStudentCity());
		// execute
			pst.executeUpdate();
			f= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
}
