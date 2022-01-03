import java.util.Scanner;

public class Pro3 {

	public void display(String f_name,String m_name,String l_name)
	{
		System.out.println(f_name+"-"+m_name+"-"+l_name);
		
	}
	public static void main(String[] args) {
		String firstName,middleName,lastName;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the firstName");
	    firstName=sc.nextLine();
	    
		System.out.println("Enter the middleName");
		middleName=sc.nextLine();
		
		System.out.println("Enter the lastName");
		lastName=sc.nextLine();
		Pro3 p=new Pro3();
		p.display(firstName,middleName,lastName);
		
	}
}
