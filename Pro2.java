import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		
		int count_Ovels=0;
		int count_consonants=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String s[]=str.split("");
		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i].equals("a") || s[i].equals("e") || s[i].equals("i") || s[i].equals("o") || s[i].equals("u") )
			{
				count_Ovels++;
			}
			else
			{
				count_consonants++;
			}
		}
		System.out.println("NUmber of Ovels"+count_Ovels);
		System.out.println("NUmber of consonants"+count_consonants++);
	}
}
