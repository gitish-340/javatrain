package CollectionFramework;

import java.util.Objects;

public class Student {
	String name;
	int rollno;
	public Student(String name ,int rollno) {
		this.name =  name;
		this.rollno=rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && rollno == other.rollno;
		return rollno==other.rollno;
	}
	

}
