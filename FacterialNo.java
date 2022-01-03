
public class FacterialNo {

	public static int facterial(int no)
	{
		if(no==0)
		{
			return 1;
		}
		else
		{
			return no*facterial(no-1);
		}
	}
	public static void main(String[] args)
	{
		int fact=1;
		int number=4;
		
		fact=facterial(number);
		System.out.println("facterial :"+fact);
	}
}
