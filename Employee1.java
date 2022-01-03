
public class Employee1 {

		String id,name;
		double salary;
		
	public Employee1(String id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}


	public Employee1(String id, String name) {
			super();
			this.id = id;
			this.name = name;
			this.salary = 20000;
		}

	public void display() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
	}
	
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("101", "Nikhil");
		e1.display();
		
		Employee1 e2 = new Employee1("102", "Ram", 100000);
		e2.display();
		}

}

