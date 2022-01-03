
public class Student {

	int id;
	String name;
	Address address;
	static int count;
	
	public Student()
	{
		
	}
	public Student(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		count++;
	}
	
	public void display()
	{
		System.out.println("Name "+this.name);
		System.out.println("ID "+this.id);
		System.out.println("Address "+this.address.toString());
		
	}
	public static int total()
	{
		return count;
	}

	public static void main(String[] args) {
		
		Address a1=new Address(12, "Rajajinagar", "Banglore");
		Student s1=new Student(1234,"Nikhil",a1);
		s1.display();
		
		Address a2=new Address(13, "Yalahanka", "Banglore");
		Student s2=new Student(1235,"Nithin",a2);
		s2.display();
		
		Address a3=new Address(14, "Rajajinagar", "Banglore");
	    Student s3=new Student(1236,"Rakshith",a3);
		s3.display();
		
		System.out.println("count of object  "+total());
//		Student s=new Student();
		
		
}
}
