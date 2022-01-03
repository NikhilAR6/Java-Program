import java.util.Scanner;

public class CurrencyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country name");
		String name=sc.next();
		
		CurrencyContainer.getCurrency(name).getCurrency(); 
		
		
		
	}

}
