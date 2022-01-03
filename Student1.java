import java.util.Arrays;

public class Student1 {

	int id;
	String name;
	String[] subj;
	
	
	public Student1(int id, String name, String[] subj) {
		super();
		this.id = id;
		this.name = name;
		this.subj = subj;
	}
	
	
	public void display() {
		System.out.println("Student1 [id=" + id + ", name=" + name + ", subj=" + Arrays.toString(subj) + "]");
	}

	public static int  calSum(int a[])
	{
		int sum=0;
		for (int i:a)
		{
			sum+=i;
		}
		return sum;
	}


	public static void main(String[] args)
	{
		
		String[] sub= {"english","kannada","maths","hindi","social","science"};
		Student1 s1=new Student1(101, "Raju", sub);
		s1.display();
		int [] a= {1,2,3,4,5};
		System.out.println("sum =>"+Student1.calSum(a));
		
	}
	
}
