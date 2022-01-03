import java.util.HashSet;
import java.util.Set;

public class EmployeeContainer {

	Set<Employee> e=new HashSet<Employee>();
	
	
	public void addEmployee(Employee emp)
	{
		for(Employee no:e)
		if(emp.empno==no.empno)
		{
			System.out.println("employee already exists");
		}
		e.add(emp);
	}
	
	public void deleteEmployee(int empno)
	{
		boolean flag=false;
		for(Employee no:e)
		{
			if(empno==no.empno)
			{
				e.remove(no);
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Sorry! Employee is not found");
		}
		    
			
		
	}
	public void viewEmployee(int empno)
	{
		boolean flag=false;
		for(Employee no:e)
		{
			if(empno==no.empno)
			{
				System.out.println(no);
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Sorry! Employee is not found");
		}
		
	}
	public void viewEmployees()
	{
		System.out.println(e);
	}
}
