import java.util.Scanner;

public class PhonebookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opt=1;
		while(opt!=3)
		{
		System.out.println("1. Add new phone book entry\n" + 
				"2. Search name\n" + 
				"3. Quit.");
		
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter the Option");
		opt=sc.nextInt();
		
		PhoneBook pb=new PhoneBook();
		switch (opt) {
		case 1:
			System.out.println("Add the Phone Number");
			String no=sc.next();
			System.out.println("Add the Name");
			String name=sc1.next();
			pb.addDetails(no, name);
			break;

		case 2:
			System.out.println("Enter the phone Number to search");
			String nos=sc.next();
			String res=pb.getName(nos);
			System.out.println(res);
			break;
		case 3:
			break;
		default:
			break;
		}
		 
		}
	}

}
