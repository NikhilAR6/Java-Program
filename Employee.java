
public class Employee {

	int empno;
	String empname,job;
	public Employee(int empno, String empname, String job) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.job = job;
	}
	
	public String showInfo() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", job=" + job + "]";
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", job=" + job + "]";
	}
	
	
}
