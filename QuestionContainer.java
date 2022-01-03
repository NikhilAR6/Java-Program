import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionContainer {

	int ccount, wcount;
	private int cCount , wCount;
	private List<Question> list=new ArrayList<Question>();
	private Scanner sc = new Scanner(System.in);
	
	public void addQuestions()
	{
		Question q1 = new Question("Which of the following is not a Java features?" , "a. Dynamic" , "b. Architecture Neutral" , "c. Use of pointers" , "d. Object-oriented" , "c");
		
		Question q2 = new Question("Which is the return type for integer value?" , "a. int" , "b. String" , "c. boolean" , "d. void" , "a");
				
		Question q3 = new Question("The \\u0021 article referred to as a?" , "a. Unicode escape sequence" , "b. Octal escape" , "c. Hexadecimal" , "d. Line feed" , "a");
	
		Question q4 = new Question(" Which of the following is a valid long literal?" , "a. ABH8097" , "b. L990023" , "c. 0xnf029L " , "d. 12334" , "c");
	
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		
		
	
	}
	
	public void begintest()
	{
		String s;
		for(Question q : list)
		{
			System.out.println("\n"+q);
			System.out.println("\nEnter Your Answer ");
			s = sc.next();
			while(!s.equalsIgnoreCase("A") && !s.equalsIgnoreCase("B") && !s.equalsIgnoreCase("C") && !s.equalsIgnoreCase("D"))
			{
				System.out.println("\nEnter the Valid Option");
				s = sc.next();
			}
			if(s.equalsIgnoreCase(q.getAns()))
			{
				++cCount;
			}
			else
			{
				++wCount;
			}
		}
	}
	
	public void ShowResult()
	{
		System.out.println("\nTotal Questions : "+list.size());
		System.out.println("\nCorrect Answers :"+cCount);
		System.out.println("\nWrong Attempts :"+wCount);
		if((((double)cCount/list.size())*100) > 40.00)
			System.out.println("\nResult is : Pass");
		else
			System.out.println("\nResult is : Fail");
	}
}
