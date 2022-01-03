import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student {

	Map<Integer,Student > map=new HashMap<Integer, Student>();
	
	public static int id=10001;
	private String name,email,cource;
	
	
	
	public Student(String name, String email, String cource) {
		super();
		this.name = name;
		this.email = email;
		this.cource = cource;

	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void addStudent(Student s)
	{
		id++;
		map.put(id,s);
//		for(int i=id;i<=3;i++)
//		{
//			map.put(id,s);
//		}
//		System.out.println(map);
		
	}
	
	public static int getId() {
		return id;
	}
	
	public void viewStudents()
	{
		Set<Integer> key = map.keySet();
		for(Integer i : key){
			System.out.println(map.get(i));
		}

	}
	
	@Override
	public String toString() {
		return "Student [ name=" + name + ", email=" + email + ", cource=" + cource + "]";
	}

	public void viewStudent(Integer id)
	{
		System.out.println(map.get(id));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		Student s1=new Student("nithin", "nithi@gmail.com", "MCA");
		Student s2=new Student("rakshith", "rakshi@gmail.com", "MCA");
		Student s3=new Student("nikhil", "n@gmail.com", "MCA");
		
		s.addStudent(s1);
		s.addStudent(s2);
		s.addStudent(s3);
		
		s.viewStudents();
		s.viewStudent(10002);
	}

}
