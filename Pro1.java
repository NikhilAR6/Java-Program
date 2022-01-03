import java.util.Scanner;

public class Pro1 {
public static void main(String[] args)
{
	System.out.print("Enter the String");
	Scanner sc= new Scanner(System.in);
	String str= sc.nextLine();
	System.out.println("length of the string is "+str.length());  
	System.out.println("Upper Case of the string is "+str.toUpperCase());
	System.out.println("Lower Case of the string is "+str.toLowerCase());
}
}
