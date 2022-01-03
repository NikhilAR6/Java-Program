
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee(101, "Nikhil", "Farmar");
		Employee e2=new Employee(102, "Raju", "Clerk");
//		Employee e3=new Employee(103, "Nithin", "software engineer");
		
		EmployeeContainer emp=new EmployeeContainer();
		emp.addEmployee(e);
		emp.addEmployee(e2);
//		emp.addEmployee(e3);
		
		emp.viewEmployees();
		emp.deleteEmployee(101);
		emp.viewEmployees();
		
		emp.viewEmployee(101);
		
	}

}
