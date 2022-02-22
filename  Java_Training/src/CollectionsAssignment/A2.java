package CollectionsAssignment;

/*Create an Employee class with the related attributes and 
 * behaviours. Create one more class EmployeeDB which has the 
following methods. a. boolean addEmployee(Employee e) b. 
boolean deleteEmployee(int eCode) c. String showPaySlip(int 
eCode) d. Employee[] listAll() Use an ArrayList which will be 
used to store the emplyees and use enumeration/iterator to 
process the employees. Write a Test Program to test that all 
functionalities are operational.
 * */
import java.util.*;

class Employee {
	public int Empid;
	public String name;
	public String email;
	public char gender;
	public float salary;

	public Employee(int Empid, String name, String email, char gender, float salary) {
		this.Empid = Empid;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}

	public String GetEmployeeDetails() {
		return "Employee [EmpId=" + Empid + ", EmpName=" + name + ", EmpEmail=" + email + ", EmpGender=" + gender
				+ ", EmpSalary=" + salary + "]";
	}

	public int id() {
		return Empid;
	}

	public void setEmpId(int Empid) {
		this.Empid = Empid;
	}

	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpemail() {
		return email;
	}

	public void setEmpId(String email) {
		this.email = email;
	}

	public Float getsalary() {
		return salary;
	}

	public void setEmpId(float salary) {
		this.salary = salary;
	}

}

class EmployeeDB {
	List<Employee> employee = new ArrayList<>();

	public boolean addEmployee(Employee e) {
		return employee.add(e);

	}

	public boolean deleteEmployee(int eCode) {
		boolean isRemoved = false;
		Iterator<Employee> it = employee.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.id() == eCode) {
				isRemoved = true;
				it.remove();
			}
		}
		return isRemoved;

	}

	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";

		for (Employee e : employee) {
			if (e.id() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " + e.getsalary();
			}
		}

		return paySlip;
	}

	public Employee[] listAll() {
		Employee[] empArray = new Employee[employee.size()];
		for (int i = 0; i < employee.size(); i++)
			empArray[i] = employee.get(i);
		return empArray;
	}

}

public class A2 {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();

		Employee emp1 = new Employee(101, "Bhawna", "Bhawna@gmail.com", 'F', 25000);
		Employee emp2 = new Employee(102, "Amit", "Amit@gmail.com", 'M', 30000);
		Employee emp3 = new Employee(103, "Gurman", "Gurman@gmail.com", 'M', 20000);
		Employee emp4 = new Employee(104, "Gurvir", "Gurvir@gmail.com", 'M', 50000);

		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();
		empDb.deleteEmployee(10);
		empDb.showPaySlip(101);
	}

}